package myskunk.dl;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestTurn {
	Turn turn = new Turn();
	Dice dice = new Dice();

	  
	@Test
	void remainingChip_for_skunk() {
		assertEquals(49,turn.get_remainingChip( 1,3 ));
		assertEquals(49,turn.get_remainingChip( 3,1 ));
		
	}
	
	@Test
	void remainingChip_for_deuce() {
		assertEquals(48,turn.get_remainingChip( 1, 2));
		assertEquals(48,turn.get_remainingChip( 2, 1));
	}
	
	@Test
	void remainingChip_for_double_skunk() {
		assertEquals(46,turn.get_remainingChip( 1, 1));
	}
	@Test
	void remainingChip_for_normal() {
		assertEquals(50,turn.get_remainingChip( 4, 5));
	}
}
