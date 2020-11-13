package myskunk.dl;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import myskunk.dl.Die;

class TestDie {

	@Test
	void skunk() {
		Die die= new Die();
		assertEquals(true,die.skunk(1));
	}
	
	@Test
	void not_skunk() {
		Die die= new Die();
		assertEquals(false,die.skunk(2));
		assertEquals(false,die.skunk(3));
	}
	
	@Test
	void deuce() {
		Die die= new Die();
		assertEquals(true,die.deuce(3));
	}
	
	@Test
	void not_deuce() {
		Die die= new Die();
		assertEquals(false,die.deuce(4));
		
	}
	
	@Test
	void deuce1() {
		Die die= new Die();
		assertEquals(false,die.deuce(5));
		
	}

}
