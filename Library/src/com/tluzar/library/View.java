package com.tluzar.library;

import java.util.List;

public class View {
	
	public void printSpaces(){
        printMessages("\n");
    }

    public void printMessages(String message){
        System.out.println(message);
    }

    public void printSelectOption(){
        printMessages("Select Option:");
    }

    public void printListMedias(List medias){
        for(Media media: (List<Media>) medias) {
            printMessages(media.getDetails());
        }
    }

    public void printMenuOptions(){
        String options = "======== OPTIONS =========\n1 - List Books \n2 - Checkout Book \n" +
                "3 - Return Book \n4 - List Movies \n5 - Checkout Movie \n6 - User Details \n0 - Quit \n";
        printMessages(options);
    }

    public void printWelcomeMessage(){
        printMessages("Welcome!\n");
    }

    public void printInvalidOptions() {
        printMessages("Select a valid Option!\n");
    }

    public void printQuitMessage(){
        printMessages("Bye!");
    }

    public void enterBookCodeMessage() {
        printMessages("Enter the book code:");
    }

    public void enterUsername() {
        printMessages("Enter the username: ");
    }

    public void enterPassword(){
        printMessages("Enter the password: ");
    }
    public void enterMovieCodeMessage() {
        printMessages("Enter the movie code:");
    }


}
