package WorldObjects;

import java.util.ArrayList;

import Humans.AbstractEntity;

public class EntityManager {
	private ArrayList<AbstractEntity> entityList = new ArrayList<AbstractEntity>();
	
	/**
	 * @param entity - entity to be added to the entityList
	 * @return true if it is added
	 */
	public boolean addEntity(AbstractEntity entity) {
		
		entityList.add(entity);
		return true;
	}
	
	public ArrayList<AbstractEntity> getEntityList() {
		return entityList;
	}

}
