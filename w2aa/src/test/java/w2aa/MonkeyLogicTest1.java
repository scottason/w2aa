package w2aa;
import model.monkeyLogic;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MonkeyLogicTest1 {
	monkeyLogic testMonkey = new monkeyLogic();
	Monkey monkey = new Monkey(55.5);
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testMonkeySize() {
		assertEquals("Above Average", testMonkey.calculateMonkeySize(monkey));
}
	public void testAssertNull() {
		assertNull(monkey.getName());
	}
}
