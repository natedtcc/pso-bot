public class ChatBot {

  public static void main(String[] args) {
    // Create new file handler
    ChatFileHandler handler = new ChatFileHandler();
    // Create new parser
    MessageParser parser = new MessageParser();
    // Create 2d array for holding parsed messages
    String[][] chats = parser.parseMessages();

    // Read the chats from the handler and pass to
    // the parser
    parser.setMessages(handler.readChats());
    chats = parser.parseMessages();


}