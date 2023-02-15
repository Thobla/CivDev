package WorldObjects;

import java.util.ArrayList;

public class ObjectManager {
	private ArrayList<WorldObject> objectList = new ArrayList<WorldObject>();
	
	public boolean addObject(WorldObject wObject) {
		
		objectList.add(wObject);
		return true;
	}
	
	public ArrayList<WorldObject> getObjectList() {
		return objectList;
	}
}
