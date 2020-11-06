import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/**
 * @author aisiri
 *desc : test compile and run to accepts an array of numbers and returns the numbers and their squares in Hashmap
 */

public class SquareMap {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
	Map<Integer,Integer> result=new HashMap();
	SquareMap s=new SquareMap();
   System.out.println("Enter the size of array");
   int n=sc.nextInt();
   int[] arr=new int[n];
   System.out.println("Enter the numbers");
   for(int i=0;i<n;i++)
	   arr[i]=sc.nextInt();
   result=s.getSquares(arr);
   for(Map.Entry<Integer, Integer>i:result.entrySet()) {
	   System.out.println("number="+i.getKey()+" and their square="+i.getValue());
   }
   sc.close();
}
//-----------method that accepts a list of numbers and return their squares-------------	
	public Map<Integer,Integer> getSquares(int [] arr)
	{
		Map<Integer,Integer> squares=new HashMap();
		for(int i:arr)
		{
			squares.put(i,i*i);
		}
		return squares;
	}

}
