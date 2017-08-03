package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
        PrintStream printStream = System.out;
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);
        Console display = new Console(printStream, reader);
        Library library = new Library(bookList(), printStream,
          checkedoutBookList(), display, movieList(), checkedoutMovieList(),
          userList());
        MainMenu menu = new MainMenu(library, printStream, display);
        int index = library.getUserLoginInfomation();
        while (index == -1) {
            printStream.println("Your have incorrect input,please input again!");
            index = library.getUserLoginInfomation();
        }
        menu.selectOption(index);
    }

    public static List<Book> bookList() {
        List<Book> bookList = new ArrayList<Book>();
        Book book1 = new Book("Snow White", "Joy", "2016");
        bookList.add(book1);
        Book book2 = new Book("Pinocchio", "Sharp", "2016");
        bookList.add(book2);

        return bookList;
    }

    public static List<Book> checkedoutBookList() {
        List<Book> checkedoutBookList = new ArrayList<Book>();
        Book checkedoutBook1 = new Book("The Ugly Duckling", "author li", "2020");
        checkedoutBookList.add(checkedoutBook1);
        Book checkedoutBook2 = new Book("Cinderella", "author zhou", "2030");
        checkedoutBookList.add(checkedoutBook2);

        return checkedoutBookList;
    }

    public static List<Movie> movieList() {
        List<Movie> movieList = new ArrayList<Movie>();
        Movie movie1 = new Movie("Beautiful Girl", "2001", "director liu", 3);
        Movie movie2 = new Movie("snooze", "2002", "director ping", 9);
        movieList.add(movie1);
        movieList.add(movie2);

        return movieList;
    }

    public static List<Movie> checkedoutMovieList() {
        List<Movie> checkedoutMovieList = new ArrayList<Movie>();
        Movie checkedoutMovie1 = new Movie("wolf two", "2016", "director wu", 2);
        Movie checkedoutMovie2 = new Movie("west travel", "2016", "director zhang", 7);
        checkedoutMovieList.add(checkedoutMovie1);
        checkedoutMovieList.add(checkedoutMovie2);

        return checkedoutMovieList;
    }

    public static List<User> userList() {
        List<User> userList = new ArrayList<User>();
        User user1 = new User("Ritter", "ritter@163.com", "13311110000", "ritter", "1111");
        User user2 = new User("zhao", "name2@name2.com", "13322223333", "zhao", "2222");
        userList.add(user1);
        userList.add(user2);

        return userList;
    }
}
