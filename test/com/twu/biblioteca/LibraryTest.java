package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ritter on 17-7-27.
 */
public class LibraryTest {
  private PrintStream printStream;
  private List<Book> bookList;
  private Library library;
  private Book book;

  @Before
  public void set_up() {
    printStream = mock(PrintStream.class);

    bookList = new ArrayList<Book>();
    book = mock(Book.class);

    library = new Library(bookList, printStream);
  }

  @Test
  public void should_print_book_list() {
    Book book = mock(Book.class);
    bookList.add(book);
    library.printBooks();
    for (Book b : bookList) {
      verify(book).printDetail();

    }
  }

}