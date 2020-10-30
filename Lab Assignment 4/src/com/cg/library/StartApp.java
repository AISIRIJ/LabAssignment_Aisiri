
package com.cg.library;

import java.util.Scanner;

/**
 * @author aisiri
 * Test class which checks for the user choice and and display the details accordingly
 *
 */
public class StartApp {
   
    public static void main(String args[]){ 
    Scanner sc=new Scanner(System.in);
	System.out.println("------LIBRARY----------");
	System.out.println("1.Book");
	System.out.println("2.Journal Paper");
	System.out.println("3.Video");
	System.out.println("4.Cd");
	System.out.println("Enter your choice");
	int choice=sc.nextInt();
	switch(choice) {
	   case 1:Book b=new Book();
		     b.getBook();
		     break;
	   case 2:JournalPaper jp=new JournalPaper();
	          jp.getDetails();
	          jp.displayDetails();
	          break;
	   case 3:Video v=new Video();
	   		  v.getDetails();
	   		  v.displayDetails();
	   		  break;
	   case 4:Cd c=new Cd();
	          c.getDetails();
		      c.displayDetails();
		      break;
	  default:System.out.println("Invalid choice");	      
	}

   }
}
