package com.example.Employeedemo.EmployeeController;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Employeedemo.EmployeeService.EmpService;
import com.example.Employeedemo.EmployeeService.EmpServiceImpl;
import com.example.Employeedemo.EmployeeEntity.*;

@RestController

public class EmpController {
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(EmpServiceImpl.class);
	@Autowired 
	EmpServiceImpl Es;
	@GetMapping("/hello")

	String Welcome()
	{
		return "welcome";
	}
	
	@GetMapping("/GetEmployees")
	public List<EmpEntity>getEmployees()
	{
		return Es.getEmployees();
	}
	
	@RequestMapping(value="/CreateEmployee",method=RequestMethod.POST,produces= "application/json")
	public EmpEntity createEmployee(@RequestBody EmpEntity e)
	{
		try
		{
			logger.info("received request for createemployee in controller",e);
			Es.createEmployee(e);
			return e;
			//logger.info("sent empentity to srvice",e);
		}
		catch(Exception ee)
		{
		logger.error("Error sending employee to service", ee);
        throw new RuntimeException("Error sending employee", ee);
		}
		
		
	}
	
	@DeleteMapping("/DeleteEmployee/{id}")
	public void deleteEmployee(@PathVariable(value="id") Integer Id)
	{
		Es.deleteEmployee(Id);
		
		
		
		
}	
		
		
}