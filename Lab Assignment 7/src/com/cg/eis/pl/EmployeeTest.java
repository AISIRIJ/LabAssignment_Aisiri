package com.cg.eis.pl;

import java.util.*;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;

/**
 * @author aisiri
 * menu driven program that performs employee service operations
 *
 */
public class EmployeeTest {

	Scanner sc=new Scanner(System.in);
	public void EmployeeDetails() {
		EmployeeServiceImpl es=new EmployeeServiceImpl();
		while(true) {
	System.out.println("1.Add Employee details");
     System.out.println("2.Display Employee Details based on Insurance Scheme");
     System.out.println("3.Delete an employee");
     System.out.println("exit");
     System.out.println("Enter your choice:");
     int choice=sc.nextInt();
     switch(choice){
   //-------------get details of employee and add to the map-----------------  
     case 1: System.out.println("Enter the employee id:");
             int id=sc.nextInt();
             System.out.println("Enter the employee name:");
             String name=sc.next();
             System.out.println("Enter the employee salary");
             double salary=sc.nextDouble();
             System.out.println("Enter the employee designation");
             String designation=sc.next();
             String scheme= es.SetScheme(salary, designation);
             Employee obj=new Employee(id,name,salary,designation,scheme);
             es.addEmployee(id,obj);
             break;
    //----------------Accept insurance scheme from user and display employee details based on Insurance scheme. ----------        
     case 2: System.out.println("Enter the insurance scheme");
     		 String inscheme=sc.next(); 
     		List<Employee> schemelist= es.getDetailsByScheme(inscheme);
     		System.out.println("----------------Employee list with "+inscheme.toUpperCase()+"--------------");
     		System.out.println(schemelist);
     		break;
    //---------------Delete an employee details from map------------------
     case 3:System.out.println("Enter the employee id to be deleted");
     		int deleteid=sc.nextInt();
     		es.deleteEmployee(deleteid);
     		break;
     case 4:System.exit(0);		
     }
		}
	}
}
