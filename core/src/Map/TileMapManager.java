package Map;

import WorldObjects.EntityManager;
import WorldObjects.ObjectManager;
import WorldObjects.WorldObject;

import java.util.HashMap;

import Humans.AbstractEntity;
import StaticData.*;

/**
 * @author Barnaby
 * Creates an illusion of a tile system where worldObjects belongs to specific tiles
 */
/**
 * @author thorg
 *
 */
public class TileMapManager {
	
	/**
	 * Keeps track of the placed objects on the tileMap
	 */
	public WorldObject[][] tileMap = new WorldObject[StaticVariables.mapHeight][StaticVariables.mapWidth];
	public ObjectManager objectManager;
	public EntityManager entityManager;
	public HashMap<String, Boolean> objectExists = new HashMap<String, Boolean>();
	
	public TileMapManager(ObjectManager objectManager, EntityManager entityManager) {
		this.objectManager = objectManager;
		this.entityManager = entityManager;
		instanciateObjectExists();
	}
	
	private void instanciateObjectExists() {
		for (String obj : StaticVariables.worldObjectList) {
			objectExists.put(obj, false);
		}
	}

	/**
	 * adds a given object to the tileMap
	 * @param posX
	 * @param posY
	 * @param wObject
	 */
	private void addObjectToTileMap(int posX, int posY, WorldObject wObject) {
		tileMap[posY][posX] = wObject;
		if(!objectExists.get(wObject.getName())){
			objectExists.put(wObject.getName(), true);//the worldObject now exists
		}
	}
	
	/**
	 * @param entity - entity to be added
	 * 
	 * adds an entity to the @entityManager
	 * 
	 */
	public void createEntity(AbstractEntity entity) {
		entityManager.addEntity(entity);
	}
	
	/**
	 * Tries to build a given wObject in the position (posX, posY), also adds to objectManager
	 * @param posX
	 * @param posY
	 * @param wObject
	 * @return true if build is successful, false if not
	 */
	public boolean buildObject(int posX, int posY, WorldObject wObject) {
		if(tileMap[posY][posX] == null) {
			addObjectToTileMap(posX, posY, wObject);
			objectManager.addObject(wObject);
			return true;
		}
		else {
			return false;
		}
	}
	
	public int pixelToTile(float pixel) {
		return (int) Math.floor((double) (pixel/StaticVariables.tileSize));
	}
	
	public float tileToPixel(int tile) {
		return (tile*StaticVariables.tileSize);
	}
	
	/**
	 * @param obj - object type to find
	 * @param posX - the x-tile position
	 * @param posY - the y-tile position
	 * @return - The closest object of the given type
	 */
	public WorldObject closestObject(String objName, int posX, int posY) {
		float minDist = Float.MAX_VALUE;
		WorldObject newObj = null;
			if (objectExists.get(objName)) {	
			for (WorldObject wObj : objectManager.getObjectList()) {
				if (wObj.getName() == objName) {
					float currDist = StaticMethods.dist(posX, posY, wObj.posX, wObj.posY);
					if (currDist < minDist) {
						minDist = currDist;
						newObj = wObj;
					}
				}
			}
			
			}
			return newObj;
	}
	
	
	public WorldObject closestObject(String objName, AbstractEntity entity) {
		return closestObject(objName, pixelToTile(entity.posX), pixelToTile(entity.posY));
	}
	
	
	
}
