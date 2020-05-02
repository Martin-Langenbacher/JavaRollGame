package de.ml.game;

import java.awt.Point;

public class Item {
	
	private int itemId;
	private String itemName;
	private boolean visible;
	private boolean playerHasItem;
	private boolean isWeapon;      // otherwise it is a tool, like a key, or healing
	private Point itemPosition;
	private int itemStrength;      // e.g. attack value for swords, defend value for shield or healing value for potion (Zaubertrank)
	
	
	// constructor
	public Item(int itemId, String itemName, boolean isWeapon, int itemStrength) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.isWeapon = isWeapon;
		this.itemStrength = itemStrength;
		this.visible = false;
		this.playerHasItem = false;
		this.itemPosition = new Point(-1, -1);
	}


	
	// getter & setter	
	public int getItemId() {
		return itemId;
	}


	public void setItemId(int itemId) {
		this.itemId = itemId;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public boolean isVisible() {
		return visible;
	}


	public void setVisible(boolean visible) {
		this.visible = visible;
	}


	public boolean isPlayerHasItem() {
		return playerHasItem;
	}


	public void setPlayerHasItem(boolean playerGotItem) {
		this.playerHasItem = playerGotItem;
	}


	public boolean isWeapon() {
		return isWeapon;
	}


	public void setWeapon(boolean isWeapon) {
		this.isWeapon = isWeapon;
	}


	public Point getItemPosition() {
		return itemPosition;
	}


	public void setItemPosition(Point itemPosition) {
		this.itemPosition = itemPosition;
	}


	public int getItemStrength() {
		return itemStrength;
	}


	public void setItemStrength(int itemStrength) {
		this.itemStrength = itemStrength;
	}
	
	
	

	
	public String toString() {
		return "ID: " + this.getItemId() + ", Name: " + this.getItemName() +", sichtbar: " + this.isVisible() +", Spieler hat es: " + this.isPlayerHasItem() +", Ist eine Waffe?: " 
				+ this.isWeapon +", Position: " + this.getItemPosition() +", Stärke: " + this.getItemStrength();	
	}

	
}






