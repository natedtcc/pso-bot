package util;

import com.wgtools.jna.JnaUtils;
import com.wgtools.mem.WGTools;

public class GameData {

	protected final long WARP_ACTION_ADDRESS = 0x6FCAB0;
	protected final long WARP_TO_ADDRESS = 0x78F5A4;
	protected final long CURRENT_LOC_ADDRESS = 0x732F74;
	protected final long BASE_HP = 0x322A990;
	protected final long CURRENT_HP = 0x28BDED0;

	protected final String[] LOC_NAMES = 
		{ "Warping to Lobby..", "Warping to Pioneer 2..", "Warping to Forest 1..",
		"Warping to Forest 2..", "Warping to Dragon..", "Warping to Caves 1..", "Warping to Caves 2..",
		"Warping to Caves 3..", "Warping to De Ro Le..", "Warping to Mines 1..", "Warping to Mines 2..",
		"Warping to Vol Opt..", "Warping to Ruins 1..", "Warping to Ruins 2..", "Warping to Ruins 3..",
		"Warping to Dark Falz.."
		};
	
	public String[] getLocationStrings() {
		return LOC_NAMES;
	}

	protected final int[] LOC_INTS = { 15, 0, 1, 2, 11, 3, 4, 5, 12, 6, 7, 13, 8, 9, 10, 14 };
	protected int currentLoc;
	
	protected WGTools tools = new WGTools();
	public int getCurrentLoc() {
		return currentLoc;
	}

	public void setCurrentLoc(int currentLoc) {
		this.currentLoc = currentLoc;
	}

	public long getWarpActionAddress() {
		return WARP_ACTION_ADDRESS;
	}

	public long getWarpToAddress() {
		return WARP_TO_ADDRESS;
	}

	public long getCurrentLocationAddress() {
		return CURRENT_LOC_ADDRESS;
	}

	public long getBaseHPAddress() {
		return BASE_HP;
	}

	public long getCurrentHPAddress() {
		return CURRENT_HP;
	}

	public int[] getLocationInts() {
		return LOC_INTS;
	}

	public void open() {
		this.tools.open(JnaUtils.getWinHwnd("PSO for PC").get(0));
	}
	
	public int readInt(long address) {
		return this.tools.readInt(address);
	}
	
	public void writeInt(long address, int value) {
		this.tools.writeInt(address, value);
	}
	
	public void close() {
		this.tools.close();
	}
	
	public void probe(long addr, int val, boolean close) {
		this.tools.open(JnaUtils.getWinHwnd("PSO for PC").get(0));
		this.tools.writeInt(addr, val);
		if (close)
		this.tools.close();
	}

	public void fullHeal() {
		int base = this.tools.readInt(BASE_HP);
		this.tools.writeInt(CURRENT_HP, base);
	}

//		  public static void main(String[] args) {
//		    tools.open(JnaUtils.getWinHwnd("PSO for PC").get(0));
//		    boolean runs = true;
//		    int hp;
//		    System.out.println("Test");
//		    int base = tools.readInt(BASE_HP);
//		    while (runs) {
//		      hp = tools.readInt(CURRENT_HP);
//		      if (hp < base) {
//		        tools.writeInt(CURRENT_HP, base);
//		      }

}
