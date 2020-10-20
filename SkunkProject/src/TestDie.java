import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestDie {

	@Test
	void skunk() {
		Die die= new Die();
		assertEquals(true,die.skunk(1));
	}

}
