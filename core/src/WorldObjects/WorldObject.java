package WorldObjects;

import com.badlogic.gdx.graphics.Texture;

public abstract class WorldObject {
	public int posY;
	public int posX;
	public abstract Texture getTexture();
	
	/**
	 * @return the name of the worldObject, (used when searching through elements)
	 */
	public abstract String getName();
	
	WorldObject(int posX, int posY){
		this.posX = posX;
		this.posY = posY;
	}
}
