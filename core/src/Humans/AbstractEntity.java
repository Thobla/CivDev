package Humans;

import com.badlogic.gdx.graphics.Texture;

import StaticData.StaticVariables;
import World.World;
import WorldObjects.House;
import WorldObjects.WorldObject;

public abstract class AbstractEntity {
	public float posX;
	public float posY;

	private World world;
	
	AbstractEntity(House home,int birthYear, String birthMonth, World world){
		this.world = world;
	}
	
	public void update() {
	}
	
	/**
	 * @param posX - the x-position in the world
	 * @param posY - the y-position in the world
	 * @param moveSpeed - the speed to move at (amount of pixels to move)
	 * Moves the entity towards the given x and y position
	 */
	private void moveTowards(float posX, float posY, int moveSpeed) {
		float relativeX = posX - this.posX;
		float relativeY = posY - this.posY;
		float divisor = (float) Math.sqrt(relativeX * relativeX + relativeY * relativeY);
		
		relativeX = relativeX / divisor;
		relativeY = relativeY / divisor;
		moveTo(this.posX + relativeX, this.posY + relativeY);
	}
	
	
	/**
	 * @param posX - the x-position to move the player to
	 * @param posY - the y-position to move the player to
	 * moves the player to the given position in the world
	 */
	private void moveTo(float posX, float posY) {
		this.posX = posX;
		this.posY = posY;
	}
	
	
	/**
	 * @param posX - the tiles posX
	 * @param posY - the tiles posY
	 * @param moveSpeed - the speed at which to move the entity
	 * moves the player towards the given tile, at the given speed
	 */
	private void moveTowardsTile(int posX, int posY, int moveSpeed) {
		moveTowards(world.tileMapManager.tileToPixel(posX), world.tileMapManager.tileToPixel(posY), moveSpeed);
	}
	
	private void moveTowards(WorldObject obj) {
		moveTowardsTile(obj.posX, obj.posY, StaticVariables.baseMoveSpeed);
	}
	
	/**
	 * BRO! Denne er hella inneffective, brukes nå bare for testing
	 * TODO MAke sure we never ever use this method activly
	 * **/
	protected boolean moveTowardsClosest(String objName) {
		WorldObject closest = getClosestObject(objName);
		if (closest == null) {
			return false;
		}
		else {
			moveTowards(closest);
			return true;
		}
	}
	
	
	/**
	 * @param posX - tiles x-position
	 * @param posY - tiles y-position
	 * Moves the entity to the middle of the given tile
	 */
	private void moveToTile(int posX, int posY) {
		int tileSize = StaticVariables.tileSize;
		posX = tileSize/2 + posX * tileSize;
		posY = tileSize/2 + posY * tileSize;
		moveTo(posX, posY);
	}
	
	
	
	/**
	 * @param objectName - name of object to get
	 * @return the closes object with the given name, null if object doesn't exist
	 */
	private WorldObject getClosestObject(String objectName) {
		return world.tileMapManager.closestObject(objectName, this);
		
	}
	
	
	
	
	/**
	 * @return the texture of the given entity
	 */
	public abstract Texture getTexture();
}
