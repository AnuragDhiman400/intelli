package com.Controller;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Beans.ApplicationForm;
import com.Beans.questionnaire;
import com.dao.CommonDao;


@Controller
public class FormController {
	
	 
	    
	    
	    
	@Autowired
	CommonDao dao;

	@RequestMapping("/view/html/jsp/applicationForm")
	public String showform(Model m) {
		m.addAttribute("command", new ApplicationForm());
		return "applicationForm";
	}

	@RequestMapping(value = "/appsave", method = RequestMethod.POST)
	public String save(@ModelAttribute("app") ApplicationForm app) {
		System.out.println("going to dao");
		dao.save(app);
		System.out.print("saved");
		return "redirect:/view/html/jsp/applicationForm";// will redirect to viewemp request mapping
		// System.out.println("going to application form");
	}

	/*
	 * @RequestMapping("/applicationForm") public String viewemp(Model m){
	 * List<questionnaire> list=dao.getQues(); m.addAttribute("list",list); return
	 * "redirect:/view/html/jsp/applicationForm"; }
	 */

	@RequestMapping(value="/blank",method = RequestMethod.GET)    
    public String viewemp(Model m){    
        List<questionnaire> list=dao.getQues();  
        m.addAttribute("list",list);  
        return "applicationForm";    
    }    

}
