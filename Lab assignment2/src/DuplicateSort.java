/**  Author name : AISIRI J
     date: 23/10/2020
     desc: testing compilation and running to remove the duplicates and sort the array
*/
import java.util.Scanner;

public class DuplicateSort {

	static int k=0;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
	    int num[] = new int[n];
	    for(int i=0;i<n;i++)
	    	num[i]=sc.nextInt();
	    int res[]=modifyArray(num);
	    System.out.print("\nSorted array ");
	    for(int i=0;i<k;i++)
	    	System.out.print(res[i]+ " ");
	}
	public static int[] modifyArray(int num[])
	{     
		   int len=num.length;
		   int temp1;
		   int temp[]=new int[len];
 //-------------for sorting----------------
	   	   for(int i=0;i<len;i++) 
	   	   {
	   		for(int l=i+1;l<len;l++)
	   		{
	   			if(num[i]<num[l])
	   			{
	   				temp1=num[i];
	   				num[i]=num[l];
	   				num[l]=temp1;
	   			}
	   		}
	   	  }
	//-----------for removing duplicates------------------- 	   
	   	   for(int j=0;j<len-1;j++)
	   		   if(num[j]!=num[j+1])
	   			   temp[k++]=num[j];
	//-----------------for placing last element--------------- 	   
	   	   temp[k++]=num[len-1];
	   	   return temp;
	 
	   	   }	
	}
