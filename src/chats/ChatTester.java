package chats;

public class ChatTester {

  public static void main(String[] args) {
    // Create new file handler
    ChatFileHandler handler = new ChatFileHandler();
    // Create new parser
    MessageParser parser = new MessageParser();
    // Create 2d array for holding parsed messages
    String[][] chats = null;

    // Read the chats from the handler and pass to
    // the parser
    parser.setMessages(handler.readChats());
    chats = parser.parseMessages();
    chats = parser.parseMessages();

    // Print test

    for (int i = 0; i < chats.length; i++) {
      for (int j = 0; j < chats[i].length; j++) {
        if (chats[i][j] != null)
          System.out.println(chats[i][j]);
      }
    }

  }

}