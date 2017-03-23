package com.tluzar.library;

import java.util.Scanner;

public class InputHandle {
	
	private Scanner scanner;

    public InputHandle(){
        this.scanner = new Scanner(System.in);
    }

    public char getInputChar() {
        char option =  scanner.nextLine().charAt(0);
        return option;
    }

    public int getInputInt() {
        int option = scanner.nextInt();
        scanner.nextLine();
        return option;
    }
    public String getInputString() {
        String option = scanner.nextLine();
        return option;
    }

}
