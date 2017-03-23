package com.tluzar.library;

public class CantLockedException extends RuntimeException {
	
	public CantLockedException() {
		
		super("Username is invalid");
	}

}
