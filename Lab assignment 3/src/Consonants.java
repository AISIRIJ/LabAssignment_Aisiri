/**  Author name : AISIRI J
     date: 24/10/2020
     desc: testing compilation and running that replaces all the consonants in the String with the next alphabet. 
*/
import java.util.Scanner;

public class Consonants {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String str=new String(sc.next().toLowerCase());
        System.out.println("The resultant String is: "+alterString(str));
	}
   //----------method to alter the string------------------
	public static String alterString(String str)
	{
		char array[]=str.toCharArray();
		for(int i=0;i<array.length;i++)
		{
			//--------check for vowels------------
			if((array[i]!='a' && array[i]!='e'	&& array[i]!='i' && array[i]!='0' && array[i]!='u' )) {
				if(array[i]=='z')
					array[i]='b';
				else  {
					array[i]=(char)(array[i]+1);
				//------checks if the incremented char is vowel if so increment to next char-----------
				   if((array[i]=='a' && array[i]=='e'	&& array[i]=='i' && array[i]=='o' && array[i]=='u' ))
						array[i]=(char)(array[i]+1);
				}
			}		
		}
		return String.valueOf(array);
		
	}
	
}