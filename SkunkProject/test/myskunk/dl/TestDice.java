package myskunk.dl;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;


//
	public class TestDice
	{
		Dice dice = new Dice(); 

		@Test
		public void check_double_skunk()
		{
			
			assertEquals(true,dice.check_doubleSkunk(1, 1));
		}
	
		@Test
		public void check_skunk()
		{  
	
			assertEquals(true,dice.check_Skunk(1,3));
			assertEquals(true,dice.check_Skunk(3,1));
			assertEquals(false,dice.check_Skunk(3,3));
		}
		
		@Test
		public void check_deuce()
		{  
		
			assertEquals(true,dice.check_deuce(1,2));
			assertEquals(true,dice.check_deuce(2,1));
			assertEquals(false,dice.check_deuce(3,3));
		}
		
		@Test
		public void check_Normal()
		{  
		
			assertEquals(true,dice.check_Normal(3,2));
			assertEquals(true,dice.check_Normal(2,2));
			assertEquals(false,dice.check_Normal(1,2));
		}

		
	}

