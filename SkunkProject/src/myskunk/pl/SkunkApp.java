package myskunk.pl;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdOut;
import myskunk.dl.Dice;
import myskunk.dl.Player;
import myskunk.dl.Turn;


public class SkunkApp {
	public static void main(String[] args)
	{
		
		Dice dice = new Dice();
		Turn turn = new Turn();
		Player player = new Player();
		
//		welcome user--------------------------------------------------------------------------------------------------
		StdOut.println("Welcome to Skunk Game.");
//		turn.playerInfo();
//		Check --------------------------------------------------------------------------------------------------------
		turn.game();
//		Continue or Exit----------------------------------------------------------------------------------------------
		
		
	}

	
	
}
