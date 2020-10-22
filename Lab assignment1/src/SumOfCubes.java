/**  Author name : AISIRI J
     date: 21/10/2020
     desc: testing compliation and running of sum of cubes
*/
import java.util.*;
public class SumOfCubes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the number");
       int num=sc.nextInt();
       System.out.println("The sum of cubes of digits is "+sumcubes(num));
	}
   private  static int sumcubes(int n)
   { 
	   int sum=0;
	   while(n!=0)
	   {
		   int digit=n%10;
		   sum=sum+(digit*digit*digit);
		   n=n/10;
	   }
	   return sum;
   }
}
