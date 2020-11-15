package myskunk.dl;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import myskunk.dl.Die;

class TestDie {
	Die die= new Die();
	@Test
	void skunk() {
		
		assertEquals(true,die.skunk(1));
	}
	
	@Test
	void not_skunk() {
		
		assertEquals(false,die.skunk(2));
		assertEquals(false,die.skunk(3));
	}
	
	@Test
	void deuce() {
	
		assertEquals(true,die.deuce(3));
	}
	
	@Test
	void not_deuce() {
		
		assertEquals(false,die.deuce(4));
		
	}
	
	@Test
	void deuce1() {
	
		assertEquals(false,die.deuce(5));
		
	}

}
