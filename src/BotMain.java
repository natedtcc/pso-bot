

import java.util.Scanner;

import chat.ChatBot;

public class BotMain {

    private static int choice = 0;
    private static boolean runs = true;
    private static Scanner sc = new Scanner(System.in);
    private static boolean chatbotRuns = false;
    private static ChatBot chatBot = new ChatBot(2);
//    private static WarpBot warpBot = new WarpBot(7);
    private static String[] options = new String[] { "Start the bot.\n", "Stop the bot.\n", "Quit the program.\n" };
    
	
  public static void clearScreen() {
    System.out.flush();
  }
  	

  public static void main(String[] args) {
	  System.out.println("\n\n /$$$$$$$   /$$$$$$   /$$$$$$        /$$$$$$$   /$$$$$$  /$$$$$$$$\r\n"
	  		+ "| $$__  $$ /$$__  $$ /$$__  $$      | $$__  $$ /$$__  $$|__  $$__/\r\n"
	  		+ "| $$  \\ $$| $$  \\__/| $$  \\ $$      | $$  \\ $$| $$  \\ $$   | $$   \r\n"
	  		+ "| $$$$$$$/|  $$$$$$ | $$  | $$      | $$$$$$$ | $$  | $$   | $$   \r\n"
	  		+ "| $$____/  \\____  $$| $$  | $$      | $$__  $$| $$  | $$   | $$   \r\n"
	  		+ "| $$       /$$  \\ $$| $$  | $$      | $$  \\ $$| $$  | $$   | $$   \r\n"
	  		+ "| $$      |  $$$$$$/|  $$$$$$/      | $$$$$$$/|  $$$$$$/   | $$   \r\n"
	  		+ "|__/       \\______/  \\______/       |_______/  \\______/    |__/   \n\n" +
	  					  "                                        Nate Nasteff 2020\n\n\n");

    System.out.println("Select an option:\n1. " + options[0] + "2. " + options[2]);
    while (runs) {
      choice = sc.nextInt();
      if (choice == 1 && !chatbotRuns) {
        chatbotRuns = true;
        choice = 0;
    	System.out.println("Chat bot starting in 30 seconds.\n");
        chatBot.start();
        System.out.println("Select an option:\n1. " + options[1] + "2. " + options[2]);
      }
      
      if (choice == 1 && chatbotRuns) {
          chatbotRuns = false;
          choice = 0;
      	System.out.println("Chat bot stopped.\n");
          chatBot.stop();
          System.out.println("Select an option:\n1. " + options[0] + "2. " + options[2]);
        }

      
      
      if (choice == 2) {
    	  if (chatbotRuns)
    	  chatBot.stop();
        System.out.println("\n\n\n\nSee ya..\n");
        
        runs = false;
      }
    }
    sc.close();
  }
}
