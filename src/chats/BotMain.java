package chats;

import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class BotMain {

  public static void clearScreen() {
    System.out.print("\u239A");
    System.out.flush();
  }
  	

  public static void main(String[] args) throws UnsupportedEncodingException {
    clearScreen();
	PrintWriter printWriter = new PrintWriter(System.out, true);

    int choice = 1;
    boolean runs = true;
    Scanner sc = new Scanner(System.in);
    boolean botRuns = false;
    ChatBot chatBot = new ChatBot(7);
    String[] options = new String[] { "Start the chat bot.\n", "Stop the chat bot.\n", "Quit the program.\n" };
    System.out.println("Select an option:\n" + "1. " + options[0] + "2. " + options[2]);
    while (runs) {
      choice = sc.nextInt();
      if (choice == 1 && !botRuns) {
        botRuns = true;
        choice = 0;
    	System.out.println("Chat bot starting in 30 seconds.\n");
        chatBot.start();
        System.out.println("Select an option:\n" + "1. " + options[1] + "2. " + options[2]);
      }

      if (choice == 1 && botRuns) {
        chatBot.stop();
        botRuns = false;
        choice = 0;
        System.out.println("Select an option:\n" + "1. " + options[0] + "2. " + options[2]);
      }

      if (choice == 2) {

        System.out.println("\n\n\n\nSee ya..\n");
        sc.close();
        runs = false;
      }
    }
  }
}
