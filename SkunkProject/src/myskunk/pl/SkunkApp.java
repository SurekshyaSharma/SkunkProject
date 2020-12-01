package myskunk.pl;
import java.util.Scanner;
import edu.princeton.cs.introcs.StdOut;
import myskunk.dl.Dice;
import myskunk.dl.Player;
import myskunk.dl.Turn;

public class SkunkApp {
	public static void main(String[] args)
	{
		Player skunkplayer = new Player();
		Turn turn = new Turn(skunkplayer);
		skunkplayer.Player_info();
	} 
	
}
