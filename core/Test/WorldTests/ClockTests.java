package WorldTests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.*;
import org.mockito.Mockito;

import World.*;
import StaticData.StaticVariables;

public class ClockTests {
	Clock clock = new Clock();
	
	@BeforeEach
	void init() {
		clock = new Clock();
	}
	
	@Test
	@DisplayName("Should increase hour count by count")
	void countHours() {
		assertEquals(clock.getHour(), 0);
		
		clock.count(12);
		assertEquals(clock.getHour(), 12);
		
		clock.count(11);
		assertEquals(clock.getHour(), 23);
		
		clock.count(1);
		assertEquals(clock.getHour(), 0);
		
	}
	
	@Test
	@DisplayName("Should increase day count by count/24")
	void countDays() {
		assertEquals(1, clock.getDay());
		
		clock.count(24);
		assertEquals(2, clock.getDay());
		
		clock.count(23);
		assertEquals(2, clock.getDay());
		
		clock.count(1);
		assertEquals(3, clock.getDay());
		
		for (int i = 0; i < 28; i++) {
			clock.count((24));
		}
		assertEquals(31, clock.getDay());
		
		clock.count(24);
		assertEquals(1, clock.getDay());
	}
	
	@Test
	@DisplayName("Should change month at month ranges")
	void monthChange() {
		assertEquals("january", clock.getMonth());
		
		for (int i = 0; i < 31; i++) {
			clock.count((24));
		}
		assertEquals("febuary", clock.getMonth());
		
		for (int i = 0; i < 28; i++) {
			clock.count((24));
		}
		assertEquals("march", clock.getMonth());
		
		for (int i = 0; i < 31; i++) {
			clock.count((24));
		}
		assertEquals("april", clock.getMonth());
		
		for (int i = 0; i < 30; i++) {
			clock.count((24));
		}
		assertEquals("may", clock.getMonth());
		
		for (int i = 0; i < 31; i++) {
			clock.count((24));
		}
		assertEquals("june", clock.getMonth());
		
		for (int i = 0; i < 30; i++) {
			clock.count((24));
		}
		assertEquals("july", clock.getMonth());
		
		for (int i = 0; i < 31; i++) {
			clock.count((24));
		}
		assertEquals("august", clock.getMonth());
		
		for (int i = 0; i < 31; i++) {
			clock.count((24));
		}
		assertEquals("september", clock.getMonth());
		
		for (int i = 0; i < 30; i++) {
			clock.count((24));
		}
		assertEquals("october", clock.getMonth());
		
		for (int i = 0; i < 31; i++) {
			clock.count((24));
		}
		assertEquals("november", clock.getMonth());
		
		for (int i = 0; i < 31; i++) {
			clock.count((24));
		}
		assertEquals("december", clock.getMonth());
		
		for (int i = 0; i < 31; i++) {
			clock.count((24));
		}
		assertEquals("january", clock.getMonth());
	}
	
	@Test
	@DisplayName("Should increase year count every 365 days :)")
	void countYear() {
		assertEquals(0, clock.getYear());
		for (int i = 0; i < 365; i++) {
			clock.count((24));
		}
		assertEquals(0, clock.getYear());
		clock.count(24);
		assertEquals(1, clock.getYear());
		
		for (int i = 0; i < 366; i++) {
			clock.count((24));
		}
		assertEquals(2, clock.getYear());
		
		
		
	}
	
	
}
