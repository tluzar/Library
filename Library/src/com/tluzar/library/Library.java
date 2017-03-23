package com.tluzar.library;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Library {
	
	private List<Book> books;
    private List<Movie> movies;

    public Library(List<Book> books, List<Movie> movies) {
        this.books = books;
        this.movies = movies;
    }

    public boolean checkoutBook(int idBook) {
        boolean checkOutBook;
        Book book = hasBook(idBook);
        try{
            book.lock();
            checkOutBook = true;
        } catch (CantLockedException e){
            checkOutBook = false;
        } catch (NullPointerException e){
            checkOutBook = false;
        }
        return checkOutBook;
    }

    public List<Book> getBooks() {
        return books;
    }

    public Book hasBook(int code) {
        Book bookResult = null;
        for(Book book: books){
            if(book.getCode() == code){
                bookResult = book;
            }
        }
        return bookResult;
    }

    public Movie hasMovie(int code) {
        Movie movieResult = null;
        for(Movie movie: movies){
            if(movie.getCode() == code){
                movieResult = movie;
            }
        }
        return movieResult;
    }

    public boolean returnBook(int code) {
        boolean returnBook;
        Book book = hasBook(code);
        try {
            book.unlock();
            returnBook = true;
        } catch (CantUnlockedException e) {
            returnBook = false;
        } catch (NullPointerException e) {
            returnBook = false;
        }
        return returnBook;
    }

    public Collection<Book> listAvailableBook() {
        List<Book> availableBook = new ArrayList<Book>();
        for (Book book : books) {
            if (!book.isLocked()) {
                availableBook.add(book);
            }
        }
        return availableBook;
    }

    public List<Movie> listAvailableMovie() {
        List<Movie> availableMovies = new ArrayList<Movie>();
        for (Movie movie : this.movies) {
            if (!movie.isLocked()) {
                availableMovies.add(movie);
            }
        }
        return availableMovies;
    }

    public boolean checkoutMovie(int code) {
        boolean checkoutMovie;
        Movie movie = hasMovie(code);
        try{
            movie.lock();
            checkoutMovie = true;
        } catch (CantLockedException e){
            checkoutMovie = false;
        } catch (NullPointerException e){
            checkoutMovie = false;
        }
        return checkoutMovie;
    }

    public List<Movie> getMovies(){
        return movies;
    }
}
