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
import com.pack.form.Patient;
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

	@RequestMapping(value="/patient/enroll",method=RequestMethod.POST)
	public String enrollpatient(@ModelAttribute("patient")@Validated Patient patient,BindingResult bindingResult,Model model){
		if(bindingResult.hasErrors())
		{
			log.info("Validation error");
			return "patient";
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
				hospitalService.enrollpatient(patient);
			}

			return "redirect";
		}
	}
	
}
