import java.util.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/**
 * @author aisiri
 * desc:test compile and run to accepts an array of integer elements and return the second smallest element in the array
 *
 */
public class SecondSmallest {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("\nThe second smallest element is "+getSecondSmallest(arr));
		sc.close();
	}
	/**
	 * method to  get the second smallest element in the array  using collections.sort()
	 *
	 */
  public static int getSecondSmallest(int[] arr)
  {
	  List<Integer> list = new ArrayList(arr.length); 
      for (int i : arr) {
          list.add(Integer.valueOf(i));
      }
	  Collections.sort(list);
	  System.out.println("sorted list:"+list);
	  return(list.get(1));
  }
}
