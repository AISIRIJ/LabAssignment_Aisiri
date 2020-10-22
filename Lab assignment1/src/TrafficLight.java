
/**  Author name : AISIRI J
     date: 21/10/2020
     desc: testing compliation and running to display traffic light
*/import java.util.Scanner;

public class TrafficLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("1.RED \n2.YELLOW \n3.GREEN");
	     System.out.println("Enter our choice");
		int choice=sc.nextInt();
		System.out.println(SelectTraffic(choice));
		
	}
	 private static String SelectTraffic(int choice)
	 {
		 String result="";
		 if(choice==1)
			 result="STOP";
		 else if(choice==2)
			 result="READY";
		 else if(choice==3)
			 result="GO";
		 else
			 result="INVALID CHOICE";
		 
		 return result;
	 }

}
