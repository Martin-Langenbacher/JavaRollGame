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

	
	
		
		
	
		public static void printDungeon(DungeonBoard dungeon, Point stepToThisPoint, ArrayList<Item> monsterAndItems) {
			
			int dungeonSize = dungeon.getBoardStrings().length;
			String[] stringToPrint = new String[dungeonSize];
			int index;
			char ch;
			
			
			// 1: String-Dungeon erstellen
			for (int i = 0; i < dungeonSize; i++) {
				stringToPrint[i] = dungeon.getBoardStrings()[i];
			}
			
			
			
			
			
			
			
			// 2: Strings mit Items erstellen
			for (int i = 0; i < monsterAndItems.size(); i++) {
				for (int j = 0; j < dungeonSize; j++) {
					if (j == monsterAndItems.get(i).getItemPosition().y && monsterAndItems.get(i).isVisible() == true) {
						index = (2 * monsterAndItems.get(i).getItemPosition().x);
						ch = monsterAndItems.get(i).getItemChar();
						StringBuilder myString = new StringBuilder(stringToPrint[j]);
						myString.setCharAt(index, ch);
						stringToPrint[j] = myString.toString();				
					}
				}
			}
			
			
			
			
			
			
			
			
			// 3: Strings mit Player hinzufügen
			for (int i = 0; i < dungeonSize; i++) {
				if (i == stepToThisPoint.y) {
					index = (2 * stepToThisPoint.x); // Achtung !!!
					ch = '*';
					StringBuilder myString = new StringBuilder(stringToPrint[i]);
					myString.setCharAt(index, ch);
					stringToPrint[i] = myString.toString(); 
				}
			}
			
			
			

			// 4: String drucken
			System.out.println();
			
			for (int i = 0; i < dungeonSize; i++) {
				System.out.println(stringToPrint[i]); 
			}
			
			
		}
			
	
	/*
		
		
		
		public static void printDungeon(DungeonBoard dungeonLevel1, Point stepToThisPoint, ArrayList<Item> monsterAndItems) {
		
		int dungeonSize = dungeonLevel1.getBoardStrings().length;
		String[] stringToPrint = new String[dungeonSize];
		int index;
		char ch;
		
		// 1: String-Dungeon erstellen
		for (int i = 0; i < dungeonSize; i++) {
			stringToPrint[i] = dungeonLevel1.getBoardStrings()[i];
		}
		
		// 2: Strings mit Items erstellen
		for (int i = 0; i < monsterAndItems.size(); i++) {
			for (int j = 0; j < dungeonSize; j++) {
				if (j == monsterAndItems.get(i).getItemPosition().y && monsterAndItems.get(i).isVisible() == true) {
					index = (2 * monsterAndItems.get(i).getItemPosition().x);
					ch = monsterAndItems.get(i).getItemChar();
					StringBuilder myString = new StringBuilder(stringToPrint[j]);
					myString.setCharAt(index, ch);
					stringToPrint[j] = myString.toString();				
				}
			}
		}
		
		
		// 3: Strings mit Player hinzufügen
		for (int i = 0; i < dungeonSize; i++) {
			if (i == stepToThisPoint.y) {
				index = (2 * stepToThisPoint.x);
				ch = '*';
				StringBuilder myString = new StringBuilder(stringToPrint[i]);
				myString.setCharAt(index, ch);
				stringToPrint[i] = myString.toString(); 
			}
		}
		
		
		
		// 4: String drucken
		System.out.println();
		
		for (int i = 0; i < dungeonSize; i++) {
			System.out.println(stringToPrint[i]); 
		}
	}			
}





		
		
		
		*/
		
		
		
		
		
	
	

}
