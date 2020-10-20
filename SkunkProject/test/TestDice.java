
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;



	public class TestDice
	{

		@Test
		public void check_double_skunk()
		{
			Dice dice= new Dice();
//			dice.roll();
		
			assertEquals(true,dice.double_skunk(2));
		}
		@Test
		public void check_not_double_skunk()
		{
			Dice dice= new Dice();
//			dice.roll();
			assertEquals(false,dice.double_skunk(1));
		}
		@Test
		public void skunk()
		{
			Dice dice= new Dice();
//			dice.roll();
			assertEquals(true,dice.skunk(4));
		}
		@Test
		public void not_skunk()
		{
			Dice dice= new Dice();
//			dice.roll();
			assertEquals(false,dice.skunk(2));
		}
		@Test
		public void deuce()
		{
			Dice dice= new Dice();
//			dice.roll();
			assertEquals(true,dice.deuce(3));
		}
		@Test
		public void not_deuce()
		{
			Dice dice= new Dice();
			assertEquals(false,dice.deuce(4));
		}

	}

