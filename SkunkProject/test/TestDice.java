
import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import skunk.domain.PredictableDie;

	public class TestDice
	{

		@Test
		public void check_skunk()
		{
			Dice dice= new Dice();
//			PredictableDie die = new PredictableDie(new int[] {1,2,3,4});
			dice.roll();
			int roll = dice.double_skunk( 2);
			dice.roll();
			assertEquals(2,dice.double_skunk(2));
		}
			
		

	}

