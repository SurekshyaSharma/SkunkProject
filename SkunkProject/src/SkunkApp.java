import edu.princeton.cs.introcs.StdOut;

public class SkunkApp {
	public static void main(String[] args)
	{
		int roll;
		Dice dice= new Dice();
		dice.roll();
		roll=dice.getLastRoll();
		StdOut.println("Welcome to Skunk APP");
		StdOut.println(roll);
		
	}
	
}
