package com.twu.biblioteca;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by ritter on 17-7-27.
 */
public class ConsoleTest {
  private PrintStream printStream;
  private Console console;

  @Before
  public void set_up () throws  Exception{
   printStream = mock(PrintStream.class);
    console = new Console(printStream);
  }

  @Test
  public void should_print_welcome_message() {
    console.printWelcomeMessage();
    verify(printStream).println("Welcome!");
  }

}