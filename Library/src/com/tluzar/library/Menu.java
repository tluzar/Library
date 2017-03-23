package com.tluzar.library;

import java.util.List;

public class Menu {
	
    public static final String INVALID_RETURN_BOOK = "That is not a valid book to return.";
    public static final String VALID_RETURN_BOOK = "Thank you for returning the book.";
    public static final String VALID_CHECKOUT_BOOK = "Thank you! Enjoy the book";
    public static final String INVALID_CHECKOUT_BOOK = "That book is not available.";
    public static final String INVALID_CHECKOUT_MOVIE = "That movie is not available.";
    public static final String VALID_CHECKOUT_MOVIE = "Thank you! Enjoy the movie";
    public static final String INVALID_LOGIN = "Invalid Login.";

    private Library library;
    private InputHandle inputHandle;
    private View view;
    private Login login;
    private boolean quitSystem;

    public Menu(InputHandle inputHandle, View view, Library library, Login login){
        this.inputHandle = inputHandle;
        this.view = view;
        this.library = library;
        this.login = login;
        quitSystem = false;
    }

    public void welcome() {
        view.printWelcomeMessage();
    }

    public void startLibracy() {
        welcome();
        while(!quitSystem){
            view.printMenuOptions();
            view.printSelectOption();
            char option = inputHandle.getInputChar();
            chooseOption(option);
        }
    }

    public void quitSystem() {
        view.printQuitMessage();
        quitSystem = true;
    }

    public boolean getQuitSystem(){
        return quitSystem;
    }

    public void chooseOption(char option) {
        switch (option) {
            case '1':
                listBooks();
                break;
            case '2':
                verifyLoginInCheckoutBook();
                break;
            case '3':
                verifyLoginInReturnBook();
            case '4':
                listMovies();
                break;
            case '5':
                verifyLoginInCheckoutMovie();
                break;
            case '6':
                getUserDetails();
                break;
            case '0':
                quitSystem();
                break;
            default:
                printInvalidOptions();
        }
    }

    private void verifyLoginInCheckoutMovie() {
        if(login()){
            checkoutMovie();
        }else{
            view.printMessages(INVALID_LOGIN);
        }
    }

    private void verifyLoginInReturnBook() {
        if(login()){
            returnBook();
        }else {
            view.printMessages(INVALID_LOGIN);
        }
    }

    private void verifyLoginInCheckoutBook() {
        if(login()){
           checkoutBook();
        }else{
           view.printMessages(INVALID_LOGIN);
        }
    }

    private void printInvalidOptions() {
        view.printInvalidOptions();
    }

    private void listBooks() {
        List<Book> books = library.getBooks();
        view.printListMedias(books);
    }

    private void listMovies(){
        List<Movie> movies = library.getMovies();
        view.printListMedias(movies);
    }

    private void checkoutBook() {
        view.enterBookCodeMessage();
        int code = inputHandle.getInputInt();
        if(library.checkoutBook(code)){
            view.printMessages(VALID_CHECKOUT_BOOK);
        }else{
            view.printMessages(INVALID_CHECKOUT_BOOK);
        }
    }

    private void checkoutMovie() {
        view.enterMovieCodeMessage();
        int code = inputHandle.getInputInt();
        if(library.checkoutMovie(code)){
            view.printMessages(VALID_CHECKOUT_MOVIE);
        }else{
            view.printMessages(INVALID_CHECKOUT_MOVIE);
        }
    }

    private void returnBook(){
        view.enterBookCodeMessage();
        int code = inputHandle.getInputInt();
        if(library.returnBook(code)){
            view.printMessages(VALID_RETURN_BOOK);
        }else {
            view.printMessages(INVALID_RETURN_BOOK);
        }
    }

    private boolean login(){
        view.enterUsername();
        String username = inputHandle.getInputString();
        view.enterPassword();
        String password = inputHandle.getInputString();
        boolean isValidLogin = login.validateLogin(username, password);
        return isValidLogin;
    }

    private void getUserDetails(){
        view.enterUsername();
        String username = inputHandle.getInputString();
        String detail = login.getDetails(username);
        view.printMessages(detail);
    }

}
