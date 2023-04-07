package StaticData;

import WorldObjects.WorldObject;

public class StaticMethods {
	public static float dist(int posX1, int posY1, int posX2, int posY2) {
		return (float) Math.sqrt(Math.abs(posX1 - posX2) * Math.abs(posX1 - posX2) + Math.abs(posY1 - posY2) * Math.abs(posY1 - posY2));
		
	}
}
