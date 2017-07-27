package com.twu.biblioteca;

import java.io.PrintStream;

/**
 * Created by ritter on 17-7-27.
 */
public class Console {
  private PrintStream printStream;

  public Console(PrintStream printStream) {
    this.printStream = printStream;
  }

  public void printWelcomeMessage() {
    printStream.println("Welcome!");
  }
}
