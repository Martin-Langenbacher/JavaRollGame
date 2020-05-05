package de.ml.game;

import java.awt.Point;
import java.util.ArrayList;

public final class CompleteBoard {
	
	// 3 ways to initiate an array:
	
	// a) this.board = new String[]{"asdf", "asdf"};
	// b) String[] namen = new String[5];
	// c) String nachkommen = {"asdf", "asdf", "asdf"}
	
	private String[] board;
	
	
	
	
	
	
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






	public void printBoard(DungeonBoard dungeonLevel1, Character player, ArrayList<Item> monsterAndItems) {
		
		String[] boardWithContent = new String[board.length];
		
		//System.out.println(board[0].length() + "<==== Länge des Boards (x-Achse) !!!!!!!!!!!!!!!!!!!!!!!!");
		//System.out.println(board.length + "<==== Länge des Boards (y-Achse) !!!!!!!!!!!!!!!!!!!!!!!!");
		System.out.println();
		
		
		
		for (int i = 0; i < board.length; i++) {
			switch (i) {
			case 1:
				boardWithContent[i] = " |   " +player.getCharacterName() +"            |    Level     " + player.getCharacterLevel() + "  |     " +dungeonLevel1.getNameOfBoard() +" (Level " + dungeonLevel1.getLevelOfBoard() + ")                              |";
				break;
			case 3:
				boardWithContent[i] = " |   Life:  +++++|+++++|+++++|+++++ (20) |                                                         |";
				break;
			case 5:
				boardWithContent[i] = " |   Experience:    10.000               |                    ==============#======                |";
				break;
			case 6:
				boardWithContent[i] = " |   Gold:           2.000               |                    |               |XXX|                |";
				break;
			case 7:
				boardWithContent[i] = " |   Strength:          16               |                    | & |===============|                |";
				break;
			case 8:
				boardWithContent[i] = " |   Defense:           12               |                    |   |   | S         #                |";
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
				boardWithContent[i] = " |   Weapon:        Langschwert    (10)  |                    |=======|           |                |";
				break;
			case 14:
				boardWithContent[i] = " |   Weapon (2):    Bogen           (3)  |                    |XXXXXXX| * |       |                |";
				break;
			case 15:
				boardWithContent[i] = " |   Heiltrank:     Buntkraut       (3)  |                    ==========#==========                |";
				break;
			case 16:
				boardWithContent[i] = " |   Item:          Rusty key            |                                                         |";
				break;
			case 17:
				boardWithContent[i] = " |   Item 2:        Water bottle         |                                                         |";
				break;
			case 18:
				boardWithContent[i] = " |   Item 3:        Water bottle         |                                                         |";
				break;
			case 20:
				boardWithContent[i] = " |   Move:   |      Fight:               |                     Player | Schmunzel-Monster (500)    |";
				break;
			case 22:
				boardWithContent[i] = " |     e     |      k: run               |  Angriff:               11 |   4                        |";
				break;
			case 23:
				boardWithContent[i] = " |   s + d   |      h: use healing       |  Verteidigung:           8 |   2                        |";
				break;
			case 24:
				boardWithContent[i] = " |     x     |                           |  Lebenspunkte (neu):     9 |   0                        |";
				break;
			case 26:
				boardWithContent[i] = " |   ==> Bitte wählen!                   |      --->  Player won and gets xy-experience            |";
				break;
			
				//System.out.println(boardWithContent[i]);
				//System.out.println(board[i]);
			default: //0, 2, 4,1 9, 21,25, 27  
				boardWithContent[i] = board[i];
				break;
			}
			System.out.println(boardWithContent[i]);
			
			
			/*
			if (i == 1) {
				boardWithContent[i] = " |   " +player.getCharacterName() +"            |    Level     " + player.getCharacterLevel() + "  |     " +dungeonLevel1.getNameOfBoard() +" (Level " + dungeonLevel1.getLevelOfBoard() + ")                              |";
				System.out.println(boardWithContent[i]);
				System.out.println(board[i]);
			} else {
				boardWithContent[i] = board[i];
				System.out.println(boardWithContent[i]);
				//System.out.println(board[i]);
				
			}
			*/
			
			
			
			
		
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


