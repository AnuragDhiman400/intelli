package com.Controller;

import java.util.List;
import java.util.Map;

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
public class StudentController {
	@Autowired
	StudentDao cus;
	

	
	@RequestMapping("/view/html/jsp/studentData")
	public String CustomerData(Model m)
	{
		List<Students> list = cus.getStudents();
		m.addAttribute("list", list);
		 
		return "studentData";
		
	}
	
	 @RequestMapping(value="/editStudent/{studentMatNo}", method=RequestMethod.GET)    
	    public String edit(@PathVariable("studentMatNo") String studentMatNo, Model m){    
		 Students cust=cus.getEmpById(studentMatNo);    
	        m.addAttribute("command",cust);  
	        return "edit";    
	    }   
	   @RequestMapping(value="/editsave",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("cust") Students cust){    
	        cus.update(cust);    
	       
	        return "redirect:/view/html/jsp/studentData";    
	    }  

	    @RequestMapping(value="/deleteStudent/{studentMatNo}",method = RequestMethod.GET)    
	    public String delete(@PathVariable String studentMatNo){    
	        cus.delete(studentMatNo);    
	        return "redirect:/view/html/jsp/studentData";    
	    }
	    
	    
	
	
	    
}
