package com.cg.eis.bean;

/**
 * @author aisiri
 * 
 * This Employee Component is used as a data travler object from layer to layer
 */

public class Employee {
	/**
	 * @author aisiri
	 *   id of the employee
	 */
	private int id;
	/**
	 * @author aisiri
	 *  name of the Employee
	 */
	private String name;
	/**
	 * @author aisiri
	 *  designation of the Employee must be either analyst,trainer or manager
	 */
	private String designation;
	/**
	 * @author aisiri
	 *  Insurance scheme of the Employee
	 */
	private String insuranceScheme;
	/**
	 * @author aisiri
	 *  salary of the Employee
	 */
	private double salary;
	public Employee(int id, String name, String designation,  double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	public Employee() {
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	 
}
