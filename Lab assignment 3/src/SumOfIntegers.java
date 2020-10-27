/**  Author name : AISIRI J
     date: 24/10/2020
     desc: testing compilation and running that reads a line of integers and compute the sum of all integers
*/
import java.util.Scanner;

public class SumOfIntegers {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the numbers");
		String input=in.next();
		String array[]=input.split(",");
		int sum=0;
		 for(String str:array)
		 {
			 sum+=Integer.parseInt(str);
		 }
      System.out.println("Sum of the Integers: "+sum);
	}

}
