package de.ml.game;

import java.awt.Point;

public class Character {
	
	
	private int characterId;
	private String characterName;
	private char characterChar;
	private int characterLevel;    // depending from experience:
	private int lifePoints;
	private int strength;
	private int defense;
	private boolean isVisible;
	private int experience;
	private Point characterPosition;
	
	
	//private int speed;
	//private int luck;
	//private int visibility;
			
	
	// constructor
	public Character(int characterId, String characterName, char characterChar, int characterLevel, int lifePoints, int strength,
			int defense, boolean isVisible, int experience, Point characterPosition) {
		super();
		this.characterId = characterId;
		this.characterName = characterName;
		this.characterChar = characterChar;
		this.characterLevel = characterLevel;
		this.lifePoints = lifePoints;
		this.strength = strength;
		this.defense = defense;
		this.isVisible = isVisible;
		this.experience = experience;
		this.characterPosition = characterPosition;
	}


	
	// getter & setter
	public int getCharacterId() {
		return characterId;
	}


	public void setCharacterId(int characterId) {
		this.characterId = characterId;
	}


	public String getCharacterName() {
		return characterName;
	}


	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}


	public int getCharacterLevel() {
		return characterLevel;
	}


	public void setCharacterLevel(int characterLevel) {
		this.characterLevel = characterLevel;
	}


	public int getLifePoints() {
		return lifePoints;
	}


	public void setLifePoints(int lifePoints) {
		this.lifePoints = lifePoints;
	}


	public int getStrength() {
		return strength;
	}


	public void setStrength(int strength) {
		this.strength = strength;
	}


	public int getDefense() {
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}


	public boolean isVisible() {
		return isVisible;
	}


	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}

	
	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public Point getCharacterPosition() {
		return characterPosition;
	}


	public void setCharacterPosition(Point characterPosition) {
		this.characterPosition = characterPosition;
	}
	
	
	
	public char getCharacterChar() {
		return characterChar;
	}



	public void setCharacterChar(char characterChar) {
		this.characterChar = characterChar;
	}



	public String toString() {
		return "ID: " + this.getCharacterId() 
				+ ", Name: " + this.getCharacterName()
				+ ", Char: '" + this.getCharacterChar() +"'"
				+ ", Level: " + this.getCharacterLevel() 
				+ ", LebensPunkte: " + this.getLifePoints() 
				+ ", Stärke: " + this.getStrength() 
				+ ", Verteidigung: " + this.getDefense() 
				+ ", Sichtbar? --> " + this.isVisible() 
				+ ", Erfahrung: " + this.getExperience() 
				+ ", Punkt: --> " + this.getCharacterPosition(); 
				
	}
	
	
	
	
	
	

}
