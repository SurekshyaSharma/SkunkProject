package myskunk.dl;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


//
	public class TestDice
	{

		Dice dice= new Dice();

		@Test
		public void check_double_skunk()
		{
			
			assertEquals(2,dice.check_doubleSkunk(2));
		}
	
		@Test
		public void check_skunk()
		{  
	
			assertEquals(true,dice.check_Skunk(1, 4));
		}
		
		@Test
		public void check_not_skunk()
		{  
			
			assertEquals(false,dice.check_Skunk(1, 2));
		}
		
		@Test
		public void check_deuce()
		{  
		
			assertEquals(true,dice.check_deuce(3));
		}

		@Test
		public void check_not_deuce()
		{  
			
			assertEquals(false,dice.check_deuce(2));
		}
	}

