/**  Author name : AISIRI J
     date: 21/10/2020
     desc: testing compliation and running to calculate the difference between sum of square ofnatural number and square of their sum 
*/
import java.util.Scanner;

public class CalculateDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculateDifference obj = new CalculateDifference(); 
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Difference between the sum of the squares of the first "+n+" natural numbers and the square of their sum is "+obj.calculatedifference(n));
		
	}

	private  int calculatedifference(int n)
	{
		int Sum=0;
		int result1=0;
		int result2=0;
		for(int i=1;i<=n;i++)
		{
			result1=result1+i*i;
			result2=result2+i;
		}
		int result=result2*result2;
		Sum= result1-result;
		return Sum;
		
	}
}
