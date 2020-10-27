package test;

import util.GameData;

public class GameDataTester {
	
	static GameData gd = new GameData();
	static long addr = 0x000000;
	static int val = 0;
	static boolean close = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		gd.probe(addr, val, close);
		
		
	}

}
