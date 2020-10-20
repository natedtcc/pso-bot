﻿package chat;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import util.Typer;

public class ChatTyper extends Typer{
	

  public void typeChats(String[][] messages) {
//	setSleepTime(5);
    try {
    	// Warmup, then start robot and create string for passing to typer
    	TimeUnit.SECONDS.sleep(5);
        this.robot = new Robot();
        String key = new String();
        
        // Iterate over each array, which contains arrays of strings
      for (int i = 0; i < messages.length && messages[i] != null; i++) {
        for (int j = 0; j < messages[i].length && messages[i][j] != null; j++) {
          
        	// Check for function keys (F1, F2 etc)
        	// If found, increment j to skip to the next array
        	if (messages[i][j].contains("F") && isNumeric(messages[i][j+1])) {
        	  key =  (messages[i][j] + messages[i][j+1]);
        	  type(key);
        	  j++;
        	}
        	// Otherwise type individual keys
          else {
        	  System.out.println(key);
        	 key = messages[i][j];
        	 type(key);
          }
        }
        type("\n");
        TimeUnit.SECONDS.sleep(10);
//        TimeUnit.MINUTES.sleep(sleepTime);
      }
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
