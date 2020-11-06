import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author aisiri
 * desc: test compile and run  to accept the id and the date of birth of people as a Map and decide if they are eligible for vote.
 *
 */
public class VoteListMain {
	public static void main(String[] args) {
		Map<Long,String> input=new HashMap();
		VoteList v=new VoteList();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("1.Enter Voter Details");
			System.out.println("2.Display voter list");
			System.out.println("3.Exit");
			System.out.println("Enter the choice");
			int choice=sc.nextInt();
			switch(choice)
			{//---------get details of voters-----------------
			case 1:System.out.println("Enter voter id and date of birth(year/mm/dd)");
					long id=sc.nextLong();
					sc.nextLine();
					String dob=sc.nextLine();
					input.put(id,dob);
					break;
		  //----------display the eligible voter list-------------			
			case 2:	System.out.println("-------------VOTERS LIST----------");
					System.out.println(v.votersList(input));
			case 3:System.exit(0);
			
			}
		}
		
	}
}
