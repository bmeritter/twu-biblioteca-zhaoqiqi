package com.twu.biblioteca;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by ritter on 17-7-27.
 */
public class Console {
  private PrintStream printStream;
  private BufferedReader bufferedReader;

  public Console(PrintStream printStream, BufferedReader bufferedReader) {
    this.printStream = printStream;
    this.bufferedReader = bufferedReader;
  }

  public void printWelcomeMessage() {
    printStream.println("Welcome!");
  }

  public String getUserInput() {
    String userInput = "";
    try {
      userInput = bufferedReader.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
    printStream.println();
    return userInput;
  }
}
