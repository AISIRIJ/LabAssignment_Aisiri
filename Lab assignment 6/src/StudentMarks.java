import java.util.HashMap;
import java.util.Map;

/**
 * @author aisiri
 * method to generate the list of students eligible for scholarship 
 *
 */
public class StudentMarks {
	public Map<Integer,String> getStudents(Map<Integer, Integer> studentDetails)
	{
		Map<Integer,String> student=new HashMap();
		for(Map.Entry<Integer,Integer> i:studentDetails.entrySet())
		{
			if(i.getValue()>=90)
				student.put(i.getKey(),"Gold");
			else if(i.getValue()<90 && i.getValue()>=80)
				student.put(i.getKey(),"Silver");
			else if(i.getValue()<80 && i.getValue()>=70)
				student.put(i.getKey(),"Bronze");	
		}	
		return student;
		
	}

}
