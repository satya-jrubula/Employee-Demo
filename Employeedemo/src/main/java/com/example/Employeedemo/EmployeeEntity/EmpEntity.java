package com.example.Employeedemo.EmployeeEntity;

import org.antlr.v4.runtime.misc.NotNull;

import jakarta.persistence.Column;
	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Table;
	import jakarta.persistence.Id;

	
	@Entity
	@Table(name="empentity")


	public class EmpEntity {
		public EmpEntity() {
			//super();
		}
//		public EmpEntity(Integer id, String firstname, String lastname, String email) {
//			//super();
//			Id = id;
//			Firstname = firstname;
//			Lastname = lastname;
//			Email = email;
//		}
		@Override
		public String toString() {
			return "Employee [Id=" + Id + ", Firstname=" + Firstname + ", Lastname=" + Lastname + ", Email=" + Email + "]";
		}
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="emp_id")
		private Integer Id;
		@Column(name="First_name")
		@NotNull
		private String Firstname;
		
		@Column(name="Last_name")
		@NotNull
		private String Lastname;
		
		@Column(name="Email")
		@NotNull
		private String Email;
		
		public Integer getId() {
			return Id;
		}
		public void setId(Integer id) {
			Id = id;
		}
		public String getFirstname() {
			return Firstname;
		}
		public void setFirstname(String firstname) {
			Firstname = firstname;
		}
		public String getLastname() {
			return Lastname;
		}
		public void setLastname(String lastname) {
			Lastname = lastname;
		}
		public String getEmail() {
			return Email;
		}
		public void setEmail(String email) {
			Email = email;
		}
		
		

	}



