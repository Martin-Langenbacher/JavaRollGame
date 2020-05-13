package de.ml.game;

public abstract class DungeonBoard {
	
	private static int numberOfBoards;
	private int levelOfBoard;
	private String nameOfBoard;
	private String[] boardStrings;
	
	
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



	public int getLevelOfBoard() {
		return levelOfBoard;
	}


	public String getNameOfBoard() {
		return nameOfBoard;
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
	
	
	public char getBoardField(int x, int y) {
		char charValue = getBoardString(y).charAt(x);
		return charValue;
	}
	
	
	
	
	
	public void setBoardField(int x, int y, char value) {
		
		StringBuilder myString = new StringBuilder(this.boardStrings[y]);
		myString.setCharAt(x, value);
		this.boardStrings[y] = myString.toString(); 
	}
	
	
}

	











