/**
	 * @author aisiri
	 *    method withdraw is overrides the parent class to check for minimum balance and allow for withdraw
	 */
	
public class SavingsAccount extends Account {
	
     public SavingsAccount(long accnumber, double balance, Person accholder) {
		super(accnumber, balance, accholder);
	}

	final double minimum_balance=500;
   
     public void withdraw(double amount)
 	{  
    	if(getBalance()>minimum_balance)
    	{   double bal;
    		bal=getBalance()-amount;
    		setBalance(bal);
    	}
 	   else
 	   {
 		 System.out.println("Unable to WithDraw");
 		 System.exit(0);
 	   }
 	}
     
}
