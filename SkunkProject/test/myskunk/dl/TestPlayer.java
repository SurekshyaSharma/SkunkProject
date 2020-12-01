package myskunk.dl;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPlayer {
	Player gamer = new Player();

	@Test
	void winner_for_Player_when_3Players() {
		assertEquals("third",gamer.winner_threePlayers( 20, 30, 40) );
		assertEquals("first",gamer.winner_threePlayers( 60, 30, 40) );
		assertEquals("second",gamer.winner_threePlayers( 20, 100, 40) );
		
}
	@Test
	void winner_for_Player_when_2Players() {
	
		assertEquals("first",gamer.winner_twoPlayers( 60, 30 ) );
		assertEquals("second",gamer.winner_twoPlayers( 20, 100 ) );
		

}
}

