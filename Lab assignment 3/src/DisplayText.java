/**  Author name : AISIRI J
     date: 24/10/2020
     desc: testing compilation and running that displays the number of characters, lines and words in a text
*/
import java.util.*;

public class DisplayText {

	public static void main(String[] args) {
		System.out.println("Enter the text");
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		int countWord=0;
		int countLines=0;
		int countCharacter=0;
		//----------reads lines and words based on split()-------------------
		String[] listWord=text.split("\\s+");
		countWord+=listWord.length;
		String[] LineList=text.split("[!?.:]+");
		countLines+=LineList.length;
	    countCharacter+=text.length();
	    System.out.println("Number of words:"+countWord+"\nNumber of Lines:"+ countLines+"\nNumber of  characters:"+countCharacter);			
	}
}
