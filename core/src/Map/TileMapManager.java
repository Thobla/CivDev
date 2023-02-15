package Map;

import WorldObjects.EntityManager;
import WorldObjects.ObjectManager;
import WorldObjects.WorldObject;
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
	
	public TileMapManager(ObjectManager objectManager, EntityManager entityManager) {
		this.objectManager = objectManager;
		this.entityManager = entityManager;
	}

	/**
	 * adds a given object to the tileMap
	 * @param posX
	 * @param posY
	 * @param wObject
	 */
	private void addObjectToTileMap(int posX, int posY, WorldObject wObject) {
		tileMap[posY][posX] = wObject;
		
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
		if(tileMap[posX][posY] == null) {
			addObjectToTileMap(posX, posY, wObject);
			objectManager.addObject(wObject);
			return true;
		}
		else {
			return false;
		}
	}
	
	
}
