package util;

import chat.ChatTyper;

public class WarpBot  {

	// Define mem addresses that effect character warping,
	// setting the destination before warping, and an array
	// of potential locations.

	
	private GameData gamedata = new GameData();
	private Input[] input = new Input[16];
	private ChatTyper typer = new ChatTyper();
	private MessageParser parser = new MessageParser();
	String[][] messages;

	// Set sleep time between warps

	public WarpBot() {
    	for (int i=0; i < gamedata.getLocationStrings().length; i++) {
    		input[i] = new Input();
    		input[i].setMessage(gamedata.getLocationStrings()[i]);
    	}
    	parser.setMessages(input);
    	messages = parser.parseMessages();
	}

	public void warp() {
		// Open PSO via window name
		gamedata.open();
		int currentLoc;
		// Check the current location based on index
		currentLoc = gamedata.readInt(gamedata.getCurrentLocationAddress());
		int locIndex = 0;
		for (int i=0; i<gamedata.getLocationInts().length;i++) {
			if (gamedata.getLocationInts()[i] == currentLoc) {
				locIndex = i;
				break;
			}
		}
		if (currentLoc == 14) {
			locIndex=0;
			typer.typeChats(messages[locIndex]);
			gamedata.writeInt(gamedata.getWarpToAddress(), gamedata.getLocationInts()[locIndex]);
		}
    	
		else {
			typer.typeChats(messages[locIndex+1]);
		
			// Write an int to address in memory (represents a location to warp to)
			gamedata.writeInt(gamedata.getWarpToAddress(), gamedata.getLocationInts()[locIndex+1]);
		}
			// Write a 1 to the address in memory (represents a boolean - will warp if 1)
			// Game reverts warp address int back to 0 after a successful warp
			gamedata.writeInt(gamedata.getWarpActionAddress(), 1);
			
		
	    	// Reset the index once loop is finished
	    	locIndex = 0;
			
		
	    gamedata.close();
	    

	}
	}
	
