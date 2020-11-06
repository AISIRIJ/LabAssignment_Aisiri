import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
/**
 * @author aisiri
 *desc: test compile and run to reverse the numbers in the array and returns the resulting array in sorted order
 */

public class ReverseSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the elements in the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the numbers:");
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		System.out.println("Sorted array:"+getSorted(arr));	
	}
	/**
	 * method to reverse and sort a array
	 *
	 */	
	public static List<Integer> getSorted(int[] arr)
	{
		List<Integer> sortlist=new ArrayList<>();
		//-----------logic to reverse an element in the array --------
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int reverse=0;
			while(num != 0) {
		           int digit = num % 10;
		           reverse= reverse * 10 + digit;
		           num /= 10;
		        }
			//--------------add reversed element to list and then sort using collections.sort()----------
			sortlist.add(reverse);
		}
		System.out.println("Reversed array: "+sortlist);
		Collections.sort(sortlist);
		return sortlist;
	}

}
