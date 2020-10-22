
package util;

import java.awt.event.KeyEvent;
import java.awt.AWTException;
import java.awt.Robot;


public class Typer {

	  protected Robot robot;
	  protected int sleepTime;
	  

	  /**
	   * @return the sleepTime
	   */
	  public int getSleepTime() {
	    return sleepTime;
	  }

	  /**
	   * @param sleepTime the sleepTime to set
	   */
	  public void setSleepTime(int sleepTime) {
	    this.sleepTime = sleepTime;
	  }
	

	  public void type(String character) throws InterruptedException, AWTException {
		  this.robot = new Robot();
		    switch (character) {

		      case "a":
		        this.robot.keyPress(KeyEvent.VK_A);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_A);
		        break;
		      case "b":
		        this.robot.keyPress(KeyEvent.VK_B);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_B);
		        break;
		      case "c":
		        this.robot.keyPress(KeyEvent.VK_C);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_C);
		        break;
		      case "d":
		        this.robot.keyPress(KeyEvent.VK_D);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_D);
		        break;
		      case "e":
		        this.robot.keyPress(KeyEvent.VK_E);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_E);
		        break;
		      case "f":
		        this.robot.keyPress(KeyEvent.VK_F);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_F);
		        break;
		      case "g":
		        this.robot.keyPress(KeyEvent.VK_G);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_G);
		        break;
		      case "h":
		        this.robot.keyPress(KeyEvent.VK_H);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_H);
		        break;
		      case "i":
		        this.robot.keyPress(KeyEvent.VK_I);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_I);
		        break;
		      case "j":
		        this.robot.keyPress(KeyEvent.VK_J);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_J);
		        break;
		      case "k":
		        this.robot.keyPress(KeyEvent.VK_K);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_K);
		        break;
		      case "l":
		        this.robot.keyPress(KeyEvent.VK_L);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_L);
		        break;
		      case "m":
		        this.robot.keyPress(KeyEvent.VK_M);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_M);
		        break;
		      case "n":
		        this.robot.keyPress(KeyEvent.VK_N);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_N);
		        break;
		      case "o":
		        this.robot.keyPress(KeyEvent.VK_O);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_O);
		        break;
		      case "p":
		        this.robot.keyPress(KeyEvent.VK_P);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_P);
		        break;
		      case "q":
		        this.robot.keyPress(KeyEvent.VK_Q);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_Q);
		        break;
		      case "r":
		        this.robot.keyPress(KeyEvent.VK_R);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_R);
		        break;
		      case "s":
		        this.robot.keyPress(KeyEvent.VK_S);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_S);
		        break;
		      case "t":
		        this.robot.keyPress(KeyEvent.VK_T);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_T);
		        break;
		      case "u":
		        this.robot.keyPress(KeyEvent.VK_U);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_U);
		        break;
		      case "v":
		        this.robot.keyPress(KeyEvent.VK_V);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_V);
		        break;
		      case "w":
		        this.robot.keyPress(KeyEvent.VK_W);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_W);
		        break;
		      case "x":
		        this.robot.keyPress(KeyEvent.VK_X);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_X);
		        break;
		      case "y":
		        this.robot.keyPress(KeyEvent.VK_Y);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_Y);
		        break;
		      case "z":
		        this.robot.keyPress(KeyEvent.VK_Z);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_Z);
		        break;
		      case "A":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_A);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_A);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "B":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_B);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_B);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "C":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_C);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_C);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "D":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_D);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_D);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "E":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_E);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_E);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "F":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_F);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_F);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "G":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_G);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_G);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "H":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_H);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_H);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "I":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_I);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_I);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "J":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_J);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_J);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "K":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_K);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_K);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "L":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_L);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_L);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "M":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_M);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_M);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "N":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_N);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_N);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "O":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_O);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_O);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "P":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_P);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_P);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "Q":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_Q);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_Q);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "R":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_R);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_R);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "S":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_S);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_S);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "T":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_T);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_T);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "U":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_U);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_U);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "V":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_V);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_V);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "W":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_W);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_W);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "X":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_X);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_X);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "Y":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_Y);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_Y);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "Z":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_Z);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_Z);
		        robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "`":
		        robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
		        break;
		      case "0":
		        this.robot.keyPress(KeyEvent.VK_0);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_0);
		        break;
		      case "1":
		        this.robot.keyPress(KeyEvent.VK_1);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_1);
		        break;
		      case "2":
		        this.robot.keyPress(KeyEvent.VK_2);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_2);
		        break;
		      case "3":
		        this.robot.keyPress(KeyEvent.VK_3);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_3);
		        break;
		      case "4":
		        this.robot.keyPress(KeyEvent.VK_4);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_4);
		        break;
		      case "5":
		        this.robot.keyPress(KeyEvent.VK_5);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_5);
		        break;
		      case "6":
		        this.robot.keyPress(KeyEvent.VK_6);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_6);
		        break;
		      case "7":
		        this.robot.keyPress(KeyEvent.VK_7);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_7);
		        break;
		      case "8":
		        this.robot.keyPress(KeyEvent.VK_8);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_8);
		        break;
		      case "9":
		        this.robot.keyPress(KeyEvent.VK_9);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_9);
		        break;
		      case "-":
		        this.robot.keyPress(KeyEvent.VK_MINUS);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_MINUS);
		        break;
		      case "=":
		        this.robot.keyPress(KeyEvent.VK_EQUALS);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_EQUALS);
		        break;
		      case "!":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_1);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_1);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "@":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_2);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_2);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "#":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_3);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_3);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "$":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_4);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_4);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "^":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_5);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_5);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "&":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_6);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_6);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "*":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_7);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_7);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "(":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_8);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_8);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case ")":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_9);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_9);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "_":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_MINUS);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_1);
		        this.robot.keyRelease(KeyEvent.VK_MINUS);
		        break;
		      case "+":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_EQUALS);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_EQUALS);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "\t":
		        this.robot.keyPress(KeyEvent.VK_TAB);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_TAB);
		        break;
		      case "\n":
		        this.robot.keyPress(KeyEvent.VK_ENTER);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_ENTER);
		        break;
		      case "[":
		        this.robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
		        break;
		      case "]":
		        this.robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
		        break;
		      case "\\":
		        this.robot.keyPress(KeyEvent.VK_BACK_SLASH);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_BACK_SLASH);
		        break;
		      case ";":
		        this.robot.keyPress(KeyEvent.VK_SEMICOLON);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_SEMICOLON);
		        break;
		      case ":":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_SEMICOLON);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_SEMICOLON);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "'":
		        this.robot.keyPress(KeyEvent.VK_QUOTE);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_QUOTE);
		        break;
		      case "\"":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_QUOTE);
		        Thread.sleep(130);
		        
		        this.robot.keyRelease(KeyEvent.VK_QUOTE);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case ",":
		        this.robot.keyPress(KeyEvent.VK_COMMA);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_COMMA);
		        break;
		      case ".":
		        this.robot.keyPress(KeyEvent.VK_PERIOD);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_PERIOD);
		        break;
		      case "/":
		        this.robot.keyPress(KeyEvent.VK_SLASH);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_SLASH);
		        break;
		      case " ":
		        this.robot.keyPress(KeyEvent.VK_SPACE);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_SPACE);
		        break;
		      case "~":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_BACK_QUOTE);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_BACK_QUOTE);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "%":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_5);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_5);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "<":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_COMMA);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_COMMA);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case ">":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_PERIOD);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_PERIOD);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "?":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_SLASH);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_SLASH);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "{":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_OPEN_BRACKET);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "}":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_CLOSE_BRACKET);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "|":
		        this.robot.keyPress(KeyEvent.VK_SHIFT);
		        Thread.sleep(130);
		        this.robot.keyPress(KeyEvent.VK_BACK_SLASH);
		        Thread.sleep(130);
		        this.robot.keyRelease(KeyEvent.VK_BACK_SLASH);
		        this.robot.keyRelease(KeyEvent.VK_SHIFT);
		        break;
		      case "F1":
			        this.robot.keyPress(KeyEvent.VK_F1);
			        Thread.sleep(130);
			        this.robot.keyRelease(KeyEvent.VK_F1);
			        break;
		      case "F2":
			        this.robot.keyPress(KeyEvent.VK_F2);
			        Thread.sleep(130);
			        this.robot.keyRelease(KeyEvent.VK_F2);
			        break;
		      case "F3":
			        this.robot.keyPress(KeyEvent.VK_F3);
			        Thread.sleep(130);
			        this.robot.keyRelease(KeyEvent.VK_F3);
			        break;
		      case "F4":
			        this.robot.keyPress(KeyEvent.VK_F4);
			        Thread.sleep(130);
			        this.robot.keyRelease(KeyEvent.VK_F4);
			        break;
		      case "➄":
			        this.robot.keyPress(KeyEvent.VK_F5);
			        Thread.sleep(130);
			        this.robot.keyRelease(KeyEvent.VK_F5);
			        break;
		      case "➅":
			        this.robot.keyPress(KeyEvent.VK_F6);
			        Thread.sleep(130);
			        this.robot.keyRelease(KeyEvent.VK_F6);
			        break;
		      default:
		        throw new IllegalArgumentException("Cannot type character " + character);

		    }

		  }

	}

