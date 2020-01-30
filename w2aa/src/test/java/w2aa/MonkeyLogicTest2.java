package w2aa;
import model.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MonkeyLogicTest2 {
	monkeyLogic testMonkey = new monkeyLogic();
	Monkey monkey = new Monkey(55.5);
	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testMonkeyIsBaby() {
		monkey.setAge(4);
		assertFalse(testMonkey.monkeyIsBaby(monkey));
		
	}
	

}
