package com.example.Employeedemo.EmployeeService;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Employeedemo.EmployeeRepo.*;


import com.example.Employeedemo.EmployeeEntity.*;
@Component
public class EmpServiceImpl implements EmpService {

	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(EmpServiceImpl.class);
	@Autowired
	EmpRepository ep;
	public List<EmpEntity> getEmployees()
	{
//		List<Employee> Emps= new ArrayList();
//		Emps= ep.findAll();
//		return Emps;
		return ep.findAll();
	}
	public void createEmployee(@RequestBody EmpEntity e)
	{
		 try {
	            // Log incoming data
	            logger.info("Received request to create employee in service: {}", e);

	            // Save to the database
	            ep.save(e);

	            // Log success
	            logger.info("Employee created successfully in service");
	        } catch (Exception ee) {
	            // Log any exceptions
	            logger.error("Error creating employee in service", ee);
	            throw new RuntimeException("Error creating employee", ee);
	        }
	    }
		
	public void deleteEmployee(Integer Id)
	{
		ep.deleteById(Id);
	}
	}


