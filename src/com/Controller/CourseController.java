package com.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Beans.Courses;
import com.Beans.Students;
//import com.dao.commonDao;
import com.service.serviceInterace;

@Controller
public class CourseController {
	
	@Autowired
	serviceInterace service;
	//service interface
	
	

	    @RequestMapping(value = { "/" })
	    public String homePage() {
	        return "landing";
	    }

	
	
	
    @RequestMapping("/view/html/jsp/courseData")
		public String CourseData(Model m)
		{
			List<Courses> course = service.getCourses();
			m.addAttribute("list", course);
			return "courseData";
			
		}
    
    @RequestMapping(value="/editCourse/{courseCode}", method=RequestMethod.GET)    
    public String edit(@PathVariable("courseCode") String courseCode, Model m){    
	 Courses cor=service.getCourseById(courseCode);
        m.addAttribute("command",cor);  
        return "courseInfo";    
    } 
    
    @RequestMapping(value="/editcourse",method = RequestMethod.POST)    
    public String editcourse(@ModelAttribute("cust") Courses cust){    
    	service.updateCourse(cust);   
        
        return "redirect:/view/html/jsp/courseData";    
    } 
	    

}
