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

import com.Beans.Customers;
import com.Dao.CustomerDao;  

@Controller
public class Customer_Controller {
	@Autowired
	CustomerDao cus;
	

	
	@RequestMapping("/view/html/jsp/customer")
	public String CustomerData(Model m)
	{
		List<Customers> list = cus.getCustomers();
		m.addAttribute("list", list);
		return "customer";
		
	}
	
	
	
	

	 @RequestMapping(value="/editemp/{studentMatNo}", method=RequestMethod.GET)    
	    public String edit(@PathVariable("studentMatNo") String studentMatNo, Model m){    
		 Customers cust=cus.getEmpById(studentMatNo);    
	        m.addAttribute("command",cust);  
	        return "edit";    
	    }   
	   @RequestMapping(value="/editsave",method = RequestMethod.POST)    
	    public String editsave(@ModelAttribute("cust") Customers cust){    
	        cus.update(cust);    
	        return "redirect:/customer";    
	    }  

	    @RequestMapping(value="/deleteemp/{studentMatNo}",method = RequestMethod.GET)    
	    public String delete(@PathVariable String studentMatNo){    
	        cus.delete(studentMatNo);    
	        return "redirect:/customer";    
	    }
	    
	    
}
