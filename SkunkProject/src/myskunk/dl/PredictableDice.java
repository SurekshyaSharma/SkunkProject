package myskunk.dl;

import edu.princeton.cs.introcs.StdOut;

public class PredictableDice {

	private int lastRoll;
	PredictableDie die1;
	 PredictableDie die2;
	 int die1Roll;
	int die2Roll;
	static int doubleSkunkCount=0;

	
	public PredictableDice()
	{
		this.die1 = new PredictableDie();
		this.die2 = new PredictableDie();
		this.roll();
	}

	public PredictableDice(PredictableDie die1, PredictableDie die2) // overloaded constructor
	{
		this.die1 = die1;
		this.die2 = die2;
	}

	

	public int getLastRoll()
	{
		return this.lastRoll;
	}

	public void roll()
	{
		

		die1.roll();
		die2.roll();
		this.lastRoll = die1.getLastRoll() + die2.getLastRoll();

	}



	public String toString()
	{
		return "Dice with last roll: " + getLastRoll() + " => " + die1.getLastRoll() + " + " + die2.getLastRoll();
	}

	public int check_doubleSkunk(int double_Skunk )
	{
		
//		//checking double skunk-----------------------------------------------------------------
	
		if ( this.getLastRoll() == 2 || this.getLastRoll() == double_Skunk && double_Skunk ==2)
		{
			double_Skunk = this.getLastRoll();
		}
		return double_Skunk ;
		
	}
		
	public boolean check_Skunk(int die1c, int die2c )
	{
		 die1c = this.die1Roll;
		 die2c = this.die2Roll;
		
		
	//checking skunk------------------------------------------------------------------------
		if (this.die1Roll ==1   )
		{ 	 
			if (this.die2Roll !=1 || this.die2Roll !=2 || this.die2Roll == 3 || this.die2Roll == 4 || this.die2Roll == 5 || this.die2Roll == 6   )
			{
				return true;
			}
		
		}
		if (this.die2Roll ==1 )
		{
			if (this.die1Roll!=1  || this.die1Roll == 3 || this.die1Roll == 4 || this.die1Roll == 5 || this.die1Roll == 6  )
			{
				return true;
			}
		}

		return false;
	}
	public boolean check_deuce( int lastRoll)
	{
		lastRoll = this.getLastRoll() ;
		//checking deuce-------------------------------------------------------------------------
		if (lastRoll == 3) {
			return true;
		}
		
			return false;
		
		
	}


}
