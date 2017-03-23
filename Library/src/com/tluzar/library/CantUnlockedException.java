package com.tluzar.library;

public class CantUnlockedException extends RuntimeException {
	
	public CantUnlockedException() {
		
		super("Already unlocked");
	}
	
}
