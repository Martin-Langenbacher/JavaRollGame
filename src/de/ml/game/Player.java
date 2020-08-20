package de.ml.game;

import java.util.ArrayList;

public class Player {
	
	/* class variables */
	private static final int SIZE_OF_BACKPACK = 6;
	
	
	/* instance variables */
	// private int sizeOfBackpack = 6;  --> ohne 'static' ist es eine instance variable !!!
	
	
	//private int characterId;
	private ArrayList<Item> backpack;

	
	
	/* constructors */
	
	public Player(ArrayList<Item> backpack) {
		super();
		this.backpack = backpack;
	} 
	
	
	public Player() {
		super();
		this.backpack = new ArrayList<Item>();
	} 
	
	
	
	/* instance methods */
	
	public void addItem(Item item) throws FullBackpackExeption{
		if (backpack.size() < Player.SIZE_OF_BACKPACK) {
			backpack.add(item);
		} else {
			throw new FullBackpackExeption();
		}
	}
	
	
	public void removeItem() {
		
		
		// Muss noch geschrieben werden !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
		
	}
	
	
	
	
	/* class methods */
	public static void main(String[] args) {
		Player testPlayer = new Player();
		
		try {
			testPlayer.addItem(null);
			testPlayer.addItem(null);
			testPlayer.addItem(null);
			testPlayer.addItem(null);
			testPlayer.addItem(null);
			testPlayer.addItem(null);
			testPlayer.addItem(null);
			
		} catch (FullBackpackExeption e) {
			
			// Hier kann ich bestimmen, wo die Ausgabe hinkommt !!!
			System.out.println("Catch: Hier wurde der Fehler aufgefangen... ! ");
			
			e.printStackTrace();
		}
		
		
		System.out.println("Packpack nicht übervoll !!!");
		
	}
	
	
	
}
