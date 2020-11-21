package myskunk.dl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTurn {
	Turn turn = new Turn();
	@Test
	void test_Turn_double_skunk() {
		assertEquals(0,turn.double_Skunk_total());
	}
	
	@Test
	void skunk_total() {
		
		assertEquals(true,turn.skunk_total());
	}
	
	@Test
	void test_Turn_deuce() {
		
		assertEquals(true,turn.deuce_total());
	}
	

}
