package myskunk.dl;
import edu.princeton.cs.introcs.StdOut;


	public class Turn 
		{
			Dice dice = new Dice();
			int i =0;

			
		 	public static final int NUM_TRIALS = 20;
			
			String uname;
			String uname1;
			String uname2;
			private int doubleSkunkCount = 0, skunkCount = 0, deuceCount = 0, total = 0, dTotal = 0 ,Chips = 50;
			private int remainingChip = 0;
			private int skunk = 0, dskunk = 0 , deuce = 0;
			private int deu = 0, dSku = 0,  rollCount = 0, rollCount1= 0;
			private int winner = 0;
	
			String userNumber;
			
	public Turn(Player player) 
	{
		this.uname = player.getuserName();
		
	}
	
	public Turn()
	{
		
	}
	
	
	public boolean game()
	{	
		
		for (int i = 0; i < NUM_TRIALS; i++)
		{
			dice.roll();
			StdOut.println(dice);
			rollCount = dice.getLastRoll();
			total += rollCount;
			
			if (dice.check_doubleSkunk(rollCount) ==true)
			{ 
				double_Skunk_total();
				StdOut.println("Double Skunk.");
				
				StdOut.println("Total is:" +" " + dTotal);
				StdOut.println(" ");
				StdOut.println("Actual doubleSkunkCount: " + this.doubleSkunkCount);
				StdOut.println(this.uname + " you have"+ " "+ this.remainingChip + " chips left.");
				System.exit(i);
			}
			
			if (dice.check_Skunk(dice.getdie1Roll(),dice.getdie2Roll()) == true)
			{	
				skunk_total();
				StdOut.println(" ");
				StdOut.println("Skunk.");
				StdOut.println("Actual SkunkCount: " + this.skunkCount);
				StdOut.println("Total is:" +" " + total);
				StdOut.println(" ");
				StdOut.println(this.uname + " you have"+ " " + this.remainingChip + " chips left.");
				
				System.exit(i );
				
			}
			
			if (dice.check_deuce(rollCount) == true)
			{
				deuce_total();
				StdOut.println(" ");
				StdOut.println("Deuce.");
				StdOut.println("Actual DeuceCount: " + this.deuceCount);
				StdOut.println("Total is:" +" " + total);
				StdOut.println(this.uname + " you have"+ " "+ this.remainingChip +" chips left.");
				System.exit(i);
			}
			
			if (total <= 100)
			{
				StdOut.println("Total was:" +" " + total);
				dice.roll();
				StdOut.println(dice);
				this.rollCount1 = dice.getLastRoll();
				this.winner = this.total + this.rollCount1;
				StdOut.println("Total after one extra roll is :" +" " + this.winner);
				System.exit(i);
			}
			
		 }
		
			return false;
	
		}
	
		public int double_Skunk_total()
		{
			//---------------------------Checking DoUBLE SKUNK-----------------------------------------------------
			
			this.doubleSkunkCount ++;
			this.dskunk++;
			this.dSku =	this.dskunk*4;
			this.remainingChip = this.Chips - this.dSku;
			return dTotal;
		}

		public boolean skunk_total() 
		{
			//---------------------------Checking SKUNK----------s--------------------------------------------------
				
			this.skunkCount++;
			this.skunk++;
			this.remainingChip = this.Chips - this.skunk;
			return true;
			
			
		}

		public boolean deuce_total()
		{
			this.deuceCount++;
			this.deuce++;
			this.deu = deuce*2;
			this.remainingChip = this.Chips - this.deu ;
			return true;
		}
	

}
