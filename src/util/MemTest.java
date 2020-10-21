package util;

import java.util.concurrent.atomic.AtomicBoolean;

import com.sun.jna.Memory;
import com.wgtools.jna.JnaUtils;
import com.wgtools.mem.WGTools;

import chat.ChatTyper;

public class MemTest implements Runnable {

	// Define mem addresses that effect character warping,
	// setting the destination before warping, and an array
	// of potential locations.
	private final String[] LOC_NAMES = { "Warping to Pioneer 2..", "Warping to Forest 1..", "Warping to Forest 2..",
			"Warping to Dragon..", "Warping to Caves 1..", "Warping to Caves 2..", "Warping to Caves 3..",
			"Warping to De Ro Le..", "Warping to Mines 1..", "Warping to Mines 2..", "Warping to Vol Opt..",
			"Warping to Ruins 1..", "Warping to Ruins 2..", "Warping to Ruins 3..", "Warping to Dark Falz..",
			"Warping to Lobby.." };
	private final AtomicBoolean RUNNING = new AtomicBoolean(false);
	private final long WARP_ADDRESS = 0x6FCAB0;
	private final long LOCATION_ADDRESS = 0x78F5A4;
	private final int[] LOCATIONS = { 0, 1, 2, 11, 3, 4, 5, 12, 6, 7, 13, 8, 9, 10, 14, 15 };
	private Thread warpBot;
	private Input[] input = new Input[15];
	private int sleepTime;
	private ChatTyper typer;
	private MessageParser parser = new MessageParser();
	private WGTools tools = new WGTools();

	// Set sleep time between messages
	public MemTest(int sleepTime) {
		this.sleepTime = sleepTime;
	}

	public void start() {
		warpBot = new Thread(this);
		warpBot.start();
	}

	public void stop() {
		RUNNING.set(false);
	}

	public void run() {
	    RUNNING.set(true);
	    while (RUNNING.get()) {
		for (int i=0; i < LOCATIONS.length; i++) {
			input[i] = new Input();
			input[i].setMessage(LOC_NAMES[1]);
		}
		
		typer.setSleepTime(1);
		
		parser.setMessages(input);
		typer.typeChats(parser.parseMessages());
		
		// Open PSO via window name
		tools.open(JnaUtils.getWinHwnd("PSO for PC").get(0));
		
		// Write an int to address in memory (represents a location to warp to)
		tools.writeInt(LOCATION_ADDRESS, 0);
		
		// Write a 1 to the address in memory (represents a boolean - will warp if 1)
		// Game reverts warp address int back to 0 after a successful warp
		tools.writeInt(WARP_ADDRESS, 1);
		
		// Close the tools object
		tools.close();
		
	}

}}
