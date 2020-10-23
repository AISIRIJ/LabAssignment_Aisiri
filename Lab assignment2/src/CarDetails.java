/**  Author name : AISIRI J
     date: 23/10/2020
     desc: testing compilation and running the demo of jagged array program
*/
public class CarDetails {

	private String name;
	private String registration_number;
    CarDetails parking[][]=new CarDetails[5][];{
    parking[0]=new CarDetails[4];
    parking[1]=new CarDetails[3];
    parking[2]=new CarDetails[2];
    parking[3]=new CarDetails[2];
    parking[4]=new CarDetails[1];}
    public CarDetails() {
		
	}
    //---------------constructor-------------------
	public CarDetails(String name, String registration_number) {
		
		this.name = name;
		this.registration_number = registration_number;
	}
	public String getName() {    
		return name;
	}
	public String getRegistrationnumber(){
		return registration_number;
	}
	//-----------------method to park car--------------------
	public void addDetails(CarDetails obj)
	{   int count=0;
		for(int i=0;i<parking.length;i++) {
	    	 for(int j=0;j<parking[i].length;j++) {
	    		 if(parking[i][j]==null) {
	    		   parking[i][j]=obj; 
	    		   count++;
	    		   break;
	    		 }	
	    	   }
	    	 if(count!=0)
	    		  break; 
	    	 else
	    		 continue;
	       }  
	}
	//------------------method to get car--------------------
	public void CheckForRegistrationNumber(String user_number)
	{ 
		for(int i=0;i<parking.length;i++) {
	    	   for(int j=0;j<parking[i].length;j++) {
	    		   
	    		   if(user_number.equalsIgnoreCase(parking[i][j].getRegistrationnumber()))
	    		   {
	    			   parking[i][j]=null;
	    		       break;
	    		   }
	    	   } 
	    	   break;
	       } 
	}
	//-----------------------method to check the available place-------------
	public void CheckAvailableSpace()
	{
		for(int i=0;i<parking.length;i++) {
            int count=0;
	   		for(int j=0;j<parking[i].length;j++) {
	   			if(parking[i][j]==null)
	   				count++;
	       }
	   		System.out.println("The avaible space in "+i+" story is "+count);
         } 
	}
	

}
