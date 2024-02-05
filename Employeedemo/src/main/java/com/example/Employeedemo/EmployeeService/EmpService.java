package com.example.Employeedemo.EmployeeService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Employeedemo.EmployeeEntity.*;
public interface EmpService {
	
		
		public void createEmployee(EmpEntity e);
		public List<EmpEntity> getEmployees();
		//public EmpEntyti getEmployeeById(int id);
		public void deleteEmployee(Integer Id);
		
			


	}
