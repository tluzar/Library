package com.tluzar.library;

public abstract class Media {
	protected String title;
	protected int code;
	protected int year;
	protected boolean locked;
	
	public abstract String getDetails();
	
	public boolean isLocked(){
	    return locked;
	}

    public void lock(){
        if(locked){
            throw new CantUnlockedException();
        } else {
            locked = true;
        }
    }

    public String getSummary(){
        return "Cod: " + code + " | Title: "+ title;
    }

    public int getCode(){
        return code;
    }

}
