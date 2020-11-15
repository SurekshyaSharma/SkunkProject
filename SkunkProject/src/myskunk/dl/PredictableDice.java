package myskunk.dl;



public class PredictableDice {

	private int lastRoll;
	PredictableDie die1;
	private PredictableDie die2;
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


}
