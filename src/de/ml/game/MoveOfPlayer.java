package de.ml.game;

import java.awt.Point;

public class MoveOfPlayer {
	
	// movePossible
	public static boolean movePossible(DungeonBoard dungeonLevel1, Point stepToThisPoint) {
		
		System.out.println("9-Zeile: " +dungeonLevel1.getBoardStrings()[9]);
		
		String testString = dungeonLevel1.getBoardStrings()[9];
		System.out.println("testString: -->" +testString);
		
		StringBuilder myString = new StringBuilder(dungeonLevel1.getBoardStrings()[stepToThisPoint.y+1]); // just for the test...
		//StringBuilder myString = new StringBuilder(dungeonLevel1.getBoardStrings()[stepToThisPoint.y]);
		int index = (2 * stepToThisPoint.x);
		char ch = 'A';
		myString.setCharAt(index, ch);
		
		
		
		
		
		testString = myString.toString();
		System.out.println("testString: -->" +testString);
		
		return true;
	}
		
		
		
		
		/*
		
		public String replaceChar(String str, char ch, int index) {
    StringBuilder myString = new StringBuilder(str);
    myString.setCharAt(index, ch);
    return myString.toString();
}
		
		
		
		
		
		dungeonLevel1.getBoardStrings()..
		
		boardStrings[8] =  "|=======|           |";
		String[] boardStrings2 = new String[4];
		dungeonLevel1.setBoardStrings(boardStrings2)[8];
		
		
		
		dungeonLevel1.setNameOfBoard("Bla");
		String[] srings2 = new String[4],
		String[][] bla;
		dungeonLevel1.setBoardStrings(String[] string2[]);
		//new String[numberOfLinesForLevel1Dungeon],
		
		
/*
		public String getNameOfBoard() {
			return nameOfBoard;
		}
		public void setNameOfBoard(String nameOfBoard) {
			this.nameOfBoard = nameOfBoard;
		}
		public String[] getBoardStrings() {
			return boardStrings;
		}
		public void setBoardStrings(String[] boardStrings) {
			this.boardStrings = boardStrings;
		}
		
		
		
		//boardStrings[0] =  "==============#======";
		
		
		public void setBoardStrings(String[] boardStrings) {
			this.boardStrings = boardStrings;
		}
		
		
		
		
		.setBoardStrings(String[] myString.toString());
		dungeonLevel1.setBoardStrings((myString.toString()))[8]; +/
		
		System.out.println("9-Zeile: " +dungeonLevel1.getBoardStrings()[stepToThisPoint.y]);
		
		System.out.println(dungeonLevel1.getBoardStrings()[9].length());
		//System.out.println("Player-Pos-X: " +player.getCharacterPosition().x);
		//System.out.println("Player-Pos-Y: " +player.getCharacterPosition().y);
		
		//return false;
		return true;
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

}




/*




package AndreUebungObjectOrientiert;

public class C {
	
	public static void foo2() {}

}

*/