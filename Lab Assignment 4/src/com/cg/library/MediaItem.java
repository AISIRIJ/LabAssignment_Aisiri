package com.cg.library;

import java.util.Scanner;

/**
 * @author aisiri
 * This is a subclass of abstract class item .It overrides all the abstract methods 
 *
 */
public class MediaItem extends Item {
     
	private String genre;
	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	Scanner sc=new Scanner(System.in);
	/**
	 * @author aisiri
	 *This method gets the input from the user
	 */
	@Override
	public void getDetails() {
		System.out.println("Enter the genre:");
		setGenre(sc.next());
		System.out.println("Enter the Title :");
		setTitle(sc.next());
		System.out.println("Enter the ID :");
		setId(sc.nextLong());
		System.out.println("Enter the number of copies:");
		setNumber_of_copies(sc.nextInt());
		
	}
	/**
	 * @author aisiri
	 *This method display the available details
	 */

	@Override
	public void displayDetails() {
		System.out.println("-----------Media Item Details----------");
		System.out.println("Genre: "+getGenre());
		System.out.println("Title: "+getTitle());
		System.out.println("ID: "+getId());
		System.out.println("Number of copies: "+getNumber_of_copies());
		
	}
	/**
	 * @author aisiri
	 *This method will calculate the available copies of media item and update 
	 */

	@Override
	public void AvailableCopies() {
		int available_copies=getTotal_copies()-getNumber_of_copies();
		setTotal_copies(available_copies);
		System.out.println("Available copies: "+getTotal_copies());
	}

}
