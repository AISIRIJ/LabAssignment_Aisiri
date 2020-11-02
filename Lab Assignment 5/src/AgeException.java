import java.util.*;
public class AgeException {
  public static void main (String args[]) throws InvalidAgeException
  { 
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the age:");
	  int age=sc.nextInt();
	  try {
	  if(age<=15) 
		  throw new InvalidAgeException("In valid age");
	  else
		  System.out.println("your Age is:"+age);
	  }
	  catch(InvalidAgeException e)
	  {
		  System.out.println(e.getMessage());
	  }
  }
}
