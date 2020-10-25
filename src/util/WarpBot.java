package util;

import com.wgtools.jna.JnaUtils;
import com.wgtools.mem.WGTools;

import chat.ChatTyper;
import test.GameData;

public class WarpBot  {

	// Define mem addresses that effect character warping,
	// setting the destination before warping, and an array
	// of potential locations.
	private final String[] LOC_NAMES = {"Warping to Lobby..", "Warping to Pioneer 2..", "Warping to Forest 1..", "Warping to Forest 2..",
			"Warping to Dragon..", "Warping to Caves 1..", "Warping to Caves 2..", "Warping to Caves 3..",
			"Warping to De Ro Le..", "Warping to Mines 1..", "Warping to Mines 2..", "Warping to Vol Opt..",
			"Warping to Ruins 1..", "Warping to Ruins 2..", "Warping to Ruins 3..", "Warping to Dark Falz.."
			 };
	
	private GameData gamedata = new GameData();
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
		gamedata.tools.open(JnaUtils.getWinHwnd("PSO for PC").get(0));
		int currentLoc;
		// Check the current location based on index
		currentLoc = gamedata.tools.readInt(gamedata.getCURRENT_LOC_ADDRESS());
		int locIndex = 0;
		for (int i=0; i<gamedata.getLOC_INT().length;i++) {
			if (gamedata.getLOC_INT()[i] == currentLoc) {
				locIndex = i;
				break;
			}
		}
		if (currentLoc == 14) {
			locIndex=0;
			typer.typeChats(messages[locIndex]);
			gamedata.tools.writeInt(gamedata.getWARP_TO_ADDRESS(), gamedata.getLOC_INT()[locIndex]);
		}
    	
		else {
			typer.typeChats(messages[locIndex+1]);
		
			// Write an int to address in memory (represents a location to warp to)
			gamedata.tools.writeInt(gamedata.getWARP_TO_ADDRESS(), gamedata.getLOC_INT()[locIndex+1]);
		}
			// Write a 1 to the address in memory (represents a boolean - will warp if 1)
			// Game reverts warp address int back to 0 after a successful warp
			gamedata.tools.writeInt(gamedata.getWARP_ACTION_ADDRESS(), 1);
			
		
	    	// Reset the index once loop is finished
	    	locIndex = 0;
			
		
	    gamedata.tools.close();
	    

	}
	}
	
