package com.tluzar.library;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	 public static void main(String[] args) {
	
	 List<Book> books = new ArrayList<Book>();
	 books.add( new Book(1, "Pan Tadeusz", "Mickiewicz", 1812));
	 books.add(new Book(2, "Kordian", "Juliusz S³owacki", 1815));

     List<Movie> movies = new ArrayList<Movie>();
     movies.add(new Movie(1, "Katyñ", "Andrzej Wajda", 9, 2013));
     movies.add(new Movie(2, "Psy", "W³adys³aw Pasikowski", 9, 2014));

     Library library = new Library(books, movies);

     InputHandle inputHandle = new InputHandle();
     View view = new View();

     List<User> users = new ArrayList<User>();
     users.add(new User("John", "Krakow Karmelicka Street","111-1111", "Jan", "123456"));
     users.add(new User("James", "Krakow Kalwaryjska Street","222-2222", "Mati", "654321"));
     
     Login login = new Login(users);

     Menu menu = new Menu(inputHandle, view, library, login);

     menu.startLibracy();
     
	 }

}
