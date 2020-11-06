package com.cg.eis.service;

import java.util.List;

import com.cg.eis.bean.Employee;

public interface EmployeeService {
	/**
     * method that adds id as key and employee details as value to the hashmap
     *
     */
	public void addEmployee(int id,Employee emp);
	/**
     * returns a medical scheme assigned for an employee based on salary and designation
     *
     */
	public String SetScheme(double salary,String designation);
	/**
     * returns the list of employees having the same insurance scheme
     *
     */
	public List<Employee>  getDetailsByScheme(String insuranceScheme);
	/**
     * removes the employee from the hashmap based on key 
     *
     */
	public void deleteEmployee(int id);
}
