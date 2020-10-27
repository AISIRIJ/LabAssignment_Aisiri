/**  Author name : AISIRI J
     date: 24/10/2020
     desc: testing compilation and running that return the command from the given url
*/
import java.util.Scanner;

public class SplitDemo {

	public static void main(String[] args) {
		System.out.println("Enter the URL");
		Scanner sc=new Scanner(System.in);
		String url=sc.nextLine();
		System.out.println("Command inside the url is : "+getCommand(url));
		
	}
	//-------------method that returns a command using split()-----------------
    public static String getCommand(String url)
    {
    	String temp[]=url.split("/");
    	String command=temp[temp.length-1];
    	String result[]=command.split("\\.");
    	return result[0];
    }
}
