import java.time.LocalDate;
import java.time.Period;
import java.util.*;

/**
 * @author aisiri
 * desc: method to generate the list of voters based on the ages of the people 
 *
 */
public class VoteList {

	
   public List<Long> votersList(Map<Long, String> voterDetails)
   {
	   List<Long> votlist=new ArrayList();
       for(Map.Entry<Long,String> i:voterDetails.entrySet()) {
    	String arr[] =i.getValue().split("/");
    	   LocalDate pdate = LocalDate.of(Integer.parseInt(arr[0]),Integer.parseInt(arr[1]) ,Integer.parseInt(arr[2]));
           LocalDate now = LocalDate.now();
           Period diff = Period.between(pdate,now);
    	   if(diff.getYears()>=18)
    		   votlist.add(i.getKey());
       }
       return votlist;
   }
}
