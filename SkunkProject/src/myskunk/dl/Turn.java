package myskunk.dl;
import edu.princeton.cs.introcs.StdOut;


	public class Turn 
		{
			Dice dice = new Dice();
		 	public static final int NUM_TRIALS = 17;
			private String uname, uname1, uname2, userNumber;
			private int dTotal = 0 ,Chips = 50;
			private int skunk = 1, dskunk = 4 , deuce = 2 ;
			private int rollCount = 0, rollCount1= 0;
			private int total = 0;
			private int remainingChip = 0;
			int die1_Roll = 0;
			int die2_Roll = 0;
			 
	public Turn(Player player) 
	{
//		this.uname = player.getuserName();
		
	}
	
	public Turn()
	{
		
	}
	
	
	public int game()
	{	
		
		for (int i = 0; i < NUM_TRIALS; i++)
		{
			dice.roll();
			StdOut.println(dice);
			rollCount = dice.getLastRoll();
			int die1_Roll = dice.getdie1Roll();
			int die2_Roll = dice.getdie2Roll();
			this.total += rollCount;

			if (dice.check_doubleSkunk(die1_Roll, die2_Roll) == true)
			{ 
				//---------------------------Checking DoUBLE SKUNK-----------------------------------------------------
				StdOut.println("Double Skunk.");
				this.total = 0;
				StdOut.println("Total is:" +" " + this.total);
				get_remainingChip(die1_Roll, die2_Roll );
				StdOut.println("You have"+ " "+ this.remainingChip + " chips left.");
				
				return this.total;
			}
	
			if (dice.check_Skunk(die1_Roll, die2_Roll) == true)
			{	
				StdOut.println("Skunk.");
				StdOut.println("Total is:" +" " + this.total);
				get_remainingChip(die1_Roll, die2_Roll );
				StdOut.println("You have"+ " " + this.remainingChip + " chips left.");
//				this.total = 0;
				
				return this.total;
			}
	
			if (dice.check_deuce(die1_Roll, die2_Roll) == true)
			{
				StdOut.println(" ");
				StdOut.println("Deuce.");
				StdOut.println("Total is:" +" " + this.total); 
				get_remainingChip(die1_Roll, die2_Roll );
				StdOut.println("You have"+ " "+ this.remainingChip +" chips left.");
				StdOut.println(" ");
//				this.total = 0;
				
				return this.total;
			}
			
		}
		return this.total;

	}
	public int get_remainingChip(int die1_Roll, int die2_Roll )
	{
		if (dice.check_Skunk(die1_Roll, die2_Roll) == true) 
		{
			this.remainingChip = this.Chips - 1;
		}
		else if (dice.check_deuce(die1_Roll, die2_Roll) == true) 
		{
			this.remainingChip = this.Chips - 2 ;
		}else if (dice.check_doubleSkunk(die1_Roll, die2_Roll) == true)
		{
			this.remainingChip = this.Chips - 4 ;
		}else {
			this.remainingChip = this.Chips - 0 ;
		}
		return remainingChip;
		
	}
	public int get_total() {
		return this.total;
	}
	public int get_remainingChips() {
		return this.remainingChip;
	}

}
