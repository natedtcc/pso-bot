package chats;

public class MessageParser {

  private Chats[] messages = new Chats[20];

  /**
   * @return the message
   */
  public Chats[] getMessages() {
    return this.messages;
  }

  /**
   * @param message the message to set
   */
  public void setMessages(Chats[] messages) {
    this.messages = messages;
  }

  /**
   * Parses a string (or chat text) to a split array for the message builder
   * 
   * @return String[]
   */
  public String[][] parseMessages() {
    String[][] parsed = new String[20][40];
    for (int i = 0; i < this.messages.length && this.messages[i] != null; i++) {
      parsed[i] = this.messages[i].getMessage().split("");
    }
    return parsed;
  }

}
