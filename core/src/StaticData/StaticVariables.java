package StaticData;

import java.util.ArrayList;

public class StaticVariables {
	//Map
	public static int mapHeight = 12;
	public static int mapWidth = 16;
	public static int tileSize = 40;
	
	
	//Humans
	public static int backpackSize = 100; //max items in backpack
	public static int baseMoveSpeed = 1;
	
	public static ArrayList<String> harvestableResources = harvestableResources();
	public static ArrayList<String> worldObjectList = worldObjectList();
	
	public static ArrayList<String> harvestableResources(){
		ArrayList<String> resources = new ArrayList<String>();
		resources.add("Food");
		resources.add("Wood");
		resources.add("Gold");
		return resources;
	}
	
	public static ArrayList<String> worldObjectList(){
		ArrayList<String> objects = new ArrayList<String>();
		objects.add("BerryBush");
		objects.add("Forest");
		objects.add("GoldMine");
		objects.add("House");
		return objects;
	}
	
	//WorldObjects
	public static int goldMineCapacity = 100;
	public static int berryBushCapacity = 100;
	public static int forestCapacity = 100;
	
	//RenewableResource
	public static double berryGrowRate = 0.01;
	public static double forestGrowRate = 0.01;
	
	//Clock
	public static int clockSpeed = 12;
	
	
}
