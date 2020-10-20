package chats;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

public class ChatTyper extends Typer{
	

  public void type(String[][] messages) {
	setSleepTime(5);
    try {
    	TimeUnit.SECONDS.sleep(30);
        this.robot = new Robot();
      for (int i = 0; i < messages.length && messages[i] != null; i++) {
        for (int j = 0; j < messages[i].length && messages[i][j] != null; j++) {
          char key = messages[i][j].charAt(0);
          type(key);
        }
        type('\n');
        TimeUnit.MINUTES.sleep(sleepTime);
      }
    } catch (AWTException e) {
      e.printStackTrace();
    } catch (InterruptedException a) {
      a.printStackTrace();
    }
  }
}

