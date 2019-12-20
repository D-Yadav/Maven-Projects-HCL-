package com.hcl.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hcl.beans.Employ;
import com.hcl.dao.EmployDao;


@Controller  
public class EmployController {
	 @Autowired  
    EmployDao dao;

	  @RequestMapping("/employform")  
	    public String showform(Model m){  
	    	m.addAttribute("command", new Employ());
	    	return "employform"; 
	    }  
	  
	  /*It saves object into database. The @ModelAttribute puts request data 
	     *  into model object. You need to mention RequestMethod.POST method  
	     *  because default request is GET*/  
	    @RequestMapping(value="/save",method = RequestMethod.POST)  
	    public String save(@ModelAttribute("emp") Employ emp){  
	        dao.save(emp);  
	        return "redirect:/viewemploy";//will redirect to viewemp request mapping  
	    }  
	    /* It provides list of employees in model object */  
	    @RequestMapping("/viewemploy")  
	    public String viewemp(Model m){  
	        List<Employ> list=dao.getEmployees();  
	        m.addAttribute("list",list);
	        return "viewemploy";  
	    }  
	    /* It displays object data into form for the given id.  
	     * The @PathVariable puts URL data into variable.*/  
	    @RequestMapping(value="/editemploy/{id}")  
	    public String edit(@PathVariable int id, Model m){  
	        Employ emp=dao.getEmpById(id);  
	        m.addAttribute("command",emp);
	        return "employeditform";  
	    }  
	    /* It updates model object. */  
	    @RequestMapping(value="/editsave",method = RequestMethod.POST)  
	    public String editsave(@ModelAttribute("emp") Employ emp){  
	        dao.update(emp);  
	        return "redirect:/viewemploy";  
	    }  
	    /* It deletes record for the given id in URL and redirects to /viewemp */  
	    @RequestMapping(value="/deleteemploy/{id}",method = RequestMethod.GET)  
	    public String delete(@PathVariable int id){  
	        dao.delete(id);  
	        return "redirect:/viewemploy";  
	    }   
}
