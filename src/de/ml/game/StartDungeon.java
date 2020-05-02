package de.ml.game;

public class StartDungeon extends DungeonBoard{

	public StartDungeon(String[] boardStrings, String nameOfBoard, int levelOfBoard) {
		super(boardStrings, nameOfBoard, levelOfBoard);
		
		boardStrings[0] =  "==============#======";
		boardStrings[1] =  "|               |XXX|";
		boardStrings[2] =  "|   |===============|";
		boardStrings[3] =  "|   |   |           |";
		boardStrings[4] =  "|   |   |   |   |===|";
		boardStrings[5] =  "|   |   |   |       |";
		boardStrings[6] =  "|   |   |=======|   |";
		boardStrings[7] =  "|           |       |";
		boardStrings[8] =  "|=======|           |";
		boardStrings[9] =  "|XXXXXXX|   |       |";
		boardStrings[10] = "==========#==========";
		
	}
	
	
	
	// ----------------------> André fragen: Wie geht es, wenn ich hier erst den String[]-Array definiere (und vorher nicht übergebe?
	
	
	/*
	public StartDungeon(String nameOfBoard, int levelOfBoard) {
		super(new String[] boardStrings[10], nameOfBoard, levelOfBoard);
		
		
		
		public A380() {
			super("A380", 79.8, 558, 1280.0);
			setAnzahl380(getAnzahl380() + 1);
		}
	}
	
	*/
	
	
	
}	
/*	



  1   2   3   4   5   X
==============#==========
|.*...*.........|XXX|
|...|===============|
|...|...|..S........#
|...|...|...|...|===|
|...|...|...|...|...|
#...|...|...........|
|...|.$.|=======|...|
|...........|.......|
|=======|.&.........|
|XXXXXXX|...|.......|
==========#==========



  1   2   3   4   5   X
==============#========1==
|               |XXX|  2 *
|   |===============|  3 
|   |   | S         #  4 *
|   |   |   |   |===|  5
#   |   |   |   |   |  6 *
|   | $ |=======|   |  7
|           |       |  8 *
|=======| &         |  9
|XXXXXXX|   |       | 10 *
==========#========== 11
123456789012345678901


1er-Feld: 3x5
 1  
==#== 01
|.*.| 02
==#== 03
12345


2er-Feld: 5x9
  1   2   
======#== 01
|.*.x.*.| 02
|.*.====| 03
|.*.|XXX| 04
==#====== 05
123456789


3er-Feld: 7x13
  1   2   3 
==========#==  1
|.*.x.*.x.*.|  2
|.*.|=======|  3
|.*.x.*.x.*.|  4
|=======|.*.|  5
|.*.x.*.x.*.|  6
==#==========  7
1234567890123



  1   2   3   4   5   X
==============#========1==
|.*.x.*.x.*.x.*.|XXX|  2 *
|.*.|===============|  3 
|.*.|.*.|.S.x.*.x.*.#  4 *
|.*.|.*.|===|.*.|===|  5
#.*.|.*.|XXX|.*.x.*.|  6 *
|.*.| $ |=======|.*.|  7
|.*.x.*.x.*.x.*.x.*.|  8 *
|=======|.*.x.*.x.* |  9
|XXXXXXX|.*.|.*.x.*.| 10 *
==========#========== 11==
123456789012345678901



1:  3 x  5
2:  5 x  9
3:  7 x 13
4:  9 x 17 
5: 11 x 21
6: 13 x 25
7: 15 x 29








*/