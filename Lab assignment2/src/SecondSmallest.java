/**  Author name : AISIRI J
     date: 23/10/2020
     desc: testing compilation and running to get the second smallest element in the array
*/
import java.util.Scanner;

public class SecondSmallest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("\nThe second smallest element is "+getSecondSmallest(arr));
	}
	//--------------method to return the second smallest array------------
    public static int getSecondSmallest(int arr[])
    {
    	int temp;
    	for(int i=0;i<arr.length;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    			if(arr[i]>arr[j])
    			{
    				temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    		}
    	}
    	System.out.println("Sorted Array is ");
    	for(int i=0;i<arr.length;i++)
    		System.out.print(arr[i]+" ");
    	return arr[1];
    }
}