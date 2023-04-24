import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class TestTest {
	
	
	@Test
	public void tester() {
		List<String> mockedList = Mockito.mock(List.class);
		Mockito.when(mockedList.size()).thenReturn(10);
		mockedList.add("one");
		
		assertEquals(10, mockedList.size());
	}
}
