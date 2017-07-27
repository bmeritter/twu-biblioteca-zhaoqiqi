package com.twu.biblioteca;

/**
 * Created by ritter on 17-7-27.
 */
public class Book {
  private String title;
  private String author;
  private String publishDate;

  public Book(String title, String author, String publishDate) {
    this.title = title;
    this.author = author;
    this.publishDate = publishDate;
  }

  public String printDetail() {
    return String.format("title:%-8s author:%-8s publishDate:%-8s", title, author, publishDate);
  }
}
