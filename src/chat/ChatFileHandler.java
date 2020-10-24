package chat;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import util.Input;

public class ChatFileHandler {

  private final String __FILEDIR__ = System.getProperty("user.dir");

  // Max lines in the chat file is 40
  private Input[] chats = new Input[40];

  public Input[] readChats() {
    int i = 0;
    BufferedReader br = null;
    try {
      br = new BufferedReader(new FileReader(__FILEDIR__ + "\\chats.txt"));

      String line = "";
      while ((line = br.readLine()) != null) {
        chats[i] = new Input();
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