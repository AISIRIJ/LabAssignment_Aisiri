package com.cg.eis.exception;

import java.util.Scanner;

public class EmployeeException {

	public void checkSalary(double salary) throws  InvalidSalaryException {
		
		  if(salary<3000) 
			  throw new InvalidSalaryException("Salary of an employee is below 3000 ");
		  else
			  System.out.println("Salary of an employee is :"+salary);
		  }
		  

	}


