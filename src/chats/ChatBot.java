package chats;

import java.util.concurrent.atomic.AtomicBoolean;

public class ChatBot implements Runnable {

  private Thread chatbot;
  private final AtomicBoolean RUNNING = new AtomicBoolean(false);
  private int sleepTime;
  private int maxChats;
  private final int MAX_LENGTH = 40;
  private ChatFileHandler handler = new ChatFileHandler();
  // Create new parser
  private MessageParser parser = new MessageParser();

  /**
   * Create 2d array to hold chat strings. maxChats = max number of lines read
   * from the textfile MAX_LENGTH = max number of characters in any line of a
   * textfile
   */
  private String[][] chats = new String[maxChats][MAX_LENGTH];

  // Initialiaze type bot and set sleep time
  private ChatTyper bot = new ChatTyper();
  
  
  public ChatBot(int sleepTime) {
    this.sleepTime = sleepTime;
  }

  public void start() {
    chatbot = new Thread(this);
    chatbot.start();
  }

  public void stop() {
    RUNNING.set(false);
  }

  public void run() {
    RUNNING.set(true);
    while (RUNNING.get()) {
    		 
    	this.bot.setSleepTime(sleepTime);
    	// Read the chats from the handler and pass to
        // the parser
        this.parser.setMessages(handler.readChats());
        this.chats = parser.parseMessages();

        // Output chats to keyboard
        this.bot.type(chats);

    } 
      }
      

  /**
   * @param maxChats max number of chats to read from text file
   */
  public void setMaxChats(int maxChats) {
    this.maxChats = maxChats;
  }

  /**
   * @param sleepTime set the sleep time
   */
  public void setTime(int sleepTime) {
    this.sleepTime = sleepTime;
}
}
