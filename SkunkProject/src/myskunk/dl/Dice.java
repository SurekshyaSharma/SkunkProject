package myskunk.dl;

import edu.princeton.cs.introcs.StdOut;
import skunk.domain.PredictableDie;

/**
 * Dice represents a single pair of rollable Die objects, randomly generating
 * sums of their two values
 * 
 * This is a Javadoc comment: add more to your finished class below
 * 
 * @author Surekshya
 *
 */

public class Dice
{
	// Instance fields (variables) may be declared anywhere in class body
	// Convention: put at top

	private int lastRoll;
	private Die die1;
	private Die die2;
	int doubleSkunkCount = 0;
	int skunkCount = 0;
	int deuceCount = 0;
	
	int die1Roll;
	int die2Roll;

	// Constructors (object initializers) also can be declared anywhere
	// Convention: after instance fields/variables

	public Dice()
	{
		// initialize instance variables die1 and die2 by
		// creating a new instance of each

		this.die1 = new Die();
		this.die2 = new Die();
		this.roll();
	}


 // overloaded constructor
	{
		this.die1 = die1;
		this.die2 = die2;
	}

	// Instance methods can also be declared anywhere in body of class
	// One convention: after the constructors

	public int getLastRoll()
	{
		return this.lastRoll;
	}

	public void roll()
	{
		// Roll each of die1, die2, sum their last rolls,
		// then set Dice.lastRoll to this value

		die1.roll();
		die2.roll();
		this.die1Roll = die1.getLastRoll();
		this.die2Roll = die2.getLastRoll();
		this.lastRoll = this.die1Roll  + this.die2Roll;
		
	}

	// the following method converts the internals of
	// this Dice object, and returns a descriptive String:
	//
	// Roll of 7 => 4 + 3
	//

	public String toString()
	{
		return "Roll value: " + getLastRoll() + " => " + die1.getLastRoll() + " + " + die2.getLastRoll();
	}

	// static methods can go anywhere - but at end is one convention

//	public static final int NUM_TRIALS = 360;
//
//	public static void main(String[] args)
//	{
//		// simulate repeated rolls of Dice, counting the many double skunks
//		
//		Dice dice = new Dice();
//		int doubleSkunkCount = 0;
//
//		for (int i = 0; i < NUM_TRIALS; i++)
//		{
//			dice.roll();
//			StdOut.println(dice);
//
//			if (dice.getLastRoll() == 2)
//				doubleSkunkCount++;
//		}
//
//		StdOut.println("Actual count: " + doubleSkunkCount);
//		StdOut.println("Expected count: " + (NUM_TRIALS / 36.0));
//	}

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
		if (this.die1Roll ==1  )
		{ 	 
			if (this.die2Roll !=1 && this.die2Roll !=2)
			{
				return true;
			}
		
		}
		if (this.die2Roll ==1  )
		{
			if (this.die1Roll!=1 && this.die1Roll !=2  )
			{
				return true;
			}
		}

		return false;
	}
	public boolean check_deuce( int deuceCheck)
	{
		//checking deuce-------------------------------------------------------------------------
		if (this.die1Roll ==1 || deuceCheck == 3)
		{ 	 
			if (this.die2Roll ==2 || deuceCheck == 3)
			{
				return true;
			}
			
		}
		if (this.die1Roll ==2 || deuceCheck == 3 ) 
		{
			if (this.die2Roll==1 || deuceCheck == 3)
			{
				return true;
			}
		}
		return false;
		
	}


	}
