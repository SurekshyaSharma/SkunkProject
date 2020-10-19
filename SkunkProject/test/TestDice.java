

	import static org.junit.Assert.*;
	import static org.junit.jupiter.api.Assertions.assertEquals;

	import org.junit.Test;

	public class TestDice
	{

		@Test
		public void check_skunk()
		{
			Dice dice= new Dice();
			dice.roll();
			int roll = dice.getLastRoll();
			assertEquals(2,dice.double_skunk());
			}
			
		

	}

