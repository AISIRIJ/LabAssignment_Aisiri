import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		prime(number);
	}
	private static void prime(int number)
	{  
		System.out.println("The prime numbers until "+number+" is ");
		int count;
		for(int i=1;i<=number;i++)
		{
			count=0;
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
					count++;
					break;
				}
			}
			if(count==0 && i!=1)
				System.out.print(i+" ");
		}
		
		
	}

}
