package World;


import com.badlogic.gdx.graphics.g2d.Batch;

import Humans.AbstractEntity;
import Map.MapDrawing;
import Map.TileMapManager;
import WorldObjects.*;
import StaticData.StaticVariables;

public class World {
	
	private ObjectManager objectManager = new ObjectManager();
	private EntityManager entityManager = new EntityManager();
	private Clock clock = new Clock();

	public TileMapManager tileMapManager = new TileMapManager(objectManager, entityManager);
	
	private MapDrawing mapDrawing = new MapDrawing(tileMapManager, clock);
	
	public void start() {
		mapDrawing.draw(this);
		StaticVariables.harvestableResources();
		StaticVariables.worldObjectList();
	}
	
	public void update(Batch batch) {
		batch.begin();
		
		//TODO make into objectManagers update function
		for (WorldObject elem : objectManager.getObjectList()){
			float tileSize = StaticVariables.tileSize;
			batch.draw(elem.getTexture(), elem.posX * tileSize, elem.posY * tileSize, tileSize, tileSize);
		}
		for (AbstractEntity entity : entityManager.getEntityList()){
			
			float tileSize = StaticVariables.tileSize;
			batch.draw(entity.getTexture(), entity.posX + tileSize/4, entity.posY + tileSize/4, tileSize/2, tileSize/2);
			
			entity.update();
		}
		batch.end();
		
		if (clock.getHour() == 0) { //TODO This should be altered
			for (AbstractEntity entity : entityManager.getEntityList()){
				entity.update();
			}
			
			
		}
		clock.count(StaticVariables.clockSpeed);
		
		
	}
}
