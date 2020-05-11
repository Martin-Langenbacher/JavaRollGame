package de.ml.game;

import java.awt.Point;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;


public class PlayRollGame {
	
	static boolean isDoor = false;
	static Point oldPoint;
	
	
	public static void main(String[] args) {
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String eingabe;
		Point startPositionPlayer = new Point(15,11);
		int dungeonNumber = 0;
		//char charToStep;
		
		
		// erstelle StartDungeon: 
		//DungeonBoard dungeonLevel1 = new StartDungeon();
		DungeonBoard startDungeon = new StartDungeon(startPositionPlayer);
		//StartDungeon dungeonLevel1 = new StartDungeon(new String[numberOfLinesForLevel1Dungeon], "StartDungeon", 1);
		
		ArrayList<DungeonBoard> dungeons = new ArrayList<>();
		dungeons.add(startDungeon);
		//dungeons.add(dungeonLevel1);
		
		
		
		// erstelle Player & Monster: Id, name, 'A', Level, Life, Strength, Defense, visible, experience, Position
		Character player = new Character(0, "Player", '*', 1, 10, 2, 2, true, 100, startPositionPlayer);
		Character monster1 = new Character(1, "Eddi-Schreck2", 'A', 1, 5, 2, 1, false, 200, new Point(13,5));
		
		
		/*
		System.out.println();
		System.out.println(player);
		System.out.println(monster1);
		System.out.println(monster1.getCharacterPosition().x);
		*/
		
		
				
		// erstelle Item ===>> (int itemId, String itemName, boolean isWeapon, int itemStrength)
		Item knife = new Item(0, "Knife", true, 2, new Point(10,11));
		Item smallsword = new Item(1, "Small Sword", true, 5, new Point(11,3));
		Item potion = new Item(2, "Healing Potion", false, 16, new Point(11,4));
		Item gold = new Item(3, "Gold", false, 500, new Point(11,5));
		Item item = new Item(4, "Item Potion", false, 16, new Point(11,6));
		Item item2 = new Item(5, "Item Potion2", false, 6, new Point(11,7));

		
		ArrayList<Item> monsterAndItems = new ArrayList<>();
		monsterAndItems.add(smallsword);
		//monsterAndItems.add(potion);
		//monsterAndItems.add(gold);
		//monsterAndItems.add(new Item (4, "Gold", false, 200, new Point(11,6)));
		
		// Items of Character:
		ArrayList<Item> itemsOfCharacter = new ArrayList<>();
		itemsOfCharacter.add(knife);
		itemsOfCharacter.add(smallsword);
		itemsOfCharacter.add(potion);
		//itemsOfCharacter.add(gold);
		//itemsOfCharacter.add(item);
		//itemsOfCharacter.add(item2);
		// Check with André !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
		
		
		
		
		// !!!!!!!!!!!!!!!!! Visibility: true/false?
		for (int i = 0; i < monsterAndItems.size(); i++) {
			monsterAndItems.get(i).setVisible(true);
		}
		
		
		
		
		//
		// GameIsPlaying
		//
		
		CompleteBoard board = new CompleteBoard();
		//dungeonLevel1 = new StartDungeon();
		System.out.println();
		//System.out.println();
		//board.printBoard();
		
		
		
		System.out.println();
		System.out.println("========================================>>>>>>>>>>> GameStarts <<<<<<<<<<=================================");
		
		boolean gameIsPlaying = true;
		int round = 0; // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!<<<================================================= Change with when lost !!!...!
		
		
		// Punkte --> (Startpunkt Spieler: Point(15,11);
		/* dungeons.get(0).setBoardField(0,0,'A');
		dungeons.get(0).setBoardField(6,1,'A');
		dungeons.get(0).setBoardField(51,1,'A');
		dungeons.get(0).setBoardField(57,0,'A');
		
		dungeons.get(0).setBoardField(0,14,'A');
		dungeons.get(0).setBoardField(6,13,'A');
		dungeons.get(0).setBoardField(57,0,'A');
		dungeons.get(0).setBoardField(51,13,'A');
		
		dungeons.get(0).setBoardField(21,3,'o');
		dungeons.get(0).setBoardField(39,3,'o');
		dungeons.get(0).setBoardField(39,11,'o');
		dungeons.get(0).setBoardField(21,11,'o');
		
		dungeons.get(0).setBoardField(22,9,'1');
		dungeons.get(0).setBoardField(24,9,'2');
		dungeons.get(0).setBoardField(26,9,'3');
		dungeons.get(0).setBoardField(28,9,'4');
		dungeons.get(0).setBoardField(30,9,'5');
		dungeons.get(0).setBoardField(32,9,'6');
		dungeons.get(0).setBoardField(34,9,'7');
		dungeons.get(0).setBoardField(36,9,'8');
		dungeons.get(0).setBoardField(38,9,'9'); */
		
		
		
		// Player (& Items) in Feld für Start setzen:   ---> (x, y, char value)
		dungeons.get(dungeonNumber).setBoardField((player.getCharacterPosition().x*2), player.getCharacterPosition().y, player.getCharacterChar());
		dungeons.get(dungeonNumber).setBoardField((monster1.getCharacterPosition().x*2), monster1.getCharacterPosition().y, monster1.getCharacterChar());
		
		for (int i = 0; i < monsterAndItems.size(); i++) {
			dungeons.get(dungeonNumber).setBoardField((smallsword.getItemPosition().x*2), smallsword.getItemPosition().y, '?');
			
			System.out.println("i: monsterAndItems: " +i);
		}
		
		//dungeons.get(dungeonNumber).setBoardField(23,4,'O');
		
		
		
		/*
		
		
		public void setBoardField(int x, int y, char value) {
			
			StringBuilder myString = new StringBuilder(this.boardStrings[y]);
			myString.setCharAt(x, value);
			this.boardStrings[y] = myString.toString(); 
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		board.printBoard(dungeons.get(dungeonNumber), player, monsterAndItems, itemsOfCharacter, monster1);
		//MovePlayer.printDungeon(dungeons.get(dungeonNumber), startPositionPlayer, monsterAndItems);
		//MoveOfPlayer.printDungeon(dungeonLevel1, startPositionPlayer, monsterAndItems);
		
		
		//!!!!!!!!!!!!!!!!! Achtung: Check the 1 below
		int dungeonXSize = (1+dungeons.get(dungeonNumber).getBoardStrings()[0].length())/2;
		int dungeonYSize = dungeons.get(dungeonNumber).getBoardStrings().length;
		//System.out.println("Muss noch überprüft werden: Ist die Size die richtige Größe & ist sie im CASE Fall richtig eingebaut???");
		//System.out.println("X: " + dungeonXSize);
		//System.out.println("Y: " + dungeonYSize);
		// -------------------------------------------------------------------------------------------> !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!        OK?
		
		//Point stepToThisPoint = new Point(0,0);
		
				
		do {
			round++;
			
			// 1) Eingabe korrekt?   UND   2) Move possible?
			boolean inputOk = false;
			Point stepToThisPoint = new Point(0,0);
			
			dungeons.get(dungeonNumber).setBoardField((player.getCharacterPosition().x*2), player.getCharacterPosition().y, ' ');
			
			
			while (!inputOk) {
				// System.out.println("Bitte wählen: ");
				// System.out.println("e: hoch | s: links | d: rechts | x: runter");
				
				//java.util.Scanner sc = new java.util.Scanner(System.in);
				
				switch (new Scanner(System.in).next().toLowerCase()) {
				case "e":
					stepToThisPoint.x = player.getCharacterPosition().x;
					stepToThisPoint.y = Math.max(0, player.getCharacterPosition().y - 1 );
					break;
				case "s":
					stepToThisPoint.x = Math.max( 0, player.getCharacterPosition().x - 1);
					stepToThisPoint.y = player.getCharacterPosition().y;
					break;
				case "d":
					stepToThisPoint.x = Math.min(dungeonXSize-1, player.getCharacterPosition().x + 1);
					stepToThisPoint.y = player.getCharacterPosition().y;
					break;
				case "x":
					stepToThisPoint.x = player.getCharacterPosition().x;
					stepToThisPoint.y = Math.min(dungeonYSize-1, player.getCharacterPosition().y + 1);
					break;

					
				default:
					System.out.println("Falsche Eingabe !!! --> Nochmal.");
					continue;
				}				
				//System.out.println("Point: -->" + stepToThisPoint);
				
				// new placement of player - after move is OK!
				if (MovePlayer.movePossible(dungeons.get(dungeonNumber), stepToThisPoint)) {
					
					inputOk = true;
					
					// here you make your step:
					if (!isDoor) {
						oldPoint = player.getCharacterPosition();
						player.setCharacterPosition(stepToThisPoint);
						
						// same field as player, before the player moves on that field (to handle incident in case of door !):
						if (dungeons.get(dungeonNumber).getBoardField(player.getCharacterPosition().x*2, player.getCharacterPosition().y) == '#') {
							isDoor = true;
							
							// hier oder unten:
							//dungeons.get(dungeonNumber).setBoardField((player.getCharacterPosition().x*2), player.getCharacterPosition().y, player.getCharacterChar());

						}
						dungeons.get(dungeonNumber).setBoardField((player.getCharacterPosition().x*2), player.getCharacterPosition().y, player.getCharacterChar());	
						
						
						
						
						
						
						
						
						
					} else {                      // --->  isDoor
						if (oldPoint.equals(stepToThisPoint)) {
							// zurück
							dungeons.get(dungeonNumber).setBoardField(player.getCharacterPosition().x*2, player.getCharacterPosition().y, '#');
							
							oldPoint = player.getCharacterPosition();
							player.setCharacterPosition(stepToThisPoint);
							dungeons.get(dungeonNumber).setBoardField((player.getCharacterPosition().x*2), player.getCharacterPosition().y, player.getCharacterChar());	
							isDoor=!isDoor;
						} else {
							// in neuen Dungeon
							System.out.println("hier geht es in einen neuen Dungeon <<<<=======================================");
							isDoor=!isDoor;
							
						
							
							
							
							
							
							
							
							
						}

					}
										
				} else {
					continue;
				}
			}
			
			
			
			// 3) Dungeon mit Bewegung und Dinge zeigen
			board.printBoard(dungeons.get(dungeonNumber), player, monsterAndItems, itemsOfCharacter, monster1);
			//MovePlayer.printDungeon(dungeons.get(dungeonNumber), stepToThisPoint, monsterAndItems);
			//MoveOfPlayer.printDungeon(dungeonLevel1, stepToThisPoint, monsterAndItems);
			
			
			
			// 5) Erreignis: Ja / Nein?
			
			
			
			
			
			/*
			System.out.println(player.getCharacterPosition());
			System.out.println(monsterAndItems.get(0).getItemPosition());
			System.out.println(monsterAndItems.get(1).getItemPosition());
			System.out.println(monsterAndItems.get(2).getItemPosition());
			System.out.println(monsterAndItems.get(3).getItemPosition());
			*/
			
			
			//System.out.println(monsterAndItems.get(4).getItemPosition());
			//System.out.println(monsterAndItems.get(5).getItemPosition());
			
			
			for (int i = 0; i < monsterAndItems.size(); i++) {
				if (player.getCharacterPosition().equals(monsterAndItems.get(i).getItemPosition())) {
					System.out.println("-------> Sie stehen auf einem Item und können was tun; danach wird item unsichtbar");
					System.out.println("Dies ist Item: -->" +monsterAndItems.get(i).getItemName());
					monsterAndItems.get(i).setVisible(false);
				}
			}
			
			
			
			
			
			// 6a) Mache Erreignis (z.B. Kampf)
			if (player.getCharacterPosition().equals(monster1.getCharacterPosition())) {
				System.out.println("Start Kampf.... -----> Hier ist ein Monster");
				
				board.setFighting(true);
				board.fightingWithMonster(board, player, monster1);
				board.printBoard(dungeons.get(dungeonNumber), player, monsterAndItems, itemsOfCharacter, monster1);
				board.setFighting(false);
				
				System.out.println("Ende Kampf   UND weiter...!");
				
				
			}
			
			
			
			
			
			// 6b) Tür
			
			if (isDoor) {
				System.out.println("Hier ist eine Tür !!!!!!!!!!!");
			}
			
			
			
			
			
			// 7) Player hat verlohren? Sonst weiter ...
			
			
			
			
			
			if (round > 100) {
				gameIsPlaying = false;
			}
		} while (gameIsPlaying);
		
		
		System.out.println("========================================>>>>>>>>>>>  End of Game  <<<<<<<<<<==============================");
		
		
		
	
	
		
		
		
		
		
		
		
		
		
		
	}

}



