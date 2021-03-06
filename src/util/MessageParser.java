﻿package util;

public class MessageParser {

  private Input[] messages = new Input[40];

  /**
   * @return the message
   */
  public Input[] getMessages() {
    return this.messages;
  }

  /**
   * @param message the message to set
   */
  public void setMessages(Input[] messages) {
    this.messages = messages;
  }

  /**
   * Parses a string (or chat text) to a split array for the message builder
   * 
   * @return String[]
   */
  
  public String[][] parseMessages() {
    String[][] parsed = new String[40][40];
    
    // For condition checks if array contains empty elements
    
    for (int i = 0; i < this.messages.length && this.messages[i] != null; i++) {
      parsed[i] = this.messages[i].getMessage().split("");
    }
    return parsed;
  }

}
