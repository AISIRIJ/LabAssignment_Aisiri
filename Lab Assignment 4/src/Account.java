public class Account {
	/**
	 * @author aisiri
	 *    account number which is auto generated 
	 */
	private long accnumber;
	/**
	 * @author aisiri
	 *  current balance in the account
	 */
	private double balance;
	/**
	 * @author aisiri
	 *    account holder name and age 
	 */
	private Person accholder;
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Account(long accnumber, double balance, Person accholder) {
		this.accnumber = accnumber;
		this.balance = balance;
		this.accholder = accholder;
	}
	public long getAccnumber() {
		return accnumber;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public Person getAccholder() {
		return accholder;
	}
	/**
	 * @author aisiri
	 *    deposit method add the amount to the balance and update
	 */
	
	public void deposit(double amount)
	{
		balance=balance+amount;
	}
	/**
	 * @author aisiri
	 *    withdraw method get the amount to the balance and update
	 */
	
	public void withdraw(double amount)
	{   
		balance=balance-amount;
	  
	}
}
