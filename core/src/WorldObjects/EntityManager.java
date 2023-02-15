package WorldObjects;

import java.util.ArrayList;

import Humans.AbstractEntity;

public class EntityManager {
	private ArrayList<AbstractEntity> entityList = new ArrayList<AbstractEntity>();
	
	public boolean addEntity(AbstractEntity entity) {
		
		entityList.add(entity);
		return true;
	}
	
	public ArrayList<AbstractEntity> getEntityList() {
		return entityList;
	}

}
