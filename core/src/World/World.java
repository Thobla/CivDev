package World;

import com.badlogic.gdx.graphics.g2d.Batch;

import Humans.AbstractEntity;
import Humans.Male;
import Map.TileMapManager;
import WorldObjects.*;
import StaticData.StaticVariables;

public class World {
	
	private ObjectManager objectManager = new ObjectManager();
	private EntityManager entityManager = new EntityManager();
	private Clock clock = new Clock();

	private TileMapManager tileMapManager = new TileMapManager(objectManager, entityManager);
	/**private EntityManager entityManager = new EntityManager();**/
	
	public void start() {
		for (int i = 0; i < StaticVariables.mapHeight; i++) {
			for (int j = 0; j < StaticVariables.mapWidth; j++) {
				House house = new House(j, i);
				tileMapManager.buildObject(j, i, house); //adds a house to the tile map
				Male male = new Male(house);
				tileMapManager.createEntity(male);
			}	
		}
		
		
		
		
	}
	
	public void update(Batch batch) {
		batch.begin();
		for (WorldObject elem : objectManager.getObjectList()){
			float tileSize = StaticVariables.tileSize;
			batch.draw(elem.texture, elem.posX * tileSize, elem.posY * tileSize, tileSize, tileSize);
		}
		for (AbstractEntity entity : entityManager.getEntityList()){
			float tileSize = StaticVariables.tileSize;
			batch.draw(entity.texture, entity.posX * tileSize + tileSize/4, entity.posY + tileSize/4, tileSize/2, tileSize/2);
		}
		batch.end();
		
		if (clock.minute == 0) {
			for (AbstractEntity entity : entityManager.getEntityList()){
				entity.update();
			}
			
			
		}
		System.out.println(" minute: " + clock.minute + " hour: " + clock.hour + " day: " + clock.day + " month: " + clock.month + " year: " + clock.year);
		clock.count();
		
		
	}
}
