import java.util.*;

/**
 * @author LENOVO
 *desc : test compile and run to accept a hash map and return the values of the map in sorted order as a List.
 */

public class HashMapDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Map<Integer,String> input=new HashMap();
		System.out.println("Enter the number of input:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the key string");
			int key=sc.nextInt();
			System.out.println("Enter the value string");
			String value=sc.next();
			input.put(key,value);	
		}
		System.out.println(getValues(input));
		sc.close();
	}
	/**
	 * method to get the values of a map in sorted order 
	 *
	 */
	
	public static List<String> getValues(Map<Integer,String> temp)
	{
		
		List<String> list=new ArrayList();
		for(Map.Entry<Integer,String> i:temp.entrySet())
			list.add(i.getValue());	
		Collections.sort(list);
		return list;
	    
	}

}
