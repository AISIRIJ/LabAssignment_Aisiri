/**  Author name : AISIRI J
     date: 23/10/2020
     desc: testing compilation and running to reverse and sort integer array
*/
import java.util.Scanner;

public class ReverseSort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
	    int num[] = new int[n];
	    for(int i=0;i<n;i++)
	    	num[i]=sc.nextInt();
	    int result[]=getSorted(num);
	    System.out.print("\nSorted array ");
	    for(int i=0;i<result.length;i++)
	    	System.out.print(result[i]+ " ");     
	}
	//--------------method to reverse and sort an array----------------
   public static int[] getSorted(int num[] )
   {
	   int len=num.length;
	   int[] temp=new int[len];
	   int j=len;
	   for(int i=0;i<len;i++)
	   {
		       temp[j-1]=num[i];
			   j=j-1;
		   
	   }
	   System.out.print("Reversed array ");
	   for(int k=0;k<num.length;k++)
	   System.out.print(temp[k]+" ");
	   //-----------------sorting an array--------------------------
	   int temp1;
   	   for(int i=0;i<len;i++)
   	   {
   		for(int l=i+1;l<len;l++)
   		{
   			if(temp[i]>temp[l])
   			{
   				temp1=temp[i];
   				temp[i]=temp[l];
   				temp[l]=temp1;
   			}
   		}
   	  }
   	   return temp;
	   
   }
}