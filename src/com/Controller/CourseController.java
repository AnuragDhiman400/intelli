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
import com.Dao.StudentDao;

@Controller
public class CourseController {
	
	@Autowired
	StudentDao cour;
	
	

	    @RequestMapping(value = { "/" })
	    public String homePage() {
	        return "landing";
	    }

	
	
	
    @RequestMapping("/view/html/jsp/courseData")
		public String CourseData(Model m)
		{
			List<Courses> course = cour.getCourses();
			m.addAttribute("list", course);
			return "courseData";
			
		}
    
    @RequestMapping(value="/editCourse/{courseCode}", method=RequestMethod.GET)    
    public String edit(@PathVariable("courseCode") String courseCode, Model m){    
	 Courses cor=cour.getCourseById(courseCode);
        m.addAttribute("command",cor);  
        return "courseInfo";    
    } 
    
    @RequestMapping(value="/editcourse",method = RequestMethod.POST)    
    public String editcourse(@ModelAttribute("cust") Courses cust){    
        cour.updateCourse(cust);   
        
        return "redirect:/view/html/jsp/courseData";    
    } 
	    

}
