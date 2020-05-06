package de.ml.game;

import java.text.DecimalFormat;
import java.util.ArrayList;

public final class CompleteBoard {
	
	// 3 ways to initiate an array:
	
	// a) this.board = new String[]{"asdf", "asdf"};
	// b) String[] namen = new String[5];
	// c) String nachkommen = {"asdf", "asdf", "asdf"}
	
	private String[] board;
	int zahl;
	String stringItems;
	int lengthOfNumber;
	int lengthOfString;
	String empty = " ";
	String zahlString;
	int itemsCounter;
	int delta;
	boolean fighting = false;
	
	
	
	
	
	
	public CompleteBoard() {
		super();
		this.board = new String[]{
				" |=================================================================================================|", 
				" |   Player            |    Level    01  |     Dungeon Level 1                                     |", 
				" |=======================================|                                                         |",
				" |   Life:  +++++|+++++|+++++|+++++ (20) |                                                         |",
				" |=======================================|                                                         |",
				" |   Experience:    10.000               |                    ==============#======                |",
				" |   Gold:           2.000               |                    |               |XXX|                |",
				" |   Strength:          16               |                    | & |===============|                |", 
				" |   Defense:           12               |                    |   |   | S         #                |",
				" |=======================================|                    |   |   |   |   |===|                |",
				" |                                       |                    #   |   |   |   |   |                |",
				" |   Tools:         Dungeon key:   Yes   |                    |   | $ |=======|   |                |", 
				" |---------------------------------------|                    |           |       |                |",
				" |   Weapon:        Langschwert    (10)  |                    |=======|           |                |",
				" |   Weapon (2):    Bogen           (3)  |                    |XXXXXXX| * |       |                |", 
				" |   Heiltrank:     Buntkraut       (3)  |                    ==========#==========                |",
				" |   Item:          Rusty key            |                                                         |",
				" |   Item 2:        Water bottle         |                                                         |",
				" |   Item 3:        Ring            (3)  |                                                         |", 
				" |=======================================|=========================================================|", 
				" |   Move:   |      Fight:               |                     Player | Schmunzel-Monster (500)    |", 
				" |-----------|---------------------------|---------------------------------------------------------|", 
				" |     e     |      k: run               |  Angriff:               11 |   4                        |", 
				" |   s + d   |      h: use healing       |  Verteidigung:           8 |   2                        |", 
				" |     x     |                           |  Lebenspunkte (neu):     9 |   0                        |",
				" |=================================================================================================|", 
				" |   ==> Bitte wählen!                   |      --->  Player won and gets xy-experience            |", 
				" ===================================================================================================",
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



	String str = "abc";
	String repeated = str.repeat(3);
	repeated.equals("abcabcabc");
				
	*/
	
	
	
	
	
	
	
	
	
	
	
	




	public void printBoard(DungeonBoard dungeonLevel1, Character player, ArrayList<Item> monsterAndItems, ArrayList<Item> itemsOfCharacter) {
		
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
				boardWithContent[i] = " |   " +player.getCharacterName() +"            |    Level     " + player.getCharacterLevel() + "  |     " +dungeonLevel1.getNameOfBoard() +" (Level " + dungeonLevel1.getLevelOfBoard() + ")                              |";
				break;
			case 3:
				boardWithContent[i] = " |   Life:  +++++|+++++|+++++|+++++ (20) |                                                         |";
				break;
			case 5:
				zahl = player.getExperience();
				zahlString = "" + zahl;
				lengthOfNumber = zahlString.length();
				if (lengthOfNumber > 3) {
					lengthOfNumber = lengthOfNumber + 1;
				}
				boardWithContent[i] = " |   Experience:" + empty.repeat(10-lengthOfNumber) + twoDigits.format(zahl) + "               |                    ==============#======                |";
				break;
			case 6:
				zahl = player.getGold();
				zahlString = "" + zahl;
				lengthOfNumber = zahlString.length();
				if (lengthOfNumber > 3) {
					lengthOfNumber = lengthOfNumber + 1;
				}
				boardWithContent[i] = " |   Gold:" + empty.repeat(16-lengthOfNumber) + twoDigits.format(zahl) + "               |                    |               |XXX|                |";
				break;
			case 7:
				zahl = player.getStrength();
				zahlString = "" + zahl;
				lengthOfNumber = zahlString.length();
				if (lengthOfNumber > 3) {
					lengthOfNumber = lengthOfNumber + 1;
				}
				boardWithContent[i] = " |   Strength:" + empty.repeat(12-lengthOfNumber) + twoDigits.format(zahl) + "               |                    | & |===============|                |";
				break;
			case 8:
				zahl = player.getDefense();
				zahlString = "" + zahl;
				lengthOfNumber = zahlString.length();
				if (lengthOfNumber > 3) {
					lengthOfNumber = lengthOfNumber + 1;
				}
				boardWithContent[i] = " |   Defense:" + empty.repeat(13-lengthOfNumber) + twoDigits.format(zahl) + "               |                    | & |===============|                |";
				break;
			case 9:
				boardWithContent[i] = " |=======================================|                    |   |   |   |   |===|                |";
				break;
			case 10:
				boardWithContent[i] = " |                                       |                    #   |   |   |   |   |                |";
				break;
			case 11:
				boardWithContent[i] = " |   Tools:         Dungeon key:   Yes   |                    |   | $ |=======|   |                |";
				break;
			case 12:
				boardWithContent[i] = " |---------------------------------------|                    |           |       |                |";
				break;
			case 13:
				zahl = itemsOfCharacter.get(0).getItemStrength();
				zahlString = "" + zahl;
				lengthOfNumber = zahlString.length();
				stringItems = itemsOfCharacter.get(0).getItemName();
				lengthOfString = stringItems.length();
				delta = 17 - lengthOfString;
				boardWithContent[i] = " |   Weapon:" + empty.repeat(8) + stringItems + empty.repeat(delta-lengthOfNumber) + "(" +twoDigits.format(zahl) +")  |                    |=======|           |                |";
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
					boardWithContent[i] = " |   Weapon 2:" + empty.repeat(6) + stringItems + empty.repeat(delta-lengthOfNumber) + "(" +twoDigits.format(zahl) +")  |                    |XXXXXXX| * |       |                |";
				} else {
					boardWithContent[i] = " |                                       |                    |XXXXXXX| * |       |                |";
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
					boardWithContent[i] = " |   Item:" + empty.repeat(10) + stringItems + empty.repeat(delta-lengthOfNumber) + "(" +twoDigits.format(zahl) +")  |                    ==========#==========                |";
				} else {
					boardWithContent[i] = " |                                       |                    ==========#==========                |";
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
					boardWithContent[i] = " |   Item 2:" + empty.repeat(8) + stringItems + empty.repeat(delta-lengthOfNumber) + "(" +twoDigits.format(zahl) +")  |                                                         |";
				} else {
					boardWithContent[i] = " |                                       |                                                         |";
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
					boardWithContent[i] = " |   Item 3:" + empty.repeat(8) + stringItems + empty.repeat(delta-lengthOfNumber) + "(" +twoDigits.format(zahl) +")  |                                                         |";
				} else {
					boardWithContent[i] = " |                                       |                                                         |";
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
					boardWithContent[i] = " |                                       |                                                         |";
				}
				itemsCounter++;
				break;
			case 20:
				if (fighting) {
					boardWithContent[i] = " |   Move:   |      Fight:               |                     Player | Schmunzel-Monster (500)    |";
				} else {
					boardWithContent[i] = " |   Move:   |                           |                                                         |";
				}
				break;
			case 22:
				if (fighting) {
					boardWithContent[i] = " |     e     |      k: run               |  Angriff:               11 |   4                        |";
				} else {
					boardWithContent[i] = " |     e     |                           |                                                         |";
				}
				break;
			case 23:
				if (fighting) {
					boardWithContent[i] = " |   s + d   |      h: use healing       |  Verteidigung:           8 |   2                        |";
				} else {
					boardWithContent[i] = " |   s + d   |                           |                                                         |";
				}
				break;
			case 24:
				if (fighting) {
					boardWithContent[i] = " |     x     |                           |  Lebenspunkte (neu):     9 |   0                        |";
				} else {
					boardWithContent[i] = " |     x     |                           |                                                         |";
				}
				break;
			case 26:
				if (fighting) {
					boardWithContent[i] = " |   ==> Bitte wählen!                   |      --->  Player won and gets xy-experience            |";
				} else {
					boardWithContent[i] = " |   ==> Bitte wählen!                   |                                                         |";
				}
				break;
			default: // 0, 2, 4, 19, 21, 25, 27  
				boardWithContent[i] = board[i];
				break;
			}
			System.out.println(boardWithContent[i]);
		}
		
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


