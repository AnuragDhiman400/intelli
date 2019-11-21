package com.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Dao.StudentDao;

import com.Beans.ApplicationForm;
import com.Beans.questionnaire;
@Controller  
public class FormController {
    	@Autowired  
    	StudentDao dao;
    	
    	@RequestMapping("/view/html/jsp/applicationForm")  
        public String showform(Model m){  
        	m.addAttribute("command", new ApplicationForm());
        	return "applicationForm"; 
        }
    	
    	
        @RequestMapping(value="/appsave",method = RequestMethod.POST)  
        public String save(@ModelAttribute("app") ApplicationForm app){  
        	System.out.println("going to dao");
            dao.save(app);  
            System.out.print("saved");
            return "redirect:/view/html/jsp/applicationForm";//will redirect to viewemp request mapping 
            //System.out.println("going to application form");
        }  
       
        @RequestMapping("/view/html/jsp/applicationForm")    
        public String viewemp(Model m){    
            List<questionnaire> list=dao.getQues();    
            m.addAttribute("list",list);  
            return "applicationForm";    
        }    
}
