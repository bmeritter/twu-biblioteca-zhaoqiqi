package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ritter on 17-7-31.
 */
public class MainMenu {
  public static void main(String[] args) {
    PrintStream printStream = System.out;
    Console console = new Console(printStream);

  }

  private static Library library() {
    List<Book> listOfBooks = new ArrayList<Book>();
    Book book1 = new Book("The Dispossessed", "Ursula K. Le Guin", "2001");
    Book book2 = new Book("Island", "Aldous Huxley", "1953");
    listOfBooks.add(book1);
    listOfBooks.add(book2);

    List<Book> listOfCheckedOutBooks = new ArrayList<Book>();
    Book checkedOutBook1 = new Book("The Name of the Wind", "Patrick Rothfuss", "2006");
    Book checkedOutBook2 = new Book("Wise Man's Fear", "Patrick Rothfuss", "2010");
    listOfCheckedOutBooks.add(checkedOutBook1);
    listOfCheckedOutBooks.add(checkedOutBook2);

    return new Library(listOfBooks, System.out);
  }
}
