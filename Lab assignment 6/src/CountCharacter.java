import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
/**
 * @author aisiri
 * desc: test compile and run to m accept a character array and count the number of times each character is present in the array.
 *
 */
public class CountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Map<Character,Integer> result=new TreeMap();
		CountCharacter c=new CountCharacter();
		System.out.println("Enter the input:");
		String str=sc.nextLine();
        char [] arr=new char[str.length()];
        arr=str.toCharArray();
        result=c.countChars(arr);
        for(Map.Entry<Character, Integer> i:result.entrySet())
        {
        	System.out.println(i.getKey()+" is repeated "+i.getValue()+" times");
        }
        sc.close();
	}
	/**
	 * method that accepts a character array and count the number of times each character is present in the array.
	 *
	 */
     public Map<Character,Integer> countChars(char[] arr)
     {
    	 Map<Character,Integer> tempMap=new TreeMap();
    	 for(int i=0;i<arr.length;i++)
    	 {   int count=0;
    		 for(int j=0;j<arr.length;j++)
    		 {
    			 if(arr[i]==arr[j])
    				 count++;
    		 }
    		 tempMap.put(arr[i], count);
    	 }
    	 return tempMap;
     }
}
