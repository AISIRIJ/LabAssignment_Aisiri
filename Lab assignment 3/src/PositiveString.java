/**  Author name : AISIRI J
     date: 24/10/2020
     desc: testing compilation and running that checks for positive string(A string is considered a positive string, if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order)
*/
import java.util.*;

public class PositiveString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String input=sc.next().toLowerCase();
		if(CheckString(input).equals(input))
				System.out.println(input+" is positive String");
		else
			System.out.println(input+" is negative String");
			
	}	
	//---------------method that sorts the String and check with the original string if both are equal it is a positive string---------
	public static String CheckString(String input)
	{
		char array[]=input.toCharArray();
		Arrays.sort(array);
		String result=String.valueOf(array);
		return result;
	}
}


