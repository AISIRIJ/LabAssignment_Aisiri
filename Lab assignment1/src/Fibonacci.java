/**  Author name : AISIRI J
     date: 21/10/2020
     desc: testing compliation and running of recusive fibonacci series
*/
import java.util.Scanner;

public class Fibonacci {
	static int n1 = 1, n2 = 1, n3 = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
	    int count =sc.nextInt();
	    System.out.print(n1 + " " + n2);
	    fibbonacci(count - 2);
			 
	}
	static void fibbonacci(int count) {
	      if (count > 0) {
	         n3 = n1 + n2;
	         n1 = n2;
	         n2 = n3;
	         System.out.print(" " + n3);
	         fibbonacci(count - 1);
	      }
	      
	     
	}
	

}
