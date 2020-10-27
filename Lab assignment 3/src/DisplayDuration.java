/**  Author name : AISIRI J
     date: 24/10/2020
     desc: testing compilation and running and print the duration in days, months and years with regards to current system date.
*/import java.time.*;
import java.util.*;
public class DisplayDuration {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the year");
		int year=sc.nextInt();
		System.out.println("Enter the month");
		int month=sc.nextInt();
		System.out.println("Enter the day");
		int date=sc.nextInt();
		LocalDate pdate = LocalDate.of(year,month,date);
        LocalDate now = LocalDate.now();
        Period diff = Period.between(now,pdate);
 
     System.out.printf("\nDifference between "+pdate+" and "+now+" %d years, %d months and %d days old\n\n", 
                    diff.getYears(), diff.getMonths(), diff.getDays());
	}

}
