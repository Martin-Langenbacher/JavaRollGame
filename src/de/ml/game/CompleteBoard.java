package de.ml.game;

import java.text.DecimalFormat;
import java.util.ArrayList;

public final class CompleteBoard {
	
	// 3 ways to initiate an array:
	
	// a) this.board = new String[]{"asdf", "asdf"};
	// b) String[] namen = new String[5];
	// c) String nachkommen = {"asdf", "asdf", "asdf"}
	
	static int fightResult;
	
	private String[] board;
	private String messageString;
	int zahl;
	int zahl2;
	String stringItems;
	int lengthOfNumber;
	int lengthOfString;
	int lengthOfZahl;
	String empty = " ";
	String zahlString;
	String zahlString2;
	int itemsCounter;
	int delta;
	boolean fighting = false;
	boolean aufgabe = false;
	String lifePoints;
	
	
	
//==============================================================================================	
	// getter & setter
	public boolean isFighting() {
		return fighting;
	}


	public void setFighting(boolean fighting) {
		this.fighting = fighting;
	}


	public boolean isAufgabe() {
		return aufgabe;
	}


	public void setAufgabe(boolean aufgabe) {
		this.aufgabe = aufgabe;
	}
	
	
//==============================================================================================






	public CompleteBoard() {
		super();
		this.board = new String[]{
				" |================================================================================================|", 
				" |   Player            |    Level    01  |     Dungeon Level 1                                    |", 
				" |=======================================|                                                        |",
				" |   Life:  +++++|+++++|+++++|+++++ (20) |                                                        |",
				" |=======================================|                                                        |",
				" |   Experience:    10.000               |                    ==============#======               |",
				" |   Gold:           2.000               |                    |               |XXX|               |",
				" |   Strength:          16               |                    | & |===============|               |", 
				" |   Defense:           12               |                    |   |   | S         #               |",
				" |=======================================|                    |   |   |   |   |===|               |",
				" |                                       |                    #   |   |   |       |               |",
				" |   Tools:         Dungeon key:   Yes   |                    |   | $ |=======|   |               |", 
				" |---------------------------------------|                    |           |       |               |",
				" |   Weapon:        Langschwert    (10)  |                    |=======|           |               |",
				" |   Weapon (2):    Bogen           (3)  |                    |XXXXXXX| * |       |               |", 
				" |   Heiltrank:     Buntkraut       (3)  |                    ==========#==========               |",
				" |   Item:          Rusty key            |                                                        |",
				" |   Item 2:        Water bottle         |                                                        |",
				" |   Item 3:        Ring            (3)  |                                                        |", 
				" |=======================================|========================================================|", 
				" |   Move:   |      Fight:               |                     Player | Schmunzel-Monster (500)   |", 
				" |-----------|---------------------------|--------------------------------------------------------|", 
				" |     e     |      k: run               |  Angriff:               11 |   4                       |", 
				" |   s + d   |      h: use healing       |  Verteidigung:           8 |   2                       |", 
				" |     x     |                           |  Lebenspunkte (neu):     9 |   0                       |",
				" |================================================================================================|", 
				" |   ==> Bitte wählen!                   |      --->  Player won and gets xy-experience           |", 
				" ==================================================================================================",
		};
	}






	public void printBoard() {
		
		for (int i = 0; i < board.length; i++) {
			System.out.println(board[i]);
		}
		
	}


	
	// String manupulation:
	
	/*
	  
	String.length() gibt die Länge eines Strings zurück.
	String.substring(int beginn, int ende) gibt einen Teilstring zurück.
	String.indexOf(String str, int von) gibt die Position des ersten Vorkommens eines Strings ab der spezifizierten Position zurück.

==================================================================    

	String str = "abc";
	String repeated = str.repeat(3);
	repeated.equals("abcabcabc");
	
================================================================== 
	
	StringBuilder sbf = new StringBuilder("We are geeks  "); 
	System.out.println(sbf); 
	
	// Char array 
	char[] astr = new char[] { 'G', 'E', 'E', 'k', 'S' };
	
	// Appends string representation of char array to this String Builder
	sbf.append(astr); 
    System.out.println("Result after" + " appending = " + sbf); 
    
---------------------------------------------------------------------------------------------------------
===>> https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuilder.html
---------------------------------------------------------------------------------------------------------
    StringBuffer(), StringBuilder() Legt ein neues Objekt an, das die leere Zeichenreihe enthält und Platz für (zunächst) bis zu 16 Zeichen bietet. Bei Bedarf wird automatisch Platz für weitere Zeichen bereitgestellt.

    StringBuffer( int length ), StringBuilder( int length ) Wie oben, jedoch reicht die anfängliche Kapazität des Objekts für die angegebene Anzahl an Zeichen. Optimalerweise ist die Größe so zu setzen, dass sie der Endgröße der dynamischen Zeichenfolge nahekommt.

    StringBuffer( String str ), StringBuilder( String str ) Baut ein Objekt, das eine Kopie der Zeichen aus str enthält. Zusätzlich wird bereits Platz für 16 weitere Zeichen eingeplant.

    StringBuffer( CharSequence seq ), StringBuilder( CharSequence seq ) Erzeugt ein neues Objekt aus einer CharSequence. Damit können auch die Zeichenfolgen anderer StringBuffer- und StringBuilder-Objekte Basis dieses Objekts werden.



    public static String join( Object... strings {
        StringBuilder result = new StringBuilder();
        for ( Object string : strings result.append( string );
        
        return result.toString();
        }
    
    --> String toString() Erzeugt aus der aktuellen Zeichenkette ein String-Objekt.
======================================================================================== 
				
	*/
	
	
	
	
	
	
	
	
	
	
	
	




	public void printBoard(DungeonBoard dungeon, Character player, ArrayList<Item> monsterAndItems, ArrayList<Item> itemsOfCharacter, Character monster) {
		
		String[] boardWithContent = new String[board.length];
		itemsCounter = 0;
		
		//System.out.println(board[0].length() + "<==== Länge des Boards (x-Achse) !!!!!!!!!!!!!!!!!!!!!!!!");
		//System.out.println(board.length + "<==== Länge des Boards (y-Achse) !!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
		
		final DecimalFormat twoDigits = new java.text.DecimalFormat( "##,###" ); 
		
		
		// System.out.println(itemsOfCharacter.size() + "-----------------------------------------> SIZE!");
		// System.out.println("----------------------------------------------------------->" +itemsOfCharacter.get(0).getItemName());
		
		
		// fighting = true;
		// System.out.println(" >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" +fighting +"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		

		
		for (int i = 0; i < board.length; i++) {
			switch (i) {
			case 1:
				boardWithContent[i] = " |   " +player.getCharacterName() +"            |    Level     " + player.getCharacterLevel() + "  |     " +dungeon.getNameOfBoard() +" (Level " + dungeon.getLevelOfBoard() + ")                             |";
				break;
			case 3:
				lifePoints = lifePointString(player.getLifePoints());
				boardWithContent[i] = " |   Life:  " +lifePoints +" (" +player.getLifePointMax() +") "+dungeon.getBoardStrings()[0];
				break;
			case 4:
				boardWithContent[i] = " |=======================================" +dungeon.getBoardStrings()[1];
				break;
			case 5:
				zahl = player.getExperience();
				zahlString = "" + zahl;
				lengthOfNumber = zahlString.length();
				if (lengthOfNumber > 3) {
					lengthOfNumber = lengthOfNumber + 1;
				}
				boardWithContent[i] = " |   Experience:" + empty.repeat(10-lengthOfNumber) + twoDigits.format(zahl) + "               " +dungeon.getBoardStrings()[2];
				break;
			case 6:
				zahl = player.getGold();
				zahlString = "" + zahl;
				lengthOfNumber = zahlString.length();
				if (lengthOfNumber > 3) {
					lengthOfNumber = lengthOfNumber + 1;
				}
				boardWithContent[i] = " |   Gold:" + empty.repeat(16-lengthOfNumber) + twoDigits.format(zahl) + "               " +dungeon.getBoardStrings()[3];
				break;
			case 7:
				zahl = player.getStrength();
				zahlString = "" + zahl;
				lengthOfNumber = zahlString.length();
				if (lengthOfNumber > 3) {
					lengthOfNumber = lengthOfNumber + 1;
				}
				boardWithContent[i] = " |   Strength:" + empty.repeat(12-lengthOfNumber) + twoDigits.format(zahl) + "               " +dungeon.getBoardStrings()[4];
				break;
			case 8:
				zahl = player.getDefense();
				zahlString = "" + zahl;
				lengthOfNumber = zahlString.length();
				if (lengthOfNumber > 3) {
					lengthOfNumber = lengthOfNumber + 1;
				}
				boardWithContent[i] = " |   Defense:" + empty.repeat(13-lengthOfNumber) + twoDigits.format(zahl) + "               "+dungeon.getBoardStrings()[5];
				break;
			case 9:
				boardWithContent[i] = " |=======================================" +dungeon.getBoardStrings()[6];
				break;
			case 10:
				boardWithContent[i] = " |                                       " +dungeon.getBoardStrings()[7];
				break;
			case 11:
				boardWithContent[i] = " |   Tools:         Dungeon key:   Yes   " +dungeon.getBoardStrings()[8];
				break;
			case 12:
				boardWithContent[i] = " |---------------------------------------" +dungeon.getBoardStrings()[9];
				break;
			case 13:
				zahl = itemsOfCharacter.get(0).getItemStrength();
				zahlString = "" + zahl;
				lengthOfNumber = zahlString.length();
				stringItems = itemsOfCharacter.get(0).getItemName();
				lengthOfString = stringItems.length();
				delta = 17 - lengthOfString;
				boardWithContent[i] = " |   Weapon:" + empty.repeat(8) + stringItems + empty.repeat(delta-lengthOfNumber) + "(" +twoDigits.format(zahl) +")  " +dungeon.getBoardStrings()[10];
				itemsCounter++;
				break;
			case 14:
				if (itemsOfCharacter.size() > (itemsCounter)) {
					zahl = itemsOfCharacter.get(itemsCounter).getItemStrength();
					zahlString = "" + zahl;
					lengthOfNumber = zahlString.length();
					stringItems = itemsOfCharacter.get(itemsCounter).getItemName();
					lengthOfString = stringItems.length();
					delta = 17 - lengthOfString;
					boardWithContent[i] = " |   Weapon 2:" + empty.repeat(6) + stringItems + empty.repeat(delta-lengthOfNumber) + "(" +twoDigits.format(zahl) +")  " +dungeon.getBoardStrings()[11];
				} else {
					boardWithContent[i] = " |                                       |    |              |XXXXXXX|   |       |                |";
				}
				itemsCounter++;
				break;
			case 15:
				if (itemsOfCharacter.size() > (itemsCounter)) {
					zahl = itemsOfCharacter.get(itemsCounter).getItemStrength();
					zahlString = "" + zahl;
					lengthOfNumber = zahlString.length();
					stringItems = itemsOfCharacter.get(itemsCounter).getItemName();
					lengthOfString = stringItems.length();
					delta = 17 - lengthOfString;
					boardWithContent[i] = " |   Item:" + empty.repeat(10) + stringItems + empty.repeat(delta-lengthOfNumber) + "(" +twoDigits.format(zahl) +")  " +dungeon.getBoardStrings()[12];
				} else {
					boardWithContent[i] = " |                                       |    |              ==========#==========                |";
				}
				itemsCounter++;
				break;
			case 16:
				if (itemsOfCharacter.size() > (itemsCounter)) {
					zahl = itemsOfCharacter.get(itemsCounter).getItemStrength();
					zahlString = "" + zahl;
					lengthOfNumber = zahlString.length();
					stringItems = itemsOfCharacter.get(itemsCounter).getItemName();
					lengthOfString = stringItems.length();
					delta = 17 - lengthOfString;
					boardWithContent[i] = " |   Item 2:" + empty.repeat(8) + stringItems + empty.repeat(delta-lengthOfNumber) + "(" +twoDigits.format(zahl) +")  " +dungeon.getBoardStrings()[13];
				} else {
					boardWithContent[i] = " |                                       " +dungeon.getBoardStrings()[13];
				}
				itemsCounter++;
				break;
			case 17:
				if (itemsOfCharacter.size() > (itemsCounter)) {
					zahl = itemsOfCharacter.get(itemsCounter).getItemStrength();
					zahlString = "" + zahl;
					lengthOfNumber = zahlString.length();
					stringItems = itemsOfCharacter.get(itemsCounter).getItemName();
					lengthOfString = stringItems.length();
					delta = 17 - lengthOfString;
					boardWithContent[i] = " |   Item 3:" + empty.repeat(8) + stringItems + empty.repeat(delta-lengthOfNumber) + "(" +twoDigits.format(zahl) +")  " +dungeon.getBoardStrings()[14];
				} else {
					boardWithContent[i] = " |                                       " +dungeon.getBoardStrings()[14];
				}
				itemsCounter++;
				break;
			case 18:
				if (itemsOfCharacter.size() > (itemsCounter)) {
					zahl = itemsOfCharacter.get(itemsCounter).getItemStrength();
					zahlString = "" + zahl;
					lengthOfNumber = zahlString.length();
					stringItems = itemsOfCharacter.get(itemsCounter).getItemName();
					lengthOfString = stringItems.length();
					delta = 17 - lengthOfString;
					boardWithContent[i] = " |   Item 4:" + empty.repeat(8) + stringItems + empty.repeat(delta-lengthOfNumber) + "(" +twoDigits.format(zahl) +")  |                                                         |";
				} else {
					boardWithContent[i] = " |                                       |                                                        |";
				}
				itemsCounter++;
				break;
			case 20:
				if (fighting) { 
					zahl = monster.getCharacterName().length();
					boardWithContent[i] = " |   Move:   |      Fight:               |                     " + player.getCharacterName() + " | " +monster.getCharacterName() + " (" +monster.getExperience() +")" + empty.repeat(20-zahl) + "|";			
				} else {
					boardWithContent[i] = " |   Move:   |                           |                                                        |";
				}
				break;
			case 22:
				if (fighting) {
					zahl = player.getDiceResult();
					zahlString = "" + zahl;
					lengthOfString = zahlString.length();
					
					zahl2 = monster.getDiceResult();
					zahlString2 = "" + zahl2;
					lengthOfZahl = zahlString2.length();
					
					boardWithContent[i] = " |     e     |      k: run               |  Dice result:" +empty.repeat(13-lengthOfString) + zahl + " |" +empty.repeat(4-lengthOfZahl) +zahl2 + empty.repeat(23) + "|";
					
				} else {
					boardWithContent[i] = " |     e     |                           |                                                        |";
				}
				break;
			case 23:
				if (fighting) {
					zahl = player.getFightValue();
					zahlString = "" + zahl;
					lengthOfString = zahlString.length();
					
					zahl2 = monster.getFightValue();
					zahlString2 = "" + zahl2;
					lengthOfZahl = zahlString2.length();
					
					boardWithContent[i] = " |   s + d   |      h: use healing       |  Fighting value:" +empty.repeat(10-lengthOfString) + zahl + " |" +empty.repeat(4-lengthOfZahl) +zahl2 + empty.repeat(23) + "|";
					
				} else if (aufgabe){
					boardWithContent[i] = " |   s + d   |                           |     Calculate fast, to get most points:                |";
				}else {
					boardWithContent[i] = " |   s + d   |                           |                                                        |";
				}
				break;
			case 24:
				if (fighting) {
					zahl = player.getLifePoints();
					zahlString = "" + zahl;
					lengthOfString = zahlString.length();
					
					zahl2 = monster.getLifePoints();
					zahlString2 = "" + zahl2;
					lengthOfZahl = zahlString2.length();
					
					boardWithContent[i] = " |     x     |                           |  Life points (new):" +empty.repeat(7-lengthOfString) + zahl + " |" +empty.repeat(4-lengthOfZahl) +zahl2 + empty.repeat(23) + "|";
					
				} else {
					boardWithContent[i] = " |     x     |                           |                                                        |";
				}
				break;
			case 26:
				if (fighting) {
					boardWithContent[i] = " |   ==> Bitte wählen!                   " + messageString;
				} else if (aufgabe) {
					boardWithContent[i] = " |   ==> Bitte wählen!                   " + messageString;
				}else {
					boardWithContent[i] = " |   ==> Bitte wählen!                   |                                                        |";
				}
				break;
			default: // 0, 2, 4, 19, 21, 25, 27  
				boardWithContent[i] = board[i];
				break;
			}
			System.out.println(boardWithContent[i]);
		}
		
	}




	private String lifePointString(int lifes) {
		String lifePointString = "";
		for (int i = 1; i < 21; i++) {
			if (i < lifes+1) {
				if (i == 6 || i == 11 || i == 16) {
					lifePointString = lifePointString + "|\u2665";
				} else {
					lifePointString = lifePointString + "\u2665";
				}
			} else {
				if (i == 6 || i == 11 || i == 16) {
					lifePointString = lifePointString + empty.repeat(2);
				} else {
					lifePointString = lifePointString + empty;
				}
			}
		}
		return lifePointString;
	}


	


	public void fightingWithMonster(CompleteBoard completeBoard, Character player, Character monster) {
		
		int playerDiceResult;
		int monsterDiceResult;
		int playerFightValue;
		int monsterFightValue;
		
		// result rauslöschen !
		int result;
		
		
	
			
		playerDiceResult = (int) ((Math.random() * 6) + 1);
		monsterDiceResult = (int) ((Math.random() * 6) + 1);
		
		playerFightValue = player.getStrength() + playerDiceResult;   // + Waffen-Wert...!
		monsterFightValue = monster.getStrength() + monsterDiceResult;
		
		fightResult = playerFightValue - monsterFightValue;
		result = fightResult; 
		
		// Würfel + Stärke + Waffe = Kampfwert
		
		// --> Spiel: StärkeP. + WürfelP. == Kampfwert
		
		// P: 2 + 2 +5 ==> 9 
		// M: 6 +2 ==> 8
		// Pasch ist besser und wird addiert!
		 
		// P-M = 9-8 = 1  (Gewinner)
		// M-P = 8-9 = -1 (
		
		
		player.setDiceResult(playerDiceResult);
		monster.setDiceResult(monsterDiceResult);
		
		player.setFightValue(playerFightValue);
		monster.setFightValue(monsterFightValue);


		
		// Differenz der Werte = Ergebnis: Dieses Ergebnis wird dem Verlierer den lebenspunkten abgezogen...
		zahl = result;
		zahlString = "" + zahl;
		lengthOfNumber = zahlString.length();
		
		
		
		if (result > 0) {
			zahl2 = monster.getCharacterName().length();
			delta = 22 - zahl2;
			monster.setLifePoints(monster.getLifePoints()-result);
			messageString = "|     --->  " + monster.getCharacterName() + " lost: -" + result + " life point(s)." + empty.repeat(delta-lengthOfNumber) + "|";
		} else if (result < 0) {
			zahl2 = player.getCharacterName().length();
			delta = 23 - zahl2;
			player.setLifePoints(player.getLifePoints()+result);
			messageString = "|     --->  " + player.getCharacterName() + " lost: " + result + " life point(s)." + empty.repeat(delta-lengthOfNumber) + "|";
		} else {
			messageString = "|     --->  Tie                                          |";
		}
		
		
	}

	
	

	public int mathChallenge(CompleteBoard board2, Character player) {
		
		int mathResult = 0;
		char mathChar;
		int space = 30;
		int number1 = (int) ((Math.random() * 10) + 1);
		int number2 = (int) ((Math.random() * 10) + 1);
		int caseForOperation = (int) ((Math.random() * 4) + 1);
		switch (caseForOperation) {
		case 3:
			mathResult = number1 + number2;
			mathChar = '+';
			messageString = "|     --->  What is " + number1 + " " +mathChar + " " +number2 +" ?" + empty.repeat(space) + "|";
		break;
		case 4:
			if (number2 > number1) {
				mathResult = number2;
				number2 = number1;
				number1 = mathResult;
			} 
			mathResult = number1 - number2;
			mathChar = '-';
			messageString = "|     --->  What is " + number1 + " " +mathChar + " " +number2 +" ?" + empty.repeat(space) + "|";
		break;
		case 1:
			mathResult = number1 * number2;
			mathChar = '*';
			messageString = "|     --->  What is " + number1 + " " +mathChar + " " +number2 +" ?" + empty.repeat(space) + "|";
			break;
		case 2:
			mathResult = number1 * number2;
			number1 = mathResult;
			mathResult = number1 / number2;
			mathChar = '/';
			messageString = "|     --->  What is " + number1 + " " +mathChar + " " +number2 +" ?" + empty.repeat(space-1) + "|";
			break;
		default:
			break;
		}
		
		return mathResult;
	}
		
	
	
	

}



/*
***************************************************************************************************                      
***************************************************************************************************
**   Player                 |  Level 01  |                                                       **
**=======================================|                                ==============#======  **
**   Life: +++++|+++++|+++++|+++++ (20)  |                                |               |XXX|  **
**   Experience: 10.000                  |                                | & |===============|  **
**   Gold:        2.000                  |                                |   |   | S         #  **
**   Strength:       16                  |                                |   |   |   |   |===|  **
**   Defense:        12                  |                                #   |   |   |   |   |  **
**=======================================|                                |   | $ |=======|   |  **
**                                       |                                |           |       |  **
**   Tools:         Dungeon key:   Yes   |                                |=======|           |  **
**---------------------------------------|                                |XXXXXXX| * |       |  **
**   Weapon:        Langschwert (10)     |                                ==========#==========  **
**   Weapon (2):    Bogen (3)            |                                                       **
**   Heiltrank:     Buntkraut (3)        |                                                       **
**   Item:          Rusty key            |                                                       **
**   Item 2:        Water bottle         |                                                       **
**   Item 3:        Ring (3)             |                                                       **
**=======================================|                                                       **
**                                       |                                                       **
**   Move:                               |                                                       **
**---------------------------------------|                                                       **
**     e      |                          |                                                       **
**   s + d    |                          |                                                       **
**     x      |                          |                                                       **
**=======================================|                                                       **                         *
***************************************************************************************************                                                                                       *
**   ==> Bitte wählen!                                                                           **
***************************************************************************************************





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


