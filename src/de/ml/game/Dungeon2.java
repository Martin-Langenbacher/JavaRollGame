package de.ml.game;

import java.awt.Point;

public class Dungeon2 extends DungeonBoard {
	
	public Dungeon2(Point startPosition) {
		
		super(new String[] {
				"|    =====================================#==========    |",
				"|    |XX|   |                                       |    |",
				"|    |  |       |===|   |=======================|   |    |",
				"|    |  |   |===========|                           |    |",
				"|    |  |           |===========|                   |    |",
				"|    |  |=======|   |   |   |   |                   |    |",
				"|    |  |           |           |=======|   |=======|    |",
				"|    |  |   |===============|                       |    |",
				"|    |  |       |           |===|   |   |   |   |   |    |",
				"|    |======|   |   |===|   |       |   |   |   |   |    |",
				"|    |XX|       |       |   |   |   |   |   |   |   |    |",
				"|    |XX|   |   |   |   |   |   |   |   |   |   |   |    |",
				"|    |XX|   |       |   |=======================|   |    |",
				"|    |XX|   |       |                               |    |",
				"|    =====#==========================================    |"
				
				// ACHTUNG: Ggf. vorne die zwei XX erweitern !!! --> Oder wegmachen...!
				
				// André: Wie komme ich von einem in den anderen Dungeon? Tür-Objekt? Von nach??? 
				
	}, "Dungeon 2", 2);

}




}

