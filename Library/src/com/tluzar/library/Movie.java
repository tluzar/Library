package com.tluzar.library;

public class Movie extends Media {

	 private String director;
	    private int rating;

	    public Movie(int code, String title, String director, int rating, int year) {
	        this.code = code;
	        this.title = title;
	        this.director = director;
	        this.rating = rating;
	        this.year = year;
	    }
	
	
	@Override
	public String getDetails() {
		String details = "Cod: " + code +
                " | Title: " + title + " | Year: " + year + " | Director: " + director + " | Rating: " + rating;
		return details;
	}
	
	

}
