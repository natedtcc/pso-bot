package chat;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import util.Typer;

public class ChatTyper extends Typer{

  public synchronized void typeChats(String[] message) {

	    try {
	    	// Warmup, then start robot and create string for passing to typer
	    	
	        this.robot = new Robot();
	        String key = new String();
	        
	        // Iterate over a string array, which contains letters to be typed
	      for (int i = 0; i < message.length && message[i] != null; i++) {
	    	  
	    	  // Check for F1-F12 keys..
	    	  if (message[i].contains("F") && isNumeric(message[i+1])) {
	        	key = message[i] + message[i+1]; 
	    	  type(key);
	    	  i++;
	    	  }
	    	  
	    	  // Otherwise send individual letters to type..
	    	  else {
	    		  key = message[i];
	    		  type(key);
	    	  }
	          }
	      // If the key length is less than 2 (for commands, function keys)
	      // Send a new line once the typed string is fully sent
	      
	      if (key.length() < 2) {
	        type("\n");
	      }
	        TimeUnit.SECONDS.sleep(5);
	      
	    } catch (AWTException e) {
	      e.printStackTrace();
	    } catch (InterruptedException a) {
	      a.printStackTrace();
	    }
	  }
  
  public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        @SuppressWarnings("unused")
			double d = Double.parseDouble(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
}

