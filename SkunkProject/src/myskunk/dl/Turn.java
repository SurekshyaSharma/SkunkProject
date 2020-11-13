package myskunk.dl;
import edu.princeton.cs.introcs.StdOut;
import java.util.Scanner;
import java.util.ArrayList;

public class Turn 
	{
		Dice dice = new Dice();
		
		public static final int NUM_TRIALS = 5;
		int doubleSkunkCount = 0;
	
	
	public boolean game()
	{
		int doubleSkunkCount = 0;
		int skunkCount = 0;
		int deuceCount = 0;
		int rollCount = 0;
		int total = 0;
		int Chips = 50;
		int remainingChip = 0;
		
		for (int i = 0; i < NUM_TRIALS; i++)
		{
			dice.roll();
			StdOut.println(dice);
			rollCount = dice.getLastRoll();
			StdOut.println(rollCount);
			dice.check_doubleSkunk();
			dice.check_Skunk();
			dice.check_Deuce();
			
			total += rollCount;
//			if (dice.check_doubleSkunk() == true) 
//			{ //penalties lost of die and 2 chips
//				total += rollCount;
//				remainingChip = Chips - 1;
//				
//			}
//				
//			if (dice.check_doubleSkunk() == true)
//			{	
//			//penalties lost of die and 4 chips and lost all points
//				total = 0;
//				remainingChip = Chips - 4;
//			}
//			if (dice.check_Deuce() == true)
//			{
////			//penalties lost of die and 2 chips
//				total += rollCount;
//				remainingChip = Chips - 2;
//				
//			}
	
		 }
		StdOut.println("Actual Double SkunkCount: " + doubleSkunkCount);
		StdOut.println("Actual SkunkCount: " + skunkCount);
		StdOut.println("Actual DeuceCount: " + deuceCount);
		StdOut.println(total);
		StdOut.println("You have"+ " "+ remainingChip +" remaining chips.");
		
		return false;
	
	}

}