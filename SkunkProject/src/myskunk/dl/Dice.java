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
//	{
//		this.die1 = die1;
//		this.die2 = die2;
//	}

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

	public int getdie1Roll() {
		return this.die1Roll;
	}
	public int getdie2Roll() {
		return this.die2Roll;
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

	public boolean check_doubleSkunk(int die1_Roll, int die2_Roll)
	{
		
//		//checking double skunk-----------------------------------------------------------------
	
		if ( die1_Roll == 1 &&  die2_Roll == 1)
		{
			return true;
		}
		return false;
		
	}
	
	
	public boolean check_Skunk(int die1_Roll, int die2_Roll)
	{
		
	//checking skunk------------------------------------------------------------------------
		
		 if (die1_Roll==1 )
		{ 	 
			if (die2_Roll >2  )
			{
				return true;
			}
		
		}
		if ( die2_Roll == 1  )
		{
			if (die1_Roll > 2 )
			{
				return true;
			}
		}

		return false;
	}
	public boolean check_Normal(int die1_Roll, int die2_Roll)
	{
		
	//checking skunk------------------------------------------------------------------------
		
		 if (die1_Roll > 1 )
		{ 	 
			if (die2_Roll >1  )
			{
				return true;
			}
		
		}
		if ( die2_Roll > 1  )
		{
			if (die1_Roll >1 )
			{
				return true;
			}
		}

		return false;
	}
	public boolean check_deuce( int die1_Roll, int die2_Roll)
	{
		
		//checking deuce-------------------------------------------------------------------------
		if (die1_Roll == 1 && die2_Roll == 2) {
			return true;
		}
		if (die2_Roll == 1 && die1_Roll == 2) {
			return true;
		}
		
			return false;
		
	}
	public String rollOutcome(int die1_Roll, int die2_Roll) {
		if ( die1_Roll == 1)
		{	if (die2_Roll == 1){
				return "Double Skunk";
			}else if(die2_Roll == 2) {
				return "Deuce";
			}else {
				return "Skunk";
			}
		}
		else if ( die1_Roll ==  2){
			if (die2_Roll == 1){
				return "Deuce";
			}else {
				return "Normal";
			}
		}
		else {
			if (die2_Roll == 1) {
				return "Skunk";
			}else {
				return "Normal";
			}
		
		
		}
		
	}


	}
