package de.ml.game;

import java.awt.Point;
import java.util.ArrayList;

public class MovePlayer {
	
	// movePossible
		public static boolean movePossible(DungeonBoard dungeonLevel1, Point stepToThisPoint) {
			
			String checkThisString = dungeonLevel1.getBoardStrings()[stepToThisPoint.y];
			int index = (2 * stepToThisPoint.x);
			String ch = checkThisString.substring(index, index+1);		
			
			if (ch.equals("|") || ch.equals("=")) {
				//System.out.println("Zeichen: ---->'"+ ch +"'<----");
				return false;
			} else {
				if (ch.equals("#")) {
					System.out.println("Achtung Tür, es ist aber erlaubt auf dieses Feld zu treten...!");
				}
				//System.out.println("Zeichen: ---->'"+ ch +"'<----");
				return true;
			}
		}
		
		
}

	
	
		
	
	


