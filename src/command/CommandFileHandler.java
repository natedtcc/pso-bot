package command;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import util.Input;

public class CommandFileHandler {

	  private final String __FILEDIR__ = System.getProperty("user.dir");

	  // Max lines in the chat file is 20.
	  private Input[] commands = new Input[40];

	  public Input[] readChats() {
	    int i = 0;
	    BufferedReader br = null;
	    try {
	      br = new BufferedReader(new FileReader(__FILEDIR__ + "\\commands.txt"));

	      String line = "";
	      while ((line = br.readLine()) != null) {
	        commands[i] = new Input();
	        commands[i].setMessage(line);
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
	    return commands;
	  }
	
}
