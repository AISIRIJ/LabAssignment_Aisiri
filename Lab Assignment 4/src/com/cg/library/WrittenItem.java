package com.cg.library;

import java.util.Scanner;
/**
 * @author aisiri
 * This is a subclass of abstract class item .It overrides all the abstract methods 
 *
 */
public class WrittenItem extends Item{
	private String author;
	

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	Scanner sc=new Scanner(System.in);
	
	@Override
	public void getDetails() {
		System.out.println("Enter the author name:");
		setAuthor(sc.next());
		System.out.println("Enter the Title :");
		setTitle(sc.next());
		System.out.println("Enter the ID :");
		setId(sc.nextLong());
		System.out.println("Enter the number of copies:");
		setNumber_of_copies(sc.nextInt());
	}
	
	@Override
	public void displayDetails() {
		System.out.println("-----------Written Item Details----------");
		System.out.println("Author name: "+getAuthor());
		System.out.println("Title: "+getTitle());
		System.out.println("ID: "+getId());
		System.out.println("Number of copies: "+getNumber_of_copies());
		
	}
	
	@Override
	public void AvailableCopies() {
		int available_copies=getTotal_copies()-getNumber_of_copies();
		setTotal_copies(available_copies);
		System.out.println("Available copies: "+getTotal_copies());
	}

}
