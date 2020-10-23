
/**  Author name : AISIRI J
     date: 23/10/2020
     desc: testing compilation and running the main method of the demo of jagged array
*/import java.util.Scanner;

public class CarParking {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CarDetails obj1=new CarDetails();
		//-----------menu driven program---------------------
		while(true) {
			System.out.println("1. Park the Car");
			System.out.println("2. Get the Car");
			System.out.println("3.Check Available space");
			System.out.println("4.Exit");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			if(choice>4 && choice<1)
				System.out.println("Enter the valid choice");	
			switch(choice) {
			         
				case 1:System.out.println("Enter the owner name");
					   String name=sc.next();
			           System.out.println("Enter the registration number");
			           String registration_number=sc.next();
			           CarDetails obj=new CarDetails(name,registration_number);
				       obj1.addDetails(obj);
				       break;
				case 2:System.out.println("Enter the registration number");
				       String user_number=sc.next();
				       obj1.CheckForRegistrationNumber(user_number);
				       break;
				case 3: obj1.CheckAvailableSpace();
				        break;
				case 4: System.exit(0);
           }
		}
	}
}
