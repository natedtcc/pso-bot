package util;

import static org.junit.jupiter.api.Assertions.*;
import util.Input;
import org.junit.jupiter.api.Test;

class InputTest {
	
	String testMessage = "Hello, world!";
	Input inputTest = new Input(testMessage);

	@Test
	void testGetMessage() {
		assertEquals(testMessage, inputTest.getMessage());
	}

	@Test
	void testSetMessage() {
		fail("Not yet implemented");
	}

}
