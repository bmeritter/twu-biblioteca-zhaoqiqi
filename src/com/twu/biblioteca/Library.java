package com.twu.biblioteca;

import java.io.PrintStream;
import java.util.List;

/**
 * Created by ritter on 17-7-27.
 */
public class Library {
  private List<Book> bookList;
  private PrintStream printStream;

  public Library(List<Book> bookList, PrintStream printStream) {
    this.bookList = bookList;
    this.printStream = printStream;
  }

  public void printBooks() {
    for (Book book : bookList) {
      printStream.println(book.printDetail());
    }
  }
}
