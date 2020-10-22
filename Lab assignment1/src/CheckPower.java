/**  Author name : AISIRI J
     date: 21/10/2020
     desc: testing compliation and running to check the number is a power of 2
*/
import java.util.Scanner;

public class CheckPower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		boolean answer=checknumber(n);
		if(answer==true)
		System.out.println(n+" is a power of 2");
		else
			System.out.println(n+" is not a power of 2");
	}
	private static boolean checknumber(int n)
	{
		if(n==0)
			return false;
		while(n!=1)
		{
			if(n%2!=0)
				return false;
			n=n/2;
		}
		return true;
		
	}

}
