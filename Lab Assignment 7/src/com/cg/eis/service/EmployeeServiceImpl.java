package com.cg.eis.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.cg.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService{

	
	Map<Integer,Employee> employee=new HashMap<>();
	@Override
	public void addEmployee(int id,Employee emp) {
		employee.put(id, emp);
		
	}
	@Override
	public String SetScheme(double salary, String designation) {
	
		if(salary>5000 && salary<20000 && designation.equalsIgnoreCase("SystemAssociate"))
			return "SchemeC";
		else if(salary>=20000 && salary<40000 && designation.equalsIgnoreCase("Programmer"))
			return "SchemeB";
		else if(salary>=40000  && designation.equalsIgnoreCase("Manager"))
			return "SchemeA";
		else if(salary<5000  && designation.equalsIgnoreCase("Clerk"))
			return "NoScheme";
		else
			return "Invalid";
	}

	@Override
	public List<Employee> getDetailsByScheme(String insuranceScheme) {
		List<Employee> listbyScheme=new ArrayList<>();
		for(Map.Entry<Integer, Employee> i:employee.entrySet()) {
			System.out.println(i.getValue().getInsuranceScheme());
			if(i.getValue().getInsuranceScheme().equalsIgnoreCase(insuranceScheme))
				listbyScheme.add(i.getValue());	
		}
		return listbyScheme;
	}

	@Override
	public void deleteEmployee(int id) {
		employee.remove(id);
	}

}
