package command;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import util.Typer;

public class CommandTyper extends Typer {
	
	public void typeCommands (String[] commands) {
	
	try {
    	// Warmup, then start robot and create string for passing to typer
    	TimeUnit.SECONDS.sleep(5);
        this.robot = new Robot();
        String key = new String();
        
        // Iterate over the array which contains strings to be processed
        // for typing
      for (int i = 0; i < commands.length && commands[i] != null; i++) {

        	 System.out.println(key);
        	 type(commands[i]);
        	 type(key);
          }
        
        type("\n");
        TimeUnit.MINUTES.sleep(sleepTime);
      
    } catch (AWTException e) {
      e.printStackTrace();
    } catch (InterruptedException a) {
      a.printStackTrace();
    }
  }
}
