package WorldObjectsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import WorldObjects.*;
import StaticData.StaticVariables;

public class ResourceSourceTests {
	
	Forest forest = new Forest(0,0);
	BerryBush bush = new BerryBush(0,0);
	GoldMine mine = new GoldMine(0,0);
	
	@BeforeEach
	void setUp() {
		forest = new Forest(0,0);
		bush = new BerryBush(0,0);
		mine = new GoldMine(0,0);
	}
	
	@Test
	@DisplayName("Harvesting of gold should work")
	void testGoldHarvest() {
		int value = mine.getRemaining();
		mine.harvest(2);
		assertEquals(value - 2, mine.getRemaining());
	}
	
	@Test
	@DisplayName("Harvesting of wood should work")
	void testForestHarvest() {
		int value = forest.getRemaining();
		forest.harvest(2);
		assertEquals(value - 2, forest.getRemaining());
	}
	
	@Test
	@DisplayName("Harvesting of berries should work")
	void testBerryHarvest() {
		int value = bush.getRemaining();
		bush.harvest(2);
		
		assertEquals(value - 2, bush.getRemaining());
	}
	
	@Test
	@DisplayName("renewable resources should grow (assuming that harvest works) when updating")
	void testForestGrowth() {
		forest.harvest(StaticVariables.forestCapacity); //makes it empty before growing
		double value = forest.getActualRemaining();
		forest.update();
		value += StaticVariables.forestGrowRate * StaticVariables.forestCapacity;
		assertEquals(value, forest.getActualRemaining());
		forest.update();
		value += StaticVariables.forestGrowRate * StaticVariables.forestCapacity;
		assertEquals(value, forest.getActualRemaining());
		forest.update();
		value += StaticVariables.forestGrowRate * StaticVariables.forestCapacity;
		assertEquals(value, forest.getActualRemaining());
	}
	
	@Test
	@DisplayName("renewable resources should grow (assuming that harvest works) when updating")
	void testBerryGrowth() {
		bush.harvest(StaticVariables.berryBushCapacity); //makes it empty before growing
		double value = bush.getActualRemaining();
		bush.update();
		value += StaticVariables.berryGrowRate * StaticVariables.berryBushCapacity;
		assertEquals(value, bush.getActualRemaining());
		bush.update();
		value += StaticVariables.berryGrowRate * StaticVariables.berryBushCapacity;
		assertEquals(value, bush.getActualRemaining());
		bush.update();
		value += StaticVariables.berryGrowRate * StaticVariables.berryBushCapacity;
		assertEquals(value, bush.getActualRemaining());
		
	
	}
	
	
	
}
