package myskunk.dl;
import edu.princeton.cs.introcs.StdOut;


public class Turn 
	{
		Dice dice = new Dice();
		

//		player.playerInfo();
		
		public static final int NUM_TRIALS = 20;
		
		String uname;
		String uname1;
		String uname2;
		int doubleSkunkCount = 0, skunkCount = 0, deuceCount = 0, total = 0, dTotal = 0 ,Chips = 50;
		int remainingChip = 0;
		int skunk = 0, dskunk = 0 , deuce = 0;
		int deu = 0, dSku = 0,  rollCount = 0, rollCount1= 0;
		int winner = 0;

		String userNumber;
		
	public Turn(Player player) {
		this.uname = player.getuserName();
		this.uname1 = player.getuserName1();
		this.uname2 = player.getuserName2();
		this.userNumber = player.numberUser();
	}
		
	public boolean game()
	{	
		
		for (int i = 0; i < NUM_TRIALS; i++)
		{
			dice.roll();
			StdOut.println(dice);
			rollCount = dice.getLastRoll();

			total += rollCount;
			//---------------------------Checking SKUNK----------s--------------------------------------------------

			if (dice.check_doubleSkunk(rollCount) ==true)
			{ 
				//penalties lost of die and 4chips and lost all points
				doubleSkunkCount ++;
				dskunk++;
				dSku =	dskunk*4;
				StdOut.println("Double Skunk.");
				StdOut.println(" ");
				StdOut.println("Actual doubleSkunkCount: " + doubleSkunkCount);
				remainingChip = Chips - dSku;
				StdOut.println("Total is:" +" " + dTotal);
				StdOut.println(this.uname + " you have"+ " "+ remainingChip + " chips left.");
				System.exit(i);
				return true;
				
			}
			
			//---------------------------Checking DoUBLE SKUNK-----------------------------------------------------
			if (dice.check_Skunk(dice.getdie1Roll(),dice.getdie2Roll()) == true)
			{	
				
			//penalties lost of die and 1chips 
				skunkCount++;
				skunk++;
				StdOut.println(" ");
				StdOut.println("Skunk.");
				StdOut.println("Actual SkunkCount: " + skunkCount);
				remainingChip = Chips - skunk;
				StdOut.println("Total is:" +" " + total);
				StdOut.println(" ");
				StdOut.println(this.uname + " you have"+ " " + remainingChip + " chips left.");
				System.exit(i);
				
			}
			//---------------------------Checking DoUBLE DEUCE------------------------------------------------
			if (dice.check_deuce(rollCount) == true)
			{
				//penalties lost of die and 2 chips
				deuceCount++;
				deuce++;
				deu = deuce*2;
				StdOut.println(" ");
				StdOut.println("Deuce.");
				StdOut.println("Actual DeuceCount: " + deuceCount);
				remainingChip = Chips - deu ;
				StdOut.println(this.uname + " you have"+ " "+ remainingChip +" chips left.");
				System.exit(i);
			}
			
			if (total >= 100)
			{
				StdOut.println("Total was:" +" " + total);
				dice.roll();
				StdOut.println(dice);
				rollCount1 = dice.getLastRoll();
				winner = total + rollCount1;
				StdOut.println("Total after one extra roll is :" +" " + winner);
				System.exit(i);
			}
			
		 }
		
		return false;
	
	}

}