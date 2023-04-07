package WorldObjects;

import java.util.ArrayList;

public class ObjectManager {
	private ArrayList<WorldObject> objectList = new ArrayList<WorldObject>();
	
	
	
	/**
	 * @param wObject - world object to be added to the object list
	 * @return true if object was added
	 */
	public boolean addObject(WorldObject wObject) {
		
		objectList.add(wObject);
		return true;
	}
	
	public ArrayList<WorldObject> getObjectList() {
		return objectList;
	}
}
