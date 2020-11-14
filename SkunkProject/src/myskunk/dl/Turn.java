package myskunk.dl;
import edu.princeton.cs.introcs.StdOut;
//import java.util.Scanner;
import java.util.ArrayList;

public class Turn 
	{
		Dice dice = new Dice();
		
		public static final int NUM_TRIALS = 15;
		int doubleSkunkCount = 0;
	
	
	public boolean game()
	{
		int doubleSkunkCount = 0;
		int skunkCount = 0;
		int deuceCount = 0;
		int rollCount = 0;
		int total = 0;
		int remainingTotal =0;
		int Chips = 50;
		int remainingChip = 0;
		int skunk = 0;
		int dskunk = 0 , deuce = 0;
		int deu = 0;
		int dSku = 0;
		int sku = 0;
		
		for (int i = 0; i < NUM_TRIALS; i++)
		{
			dice.roll();
			StdOut.println(dice);
			rollCount = dice.getLastRoll();

			total += rollCount;
		//	if (total==100||total>100) {
//				StdOut.println("You score 100 or over 100.");
//				Scanner playerName = new Scanner(System.in);  // Create a Scanner object
//				StdOut.println("Do you still want to play?:");
//			    String playMore = playerName.nextLine();  // Read user input
//			    total+
//				return ;
			//}
			if (dice.check_doubleSkunk() == true) 
			{ //penalties lost of die and 2 chips
				doubleSkunkCount ++;
				
				StdOut.println(remainingChip);
				dskunk++;
				dSku =	dskunk*4;
				total = 0;
				StdOut.println("ToTal because of double skunk is 0.");
				
			}
//				
			if (dice.check_Skunk() == true)
			{	
			//penalties lost of die and 4 chips and lost all points
				skunkCount++;
				skunk++;
				
			}
			if (dice.check_Deuce() == true)
			{
//			//penalties lost of die and 2 chips
				deuceCount++;
				deuce++;
				deu = deuce*2;

			}
			remainingChip = Chips - (dSku + deu + skunk);
			
		 }
		StdOut.println("Actual doubleSkunkCount: " + doubleSkunkCount);
		StdOut.println("Actual SkunkCount: " + skunkCount);
		StdOut.println("Actual DeuceCount: " + deuceCount);
		StdOut.println("Total was: "+ total);
		StdOut.println("You have"+ " "+ remainingChip +" reduced chip.");
		
		return false;
	
	}

}