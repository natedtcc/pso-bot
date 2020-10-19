import java.awt.*;
import java.awt.event.*;
import java.awt.Robot;
import java.util.*;
import java.util.concurrent.TimeUnit;

public class output {

  public static void main(String[] args) {

    int choice = 1;
    boolean runs = true;
    Scanner sc = new Scanner(System.in);
    Runtime rt = new Runtime();
    Thread chatter = new Thread(rt);
    while (runs) {
      System.out.println("Select an option:\n" + "1. Start the auto chat message\n2. Stop the auto chat message\n"
          + "3. Quit this program\n");
      choice = sc.nextInt();
      if (choice == 1) {
        chatter.start();
      }
      if (choice == 2) {
        chatter.interrupt();
      }

      if (choice == 3) {
        runs = false;
      }
    }
  }

}

class Runtime implements Runnable {
  private boolean runs = true;

  public void setRun(boolean check) {
    this.runs = check;
  }

  public void run() {
    try {
      Robot robot = new Robot();
      while (runs) {
        Thread.sleep(20000);
        robot.keyPress(KeyEvent.VK_SHIFT);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_W);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_W);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_E);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_E);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_L);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_L);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_C);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_C);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_O);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_O);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_M);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_M);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_E);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_E);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_SPACE);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_T);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_T);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_O);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_O);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_SPACE);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_T);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_T);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_H);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_H);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_E);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_E);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_SPACE);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_S);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_S);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_T);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_T);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_R);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_R);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_E);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_E);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_A);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_M);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_M);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_SPACE);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_SHIFT);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_SEMICOLON);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_SEMICOLON);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_SHIFT);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_0);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_0);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(120);

        TimeUnit.MINUTES.sleep(1);
        robot.keyPress(KeyEvent.VK_SHIFT);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_R);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_R);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_A);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_A);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_G);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_G);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_O);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_O);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_L);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_L);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_SPACE);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_SPACE);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_M);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_M);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_E);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_E);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_M);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_M);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_O);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_O);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_R);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_R);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_I);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_I);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_E);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_E);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_S);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_S);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        Thread.sleep(120);
        robot.keyPress(KeyEvent.VK_ENTER);
        Thread.sleep(120);
        robot.keyRelease(KeyEvent.VK_ENTER);
        Thread.sleep(120);
      }
    } catch (AWTException e) {
      e.printStackTrace();
    } catch (InterruptedException e) {
      System.out.println("Select an option:\n" + "1. Start the auto chat message\n2. Stop the auto chat message\n"
          + "3. Quit this program\n");
    }

  }
}