package PSOBot;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ChatFileHandler {

  private final String __FILEDIR__ = "C:\\Users\\nnast\\OneDrive\\Coding\\java\\pso\\PSOBot\\";

  // Max lines in the chat file is 20.
  private Chats[] chats = new Chats[20];

  public Chats[] readChats() {
    int i = 0;
    BufferedReader br = null;
    try {
      br = new BufferedReader(new FileReader(__FILEDIR__ + "chats.txt"));

      String line = "";
      while ((line = br.readLine()) != null) {
        chats[i] = new Chats();
        chats[i].setMessage(line);
        i++;
      }
    } catch (Exception ee) {
      ee.printStackTrace();
    } finally {
      try {
        br.close();
      } catch (IOException ie) {
        System.out.println("Error occured while closing the BufferedReader");
        ie.printStackTrace();
      }
    }
    return chats;
  }

}