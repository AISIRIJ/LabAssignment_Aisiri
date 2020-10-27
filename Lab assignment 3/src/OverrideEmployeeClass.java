/**  Author name : AISIRI J
     date: 24/10/2020
     desc: testing compilation and running that checks whether employee class objects contains equal values by overriding equals method.
*/
class EmployeeClass {
	//----------private Employee class attributes---------
	private String EmpName;
	private String Empdesignation;
	public EmployeeClass(String EmpName,String Empdesignation)
	{
		this.EmpName=EmpName;
		this.Empdesignation=Empdesignation;
		
	}
	public boolean equals(Object obj)
	{
		//-------checks whether obj is a object of EmployeeClass---------------
		if (!(obj instanceof EmployeeClass)) 
		{ 
            return false; 
        } 
		EmployeeClass ec=(EmployeeClass) obj;
		//-------------Compares both the objects value---------------------
		return EmpName.compareTo(ec.EmpName)==0 &&Empdesignation.compareTo(ec.Empdesignation)==0 ;
		
	}

}
public class OverrideEmployeeClass{
         public static void main(String[] args) {
         EmployeeClass emp=new EmployeeClass("aisiri", "Trainee");
       	 EmployeeClass emp2=new EmployeeClass("abc","Trainer");
    	 EmployeeClass emp3=new EmployeeClass("xyz","HR");
    	 EmployeeClass emp4=new EmployeeClass("aisiri", "Trainee");
    	 if(emp.equals(emp4))
    	 {
    		 System.out.println("Same Employee");
    	 }
    	 else
    	 {
    		 System.out.println("Employees are not same");
    	 }
}
}
