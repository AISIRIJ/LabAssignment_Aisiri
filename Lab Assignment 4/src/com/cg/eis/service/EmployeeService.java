package com.cg.eis.service;

import com.cg.eis.bean.Employee;
/**
 * @author aisiri
 *  The EmployeeService will perform the business logic like get the details of employee, get the available insurance
 *  scheme and displays all the details of an employee 
 */
public interface EmployeeService {
	/**
	 * @author aisiri
	 *  The getDetials will return the Employee Details 
	 */
	public Employee getDetails();
	/**
	 * @author aisiri
	 *  The getScheme method returns the available scheme based on salary and designation
	 */
  public String getScheme(double salary,String designation);
  /**
	 * @author aisiri
	 *  The displayDetails will display  the Employee Details 
	 */
  public void DisplayDetails(Employee e);
}
