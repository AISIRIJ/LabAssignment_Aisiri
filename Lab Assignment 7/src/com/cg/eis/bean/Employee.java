package com.cg.eis.bean;

public class Employee {

/**
 * employee id
 *
 */
    private int id;;
    /**
     * employee name
     *
     */
    private String name;
    /**
     * employee salary
     *
     */
    private double salary;
    /**
     * employee designation
     *
     */
    private String designation;
    /**
     * employee insurance scheme
     *
     */
    private String insuranceScheme;
    
	public Employee(int id,String name, double salary, String designation,String scheme) {
		this.id=id;
		this.name = name;
		this.salary = salary;
		this.designation = designation;
		this.insuranceScheme=scheme;
		
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public String getDesignation() {
		return designation;
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}
	@Override
	public String toString() {
		return " \n[id=" + id + ", name=" + name + ", salary=" + salary + ", designation=" + designation+ "]";
	}
    
    
}
