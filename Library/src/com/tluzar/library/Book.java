package com.tluzar.library;

public class Book extends Media {
	
	 private String author;
	
	 public Book(int code, String title, String author, int year) {
	        this.code = code;
	        this.title = title;
	        this.author = author;
	        this.year = year;
	        this.locked = false;
	    }

	public void unlock(){
        if(locked){
            locked = false;
        }else{
            throw new CantUnlockedException();
        }
    }
	
	@Override
    public String getDetails(){
        return "Cod: " + code + " | Title: "+ title + " | Author: " + author + " | Year Published: " + year;
    }
	
	
	 public boolean equals(Object o) {
	        if (!(o instanceof Book)){
	            return false;
	        }
	        if(this.code == ((Book)o).code){
	            return true;
	        }
	        return false;
	    }	
}
