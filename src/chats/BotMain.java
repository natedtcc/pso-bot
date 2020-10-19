package chats;

import java.util.Scanner;

public class BotMain {

  public static void clearScreen() {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }

  public static void main(String[] args) {
    clearScreen();
    int choice = 1;
    boolean runs = true;
    Scanner sc = new Scanner(System.in);
    boolean started = false;
    ChatBot chatBot = new ChatBot(7);
    String[] options = new String[] { "Start the chat bot.\n", "Stop the chat bot.\n", "Quit the program.\n" };
    System.out.println("Select an option:\n" + "1. " + options[0] + "2. " + options[2]);
    while (runs) {
      choice = sc.nextInt();
      if (choice == 1 && !started) {
    	System.out.println("Chat bot starting in 30 seconds.\n");
        chatBot.start();
        System.out.println("Select an option:\n" + "1. " + options[1] + "2. " + options[2]);
      }

      if (choice == 1 && started) {
        chatBot.stop();
      }

      if (choice == 2) {
        clearScreen();
        System.out.println("\n\n\n\nSee ya..\n");
        sc.close();
        runs = false;
      }
    }
  }

}
