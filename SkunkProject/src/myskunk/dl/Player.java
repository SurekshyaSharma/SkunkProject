package myskunk.dl;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdOut;

public class Player {
	
	public  String playerInfo() 
	{
		Scanner playerName = new Scanner(System.in);  // Create a Scanner object
		StdOut.println("Enter username:");
	    String userName = playerName.nextLine();  // Read user input
		return userName;
		
	}
	
	
	
}
