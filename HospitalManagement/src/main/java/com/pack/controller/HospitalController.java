package com.pack.controller;

import java.util.Map;
import java.util.Random;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pack.form.Login;
import com.pack.form.Login1;
import com.pack.form.Patient;
import com.pack.form.Physician;
import com.pack.service.HospitalService;

@Controller
public class HospitalController {
	private static Logger log=Logger.getLogger(HospitalController.class);
	private HospitalService hospitalService;
	
	@Autowired(required=true)
	@Qualifier(value="hospitalService")
	public void setHospitalService(HospitalService hospitalService) {
		this.hospitalService = hospitalService;
	}
	
	@RequestMapping(value="/login")
	public String login(Map<String,Object> map){
		map.put("login", new Patient());
		return "login";
	}
	
	
	@RequestMapping(value="/checkLogin")
	public String checklogin(@ModelAttribute("login")@Validated Login login,BindingResult bindingResult)
	{
	String s="";
		if(bindingResult.hasErrors())
		{
			log.info("Validation error");
			s="login";
			
		}
		else
		{
			boolean b=hospitalService.checkLogin(login);
			if(b==true){
			s="success";}
			else
				s="login";
		}
		return s;
	}
	
	@RequestMapping(value="/newuser")
	public String newUserRegisteration(Map<String,Object> map){
		map.put("patient", new Patient());
		return "patient";
	}

	@RequestMapping(value="enroll",method=RequestMethod.POST)
	public String enrollpatient(@ModelAttribute("patient")@Validated Patient patient,BindingResult bindingResult,Map<String,Integer> map){
		String result="";
		if(bindingResult.hasErrors())
		{
			log.info("Validation error");
			result="patient";
		}
		else
		{
			log.info("Inside add patient");
			if(null==patient.getPno())
			{
				Random rand=new Random();
				int num=rand.nextInt(900000)+1000000;
				patient.setPno(num);
				log.info("Before add customer");
				Integer patientId=hospitalService.enrollpatient(patient);
				map.put("patId", patientId);
				result="patientSuccess";
			}

			
		}
		return result;
	}

	@RequestMapping(value="/search")
	public String success(Map<String,Object> map){
		map.put("search", new Physician());
		
		return "search";
	}

	@RequestMapping(value="/show")
	public String showphysician(@ModelAttribute("physician")@Validated Physician physician,BindingResult bindingResult,Map<String,String> map) {
		
		Physician b=hospitalService.showphysician(physician);
		map.put("fName", b.getFirstName());
		map.put("lName", b.getLastName());
		map.put("dept", b.getDept());
		map.put("educationalQualification", b.getEducationalQualification());
		map.put("state", b.getState());
		map.put("insurancePlan", b.getInsurancePlan());
		return "search";
		
	}
	
	@RequestMapping(value="/login1")
	public String login1(Map<String,Object> map){
		map.put("login1", new Physician());
		return "login1";
	}
	@RequestMapping(value="/checkLogin1")
	public String checklogin1(@ModelAttribute("login1")@Validated Login1 login1,BindingResult bindingResult)
	{
	String s="";
		if(bindingResult.hasErrors())
		{
			log.info("Validation error");
			s="login1";
			
		}
		else
		{
			boolean b=hospitalService.checkLogin1(login1);
			if(b==true){
			s="success";}
			else
				s="login1";
		}
		return s;
	}
	@RequestMapping(value="/newuser1")
	public String newUserRegisteration1(Map<String,Object> map){
		map.put("physician", new Physician());
		return "physician";
	}
	@RequestMapping(value="enroll1",method=RequestMethod.POST)
	public String enrollphysician(@ModelAttribute("physician")@Validated Physician Physician,BindingResult bindingResult,Map<String,Integer> map){
		String result="";
		if(bindingResult.hasErrors())
		{
			log.info("Validation error");
			result="physician";
		}
		else
		{
			log.info("Inside add physician");
			if(null==Physician.getphyNo())
			{
				Random rand=new Random();
				int num=rand.nextInt(900000)+1000000;
				Physician.setphyNo(num);
				log.info("Before add physician");
				Integer physicianId=hospitalService.enrollphysician(Physician);
				map.put("phyId", physicianId);
				result="physicianSuccess";
			}

			
		}
		return result;
	}
}
