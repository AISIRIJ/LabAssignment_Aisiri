/**  Author name : AISIRI J
     date: 23/10/2020
     desc: testing compilation and running to sort and convert into upper case and lower case respectively
*/
import java.util.*;

public class AlphabetSort {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
	     System.out.println("Enter the String");
	     String str=sc.next();
	     char [] arr=str.toCharArray();
		 String str1=sortString(arr);
		 System.out.println("The Resultant String is" +str1);
	}
	public static String sortString(char str[])
	{
	//--------------Sort the string-----------------	
		char temp;
    	for(int i=0;i<str.length;i++)
    	{
    		for(int j=i+1;j<str.length;j++)
    		{
    			if(str[i]>(str[j]))
    			{
    				temp=str[i];
    				str[i]=str[j];
    				str[j]=temp;
    			}
    		}
    	}
    	String str2=String.valueOf(str);
    	System.out.println("Alphabetically sorted order is "+str2);
		 int len=str2.length();
//----------to convert left half to upper case and right half to lower case-------------------
		String result1=" ";
		String result2=" ";
		int mid;
//------------if length is even------------------
		if(len%2==0)
		{
			mid=len/2;
			result1=str2.substring(0,mid); 
		    result2=str2.substring(mid);
		}
//--------------if length is odd----------------
	    else    
	    {
	    	mid=(len/2)+1;
	    	result1=str2.substring(0,mid);
	        result2=str2.substring(mid);    	
	    }
		String result=result1.toUpperCase()+result2.toLowerCase();
    	return result;	
	}
}