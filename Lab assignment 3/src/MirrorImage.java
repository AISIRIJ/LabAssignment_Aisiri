/**  Author name : AISIRI J
     date: 24/10/2020
     desc: testing compilation and running the the mirror image of a String. 
*/
import java.util.Scanner;

public class MirrorImage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input");
		String input=sc.next();
	    System.out.println(input+"|"+getImage(input));
	}
	//------------method returns the mirror image using reverse()
	    public static String getImage(String input) {
		StringBuffer sb=new StringBuffer(input);
	    String result=sb.reverse().toString();
		return result;
		

	}

}