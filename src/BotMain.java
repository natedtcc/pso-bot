

import java.util.Scanner;

import chat.ChatBot;
import util.WarpBot;

public class BotMain {

    private static int choice = 1;
    private static boolean runs = true;
    private static Scanner sc = new Scanner(System.in);
    private static boolean chatbotRuns = false;
    private static boolean warpbotRuns = false;
    private static ChatBot chatBot = new ChatBot(7);
    private static WarpBot warpBot = new WarpBot(19);
    private static String[] options = new String[] { "Start the chat bot.\n", "Stop the chat bot.\n", "Start the warp bot\n", "Stop the warp bot\n", "Quit the program.\n" };
    
	
  public static void clearScreen() {
    System.out.print("\u239A");
    System.out.flush();
  }
  	

  public static void main(String[] args) {
    clearScreen();
    System.out.println("Select an option:\n1. " + options[0] + "2. " + options[2] + "3. " + options[4]);
    while (runs) {
      choice = sc.nextInt();
      if (choice == 1 && !chatbotRuns && !warpbotRuns) {
        chatbotRuns = true;
        choice = 0;
    	System.out.println("Chat bot starting in 30 seconds.\n");
        chatBot.start();
        System.out.println("Select an option:\n1. " + options[1] + "2. " + options[2] + "3. " + options[4]);
      }
      
      if (choice == 1 && !chatbotRuns && warpbotRuns) {
          chatbotRuns = true;
          choice = 0;
      	System.out.println("Chat bot starting in 30 seconds.\n");
          chatBot.start();
          System.out.println("Select an option:\n1. " + options[1] + "2. " + options[3] + "3. " + options[4]);
        }

      if (choice == 1 && chatbotRuns && !warpbotRuns) {
        chatBot.stop();
        chatbotRuns = false;
        choice = 0;
        System.out.println("Select an option:\n1. " + options[0] + "2. " + options[2] + "3. " + options[4]);
      }

      if (choice == 1 && chatbotRuns && warpbotRuns) {
          chatBot.stop();
          chatbotRuns = false;
          choice = 0;
          System.out.println("Select an option:\n1. " + options[0] + "2. " + options[3] + "3. " + options[4]);
        }
      
      if (choice == 2 && !chatbotRuns && !warpbotRuns) {
          warpbotRuns = true;
          choice = 0;
      	System.out.println("Warp bot starting in 30 seconds.\n");
          warpBot.start();
          System.out.println("Select an option:\n1. " + options[0] + "2. " + options[3] + "3. " + options[4]);
        }
      if (choice == 2 && !chatbotRuns && warpbotRuns) {
    	  warpBot.stop();
          warpbotRuns = false;
          choice = 0;
          System.out.println("Select an option:\n1. " + options[0] + "2. " + options[2] + "3. " + options[4]);
        }
      if (choice == 2 && chatbotRuns && !warpbotRuns) {
          warpbotRuns = true;
          choice = 0;
      	System.out.println("Warp bot starting in 30 seconds.\n");
          warpBot.start();
          System.out.println("Select an option:\n1. " + options[1] + "2. " + options[3] + "3. " + options[4]);
        }
      if (choice == 2 && !chatbotRuns && warpbotRuns) {
    	  warpBot.stop();
          warpbotRuns = false;
          choice = 0;
          System.out.println("Select an option:\n1. " + options[0] + "2. " + options[2] + "3. " + options[4]);
        }
      
      
      if (choice == 3) {
    	  warpBot.stop();
    	  chatBot.stop();
        System.out.println("\n\n\n\nSee ya..\n");
        sc.close();
        runs = false;
      }
    }
  }
}
