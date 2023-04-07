package Map;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Humans.Male;
import StaticData.StaticVariables;
import World.Clock;
import World.World;
import WorldObjects.*;

/**
 * @author thorg
 *A class to draw the game map.
 *We use an external file map to draw the map
 *First line of input defines the width and height of the map.
 *Different letters means different objects:
 *	O = Nothing at this tile
 *	H = House with human at this tile
 *	F = Forest at this tile
 *	G = GoldMine at this tile
 *	B = BerryBush at this tile
 */
public class MapDrawing {
	private TileMapManager tileMapManager;
	private Clock clock;
	
	public MapDrawing(TileMapManager tileMapManager, Clock clock) {
		this.tileMapManager = tileMapManager;
		this.clock = clock;
	}

	private List<String> createMap() {
		
		ArrayList<String> result = new ArrayList<String>();
		
		try {
			ClassLoader classLoader = getClass().getClassLoader();
			File file = new File(classLoader.getResource("map").getFile());
			Scanner scanner = new Scanner(file);
			
			//String[] widthHeight = scanner.nextLine().split(" ");
			//StaticVariables.mapWidth = Integer.parseInt(widthHeight[0]); //changes the mapWidth to the given width by map
			//StaticVariables.mapHeight = Integer.parseInt(widthHeight[1]); //changes the mapHeight to the given heigth given by map
			
			while (scanner.hasNextLine()) {
				result.add(scanner.nextLine());
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public void draw(World world) {
		ArrayList<String> map = (ArrayList<String>) createMap();
		for (int j = 0; j <= StaticVariables.mapHeight-1; j++) {
			for (int i = 0; i <= StaticVariables.mapWidth-1; i++) { 
				char type = map.get(StaticVariables.mapHeight-1 - j).charAt(i);
				switch (type) {
				
				case 'O':
					break;
				case 'H':
					House house = new House(i, j);
					tileMapManager.buildObject(i, j, house);
					tileMapManager.createEntity(new Male(house, clock.getYear(), clock.getMonth(), world));
					
					break;
				case 'F':
					tileMapManager.buildObject(i, j, new Forest(i, j));
					break;
				case 'B':
					tileMapManager.buildObject(i, j, new BerryBush(i,j));
					break;
				case 'G':
					tileMapManager.buildObject(i, j, new GoldMine(i, j));
					break;
				}
				
				
			}
		}
			
		
		
	}

}