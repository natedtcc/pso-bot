package util;

import chat.ChatTyper;

public class WarpBot extends GameData {

	// Define mem addresses that effect character warping,
	// setting the destination before warping, and an array
	// of potential locations.

	
	private Input[] input = new Input[16];
	private ChatTyper typer = new ChatTyper();
	private MessageParser parser = new MessageParser();
	String[][] messages;

	// Set sleep time between warps

	public WarpBot() {
    	for (int i=0; i < LOC_NAMES.length; i++) {
    		input[i] = new Input();
    		input[i].setMessage(LOC_NAMES[i]);
    	}
    	parser.setMessages(input);
    	messages = parser.parseMessages();
	}

	public void warp() {
		// Open PSO via window name
		open();
		int currentLoc;
		// Check the current location based on index
		currentLoc = readInt(CURRENT_LOC_ADDRESS);
		int locIndex = 0;
		for (int i=0; i<LOC_INTS.length;i++) {
			if (LOC_INTS[i] == currentLoc) {
				locIndex = i;
				break;
			}
		}
		if (currentLoc == 14) {
			locIndex=0;
			typer.typeChats(messages[locIndex]);
			writeInt(WARP_TO_ADDRESS, LOC_INTS[locIndex]);
		}
    	
		else {
			typer.typeChats(messages[locIndex+1]);
		
			// Write an int to address in memory (represents a location to warp to)
			writeInt(WARP_TO_ADDRESS, LOC_INTS[locIndex+1]);
		}
			// Heal the character before warping
			fullHeal();
			
			// Write a 1 to the address in memory (represents a boolean - will warp if 1)
			// Game reverts warp address int back to 0 after a successful warp
			writeInt(WARP_ACTION_ADDRESS, 1);
			
	    	// Reset the index once loop is finished
	    	locIndex = 0;
			
		
	    close();
	    

	}
	}
	
