package skunk.domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPredictableDie {

	@Test
	void test_PD_1_2_3() {
//		fail("Not yet implemented");
		PredictableDie die = new PredictableDie(new int[] {1,2,3,4});
		die.roll();
		assertEquals(1,die.getLastRoll());
		die.roll();
		assertEquals(2,die.getLastRoll());
		die.roll();
		assertEquals(3,die.getLastRoll());
		die.roll();
		assertEquals(4,die.getLastRoll());
	
		
	}

}
