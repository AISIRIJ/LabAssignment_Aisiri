package com.cg.library;

public class Cd extends MediaItem{
        String artist_name;

		public String getArtist_name() {
			return artist_name;
		}

		public void setArtist_name(String artist_name) {
			this.artist_name = artist_name;
		}

		
    public void getDetails()
    {
    	super.getDetails();
    	System.out.println("Enter the artist name:");
    	setArtist_name(sc.next());
    }
    public void displayDetails() {
    	super.displayDetails();
    	System.out.println("Artist Name:"+getArtist_name());
		setTotal_copies(25);
		AvailableCopies();
    	
    	
    }
}
