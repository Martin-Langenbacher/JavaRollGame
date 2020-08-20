package de.ml.game;

import java.awt.Point;

public class StartDungeon extends DungeonBoard{

	public StartDungeon(Point startPositionPlayer) {
		
		super(new String[] {
				"|    ================================================    |",
				"|    |                                              |    |",
				"|    |              ==============#======           |    |",
				"|    |              |               |XXX|           |    |",
				"|    |              |   |===============|           |    |",
				"|    |              |   |   |           #           |    |",
				"|    |              |   |   |   |   |===|           |    |",
				"|    |              #   |   |   |       |           |    |",
				"|    |              |   |   |=======|   |           |    |",
				"|    |              |           |       |           |    |",
				"|    |              |=======|           |           |    |",
				"|    |              |XXXXXXX|   |       |           |    |",
				"|    |              ==========#==========           |    |",
				"|    |                                              |    |",
				"|    ================================================    |"
		}, "StartDungeon", 1);
	}
	
	
	
}






















// Zum lernen von André:

// Die Instanzmethoden sind allein dafür da, entweder Informationen über den Objektzustand in irgendeiner Form nach
// aussen zu geben oder den Zustand des Objekts in irgendeiner Form zu manipulieren. Die klassischen Getter- und
// Setter-Methoden sind ja nur der einfachste Weg, das zu tun. Du kannst ja auch sowas wie

// 			public char getField(int x, int y) {...}  oder
//			public void setField(int x, int y, char value) {...} machen.
	
	


// ----------------------> André fragen: Wie geht es, wenn ich hier erst den String[]-Array definiere (und vorher nicht übergebe?
	
	


	
	

/*

          10        20        30        40        50        60
 123456789012345678901234567890123456789012345678901234567890
"|    =================================================    |",  1
"|    |                                               |    |",  2
"|    |               ==============#======           |    |",  3
"|    |               |               |XXX|           |    |",  4
"|    |               | & |===============|           |    |",  5
"|    |               |   |   | S         #           |    |",  6
"|    |               |   |   |   |   |===|           |    |",  7
"|    |               #   |   |   |   |   |           |    |",  8
"|    |               |   | $ |=======|   |           |    |",  9
"|    |               |           |       |           |    |",  10
"|    |               |=======|           |           |    |",  11
"|    |               |XXXXXXX|   |       |           |    |",  12
"|    |               ==========#==========           |    |",  13
"|    |                                               |    |",  14
"|    =================================================    |"   15



*/





