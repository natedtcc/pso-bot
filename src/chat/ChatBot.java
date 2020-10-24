package chat;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

import util.MessageParser;
import util.WarpBot;

public class ChatBot implements Runnable {

	private Thread chatbot;
	private final AtomicBoolean RUNNING = new AtomicBoolean(false);
	private ChatFileHandler handler = new ChatFileHandler();
	private MessageParser parser = new MessageParser();
	private WarpBot warpbot = new WarpBot();
	private String[][] chats;
	private ChatTyper bot = new ChatTyper();

	
	// Use constructor to set sleeptime between messages
	public ChatBot(int sleepTime) {
		this.bot.setSleepTime(sleepTime);
	}

	public void start() {
		// Start the thread
		chatbot = new Thread(this);
		chatbot.start();

	}

	public void stop() {
		RUNNING.set(false);
	}

	public void run() {
		RUNNING.set(true);
		while (RUNNING.get()) {
			try {
				// Warm up...
				TimeUnit.SECONDS.sleep(30);
				// Read the chats from the handler and assign the
				// messages to a string[][] chats
				this.parser.setMessages(handler.readChats());
				chats = this.parser.parseMessages();
				
				// Send each chat from the message text, sleeping
				// for (sleepTime) between each message
				for (int i = 0; i < chats.length; i++) {
					bot.typeChats(chats[i]);
					TimeUnit.MINUTES.sleep(bot.getSleepTime());
					
					// Warp the character every 2 minutes or so
					if (i%2==0 && i != 0) {
						warpbot.warp();
						TimeUnit.MINUTES.sleep(bot.getSleepTime()/ 2);
					}
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
