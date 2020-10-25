package test;

import com.wgtools.jna.JnaUtils;
import com.wgtools.mem.WGTools;

public class GameData {

		  private static final long WARP_ACTION_ADDRESS = 0x6FCAB0;
		  private static final long WARP_TO_ADDRESS = 0x78F5A4;
		  private static final long CURRENT_LOC_ADDRESS = 0x732F74;
		  private static final long BASE_HP = 0x322A990;
		  private static final long CURRENT_HP = 0x28BDED0;
		  private static final int[] LOC_INT = { 15, 0, 1, 2, 11, 3, 4, 5, 12, 6, 7, 13, 8, 9, 10, 14 };
		  private static int currentLoc;
		  private static WGTools tools = new WGTools();

		  public static void main(String[] args) {
		    tools.open(JnaUtils.getWinHwnd("PSO for PC").get(0));
		    boolean runs = true;
		    int hp;
		    System.out.println("Test");
		    int base = tools.readInt(BASE_HP);
		    while (runs) {
		      hp = tools.readInt(CURRENT_HP);
		      if (hp < base) {
		        tools.writeInt(CURRENT_HP, base);
		      }

		    }
		  }

		}


