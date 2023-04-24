package WorldObjectsTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import WorldObjects.*;
import StaticData.StaticVariables;

public class ObjectManagerTests {
	ObjectManager objectManager;
	@BeforeEach
	void init() {
		objectManager = new ObjectManager();
	}
	
	@Test
	@DisplayName("object manager should add given object to managerList when calling addObject")
	void AddObjectTest() {
		Forest forest = Mockito.mock(Forest.class);
		GoldMine mine = Mockito.mock(GoldMine.class);
		BerryBush bush = Mockito.mock(BerryBush.class);
		
		objectManager.addObject(forest);
		assertEquals(objectManager.getObjectList().size(), 1);
		assertTrue(objectManager.getObjectList().contains(forest));
		
		objectManager.addObject(mine);
		assertEquals(objectManager.getObjectList().size(), 2);
		assertTrue(objectManager.getObjectList().contains(mine));
		
		objectManager.addObject(bush);
		assertEquals(objectManager.getObjectList().size(), 3);
		assertTrue(objectManager.getObjectList().contains(bush));
		
	}

}
