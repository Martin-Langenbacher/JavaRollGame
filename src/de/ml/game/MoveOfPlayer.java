package de.ml.game;

import java.awt.Point;
import java.util.ArrayList;

public class MoveOfPlayer {
	
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








	/*


public String replaceChar(String str, char ch, int index) {
    StringBuilder myString = new StringBuilder(str);
    myString.setCharAt(index, ch);
    return myString.toString();
}


                            012--> x2
		boardStrings[0] =  "==============#======";
		boardStrings[1] =  "| 1.2.3.4.5.6.7 |XXX|";
		boardStrings[2] =  "| 2 |===============|";
		boardStrings[3] =  "| 3 |   |           |";
		boardStrings[4] =  "| 4 |   |   |   |===|";
		boardStrings[5] =  "| 5 |   |   |       |";
		boardStrings[6] =  "| 6 |   |=======|   |";
		boardStrings[7] =  "| 7   3b3a2.|       |";
		boardStrings[8] =  "|=8=====| 1         |";
		boardStrings[9] =  "|X9XXXXX| * |       |";
		boardStrings[10] = "==========#==========";
		
		
--> Matrix von (0-10, 0-10)

--> StartPunkt: (5,9)
>>> hoch      : (5,8)
>>> runter	  : (5,10)
>>> links     : (4,9)
>>> rechts    : (6,9)
		
		
		
  1 2 3 4 5 6 7 8 9 X
==============#========1==   0
|               |XXX|  2 *   1
| & |===============|  3     2
|   |   | S         #  4 *   3
|   |   |   |   |===|  5     4
#   |   |   |   |   |  6 *   5
|   | $ |=======|   |  7     6
|           |       |  8 *   7
|=======|           |  9     8
|XXXXXXX| * |       | 10 *   9
==========#========== 11     0
123456789012345678901


	
	*/
		
			
