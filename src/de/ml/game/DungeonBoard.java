package de.ml.game;

public abstract class DungeonBoard {
	
	private static int numberOfBoards;
	private int levelOfBoard;
	private String nameOfBoard;
	private String[] boardStrings;
	
	
	/* Size:
	
	 1:  3 x  5
	 2:  5 x  9
	 3:  7 x 13
	 4:  9 x 17 
	 5: 11 x 21
	 6: 13 x 25
	 7: 15 x 29
	 
	 1er-Feld: 3x5
	 
	 ==#== 01
	 |.*.| 02
	 ==#== 03
	 12345
	
	*/
	
	// constructor
	public DungeonBoard(String[] boardStrings, String nameOfBoard, int levelOfBoard) {
		this.boardStrings = boardStrings.clone();
		this.nameOfBoard = nameOfBoard;
		this.levelOfBoard = levelOfBoard;
		numberOfBoards++;
		// (ml alt): setNumberOfBoards(getNumberOfBoards() + 1);
	}


	

	// getter & setter
	public static int getNumberOfBoards() {
		return numberOfBoards;
	}


	/*
	public static void setNumberOfBoards(int numberOfBoards) {
		DungeonBoard.numberOfBoards = numberOfBoards;
	}
	*/


	public int getLevelOfBoard() {
		return levelOfBoard;
	}

	/*
	public void setLevelOfBoard(int levelOfBoard) {
		this.levelOfBoard = levelOfBoard;
	}
	*/


	public String getNameOfBoard() {
		return nameOfBoard;
	}


	public void setNameOfBoard(String nameOfBoard) {
		this.nameOfBoard = nameOfBoard;
	}

	
	public String getBoardString(int i) {
		return boardStrings[i];
		
	}

	
	public String[] getBoardStrings() {
		return boardStrings;
	}
	


	public void setBoardString(int i, String zeile) {
		this.boardStrings[i] = zeile;
		
	}
	
	/*
	public void setBoardStrings(String[] boardStrings) {
		this.boardStrings = boardStrings;
	}
	*/
	
	
	public void setBoardField(int x, int y, char value) {
		
		StringBuilder myString = new StringBuilder(this.boardStrings[y]);
		myString.setCharAt(x, value);
		this.boardStrings[y] = myString.toString(); 
	}
	//StringBuilder sbf = new StringBuilder("We are geeks  "); 
	
	
	
	/*
	
	
	// 3: Strings mit Player hinzufügen
		for (int i = 0; i < dungeonSize; i++) {
			if (i == stepToThisPoint.y) {
				index = (2 * stepToThisPoint.x);
				ch = '*';
				
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



==============================#==========
|...............................|.......|
|...|===========================|...|===|
|...|...|......................S........#
|...|...|...........................|===|
|...|...|...............................|
#...|...|...............................|
|...|.$.|===============................|
|.......................................|
|===================.&.|................|
|XXXXXXXXXXXXXXXXXX|...|................|
=====================#===================



 1 2 3 4 5 X
=======#====
|.......|X|
|.|=======|
|.|.|S....#
|.|.|.|.|=|
|.|.|.|.|.|
#.|.|.....|
|.|$|==|..|
|......|..|
|===|.&...|
|XXX|.|...|
=====#=====






==============================#==========
|...............................|.......|
|...============================|...|===|
|..............................S........#
|...................................|===|
|.......................................|
#.......................................|
|......$................................|
|.......................................|
|.......................................|
|..........&............................|
=====================#===================




|=========|
|. . . . X|
|.***  ***|
|.*.*. . .|
|.*.*. ***|
|. . . . .|
|----.....|
|XXXX.....|
|=========|




*/








