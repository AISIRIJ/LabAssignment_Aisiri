import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author aisiri
 * desc: test compile and run that displays the eligible students for scholarship
 *
 */
public class StudentMarkMain {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
				
			Map<Integer,String> result=new HashMap();
		 Map<Integer,Integer> studentDetails=new HashMap();
			while(true) {
				StudentMarks s= new StudentMarks();
				System.out.println("1.STUDENT DETAILS");
				System.out.println("2.DISPLAY DETAILS");
				System.out.println("3.EXIT");
				System.out.println("Enter the choice");
				int ch=sc.nextInt();
				sc.close();
				
			switch(ch)
			{	//----------------- get student details----------
			case 1: System.out.println("Enter the student details:");
				    System.out.println("Id:");
				    int id=sc.nextInt();
				    System.out.println("Marks");
				    int marks=sc.nextInt();
				    studentDetails.put(id,marks);
				    break;
			  //---------------	 display the eligible students--------------   
			case 2: System.out.println("----------------Student Details Eligiable for scholarship----------");
				    result=s.getStudents(studentDetails);
				    for(Map.Entry<Integer,String> i:result.entrySet())
						System.out.println("Student id:"+i.getKey()+" Medal:"+i.getValue());
					break;
			case 3: System.exit(0);
			}
		}
	}

}
