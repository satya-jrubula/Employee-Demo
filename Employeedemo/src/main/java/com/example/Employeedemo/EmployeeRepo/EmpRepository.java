package com.example.Employeedemo.EmployeeRepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.example.Employeedemo.EmployeeEntity.EmpEntity;

import jakarta.persistence.Id;
@Component
public interface EmpRepository extends JpaRepository<EmpEntity,Integer>{

}
