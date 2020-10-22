/**  Author name : AISIRI J
     date: 21/10/2020
     desc: testing compliation and running of sum of natural number divisible by 3 or 5
*/
import java.util.Scanner;

public class CalculateSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		System.out.println("Sum of "+n+" natural numbers which are divisble by 3 or 5 is "+calculatesum(n));
	}
	private static int calculatesum(int n)
	{   int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		return sum;
	}

}
