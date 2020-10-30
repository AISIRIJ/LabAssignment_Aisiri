package com.cg.library;
/**
 * @author aisiri
 *Subclass of the written Item which overrides getDetails() and displayDetails()
 */

public class JournalPaper extends WrittenItem{
  private int publish_year;

public int getPublish_year() {
	return publish_year;
}

public void setPublish_year(int publish_year) {
	this.publish_year = publish_year;
}

    public void getDetails()
    {
    	super.getDetails();
    	System.out.println("Enter the publish year:");
    	setPublish_year(sc.nextInt());
    }
    public void displayDetails() {
    	super.displayDetails();
    	System.out.println("Publish year:"+getPublish_year());
    	setTotal_copies(100);	
        AvailableCopies();	
    }


}
