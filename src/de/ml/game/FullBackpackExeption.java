package de.ml.game;

public class FullBackpackExeption extends Exception {

	public FullBackpackExeption(String string) {
		super(string);
	}
	
	
	public FullBackpackExeption() {
		super("Backpack is full !!!");
		
	}
	
}
