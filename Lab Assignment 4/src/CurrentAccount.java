public class CurrentAccount extends Account {

          public CurrentAccount(long accnumber, double balance, Person accholder) {
		super(accnumber, balance, accholder);
		
	}    
		final double overdraftlimit=100000;   
		/**
		 * @author aisiri
		 *    withdraw method is overloaded and checks for overdraft limit
		 */
		  
		public boolean withdraw()
      	  {  
         	if(overdraftlimit<getBalance())
         		return true;
      	   else
      		 return false;
      	  }
	     
}
