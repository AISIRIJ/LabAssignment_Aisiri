package com.cg.library;

/**
 * @author aisiri
 *  abstract superclass Item that define all common operations common information that the library must have for every item 
 */
public abstract class Item {
	/**
	 * @author aisiri
	 *    unique id of the item
	 */
	
	private long id;
	/**
	 * @author aisiri
	 *    title of the item
	 */
	
	private String title;
	/**
	 * @author aisiri
	 *   number of copies taken from the user
	 */
	
	private int number_of_copies;
	/**
	 * @author aisiri
	 *    total number of copies available
	 */
	
	private int total_copies;

	public int getTotal_copies() {
		return total_copies;
	}

	public void setTotal_copies(int total_copies) {
		this.total_copies = total_copies;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getNumber_of_copies() {
		return number_of_copies;
	}
	public void setNumber_of_copies(int number_of_copies) {
		this.number_of_copies = number_of_copies;
	}
	/**
	 * @author aisiri
	 *This method gets the input from the user
	 */
	public abstract void getDetails();
	/**
	 * @author aisiri
	 *This method display the available details
	 */
	public abstract void displayDetails();
	/**
	 * @author aisiri
	 *This method will calculate the available copies of media item and update 
	 */

	public abstract void AvailableCopies();
	
}
