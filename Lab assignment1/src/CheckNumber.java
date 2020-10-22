/**  Author name : AISIRI J
     date: 21/10/2020
     desc: testing compliation and running to check wheather the number is in increasing order
*/
import java.util.Scanner;

public class CheckNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		boolean result=checknumber(number);
		if(result== true)
			System.out.println(number+" is an increasing number ");
		else
			System.out.println(number+" is not an increasing number ");
		
	}
	public static boolean checknumber(int number)
	{   int i=0;
	    int count=0;
		int array[]=new int [20];
		
		while(number!=0)
		{
			int n=number%10;
			 array[i]=n;
			 number=number/10;
			 i++;
			 count++;
		}
		for(int j=0;j<count;j++)
		{
			if(array[j]>=array[j+1])
				continue;
			else
				return false;
		}
		  return true;
	}

}
