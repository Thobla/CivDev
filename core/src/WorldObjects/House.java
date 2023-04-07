package WorldObjects;

import java.util.HashMap;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import StaticData.*;
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
	
	
	public House(int posX, int posY) {
		super(posX, posY);
		initStorage();
	}

	@Override
	public Texture getTexture() {
		
		return Textures.textureHouse;
	}


	@Override
	public String getName() {
		return "House";
	}

	
}
