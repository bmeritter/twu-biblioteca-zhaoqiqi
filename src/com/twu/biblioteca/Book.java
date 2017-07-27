package com.twu.biblioteca;

/**
 * Created by ritter on 17-7-27.
 */
public class Book {
  private String title;
  private String author;

  public Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public String printDetail(){
    return String.format("title:%-8s author:%-8s", title, author);
  }
}
