package WorldObjects;

import java.util.HashMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import StaticData.StaticVariables;
public class House extends WorldObject{
	
	HashMap<String, Integer> storage = new HashMap<String, Integer>();
	int initCapacity = 100;
	
	private void initStorage() {
		storage.put("food", 0);
		storage.put("gold", 0);
		storage.put("wood", 0);
		storage.put("stone", 0);
		storage.put("capacity", initCapacity);
	}
	
	public House(int yTile, int xTile) {
		initStorage();
		this.posY = yTile;
		this.posX = xTile;
		this.texture = new Texture("house.jpg");
	}
}
