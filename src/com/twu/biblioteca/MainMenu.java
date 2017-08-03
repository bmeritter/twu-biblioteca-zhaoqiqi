package com.twu.biblioteca;

import java.io.PrintStream;

public class MainMenu {
  Library library;
  PrintStream printStream;
  Console console;

  public MainMenu(Library library, PrintStream printStream,
              Console console) {
    this.library = library;
    this.printStream = printStream;
    this.console = console;
  }

  public void displayMenu() {
    printStream.println("------------------------");
    printStream.println("Please select an option:");
    printStream.println("1. List Books");
    printStream.println("2. Checkout Book");
    printStream.println("3. Return Book");
    printStream.println("4. List Movies");
    printStream.println("5. Checkout Movie");
    printStream.println("6. Return Movie");
    printStream.println("7. Display User Information");
    printStream.println("Q. Quit");
    printStream.println("-------------------------");
  }

  public void selectOption(int index) {
    console.printWelcomeMessage();
    displayMenu();
    String input = console.getUserInput();

    while (!input.equals("Q")) {
      if (input.equals("1")) {
        library.displayBooksWithBookNumber();

      } else if (input.equals("2")) {
        library.checkoutBook();

      } else if (input.equals("3")) {
        library.returnBook();

      } else if (input.equals("4")) {
        library.displayMoviesWithMovieNumber();

      } else if (input.equals("5")) {
        library.checkoutMovie();

      } else if (input.equals("6")) {
        library.returnMovie();

      } else if (input.equals("7")) {
        library.displayUserInformation(index);

        printStream.println("Select a valid option!");

      } else {
        printStream.println("Select a valid option!");

      }
      displayMenu();
      input = console.getUserInput();
    }

  }
}
