package myskunk.dl;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdOut;

public class Player {
	String userName;
	String userName1;
	String userName2;
	String rules;
	String user_input;
	Scanner playerName;
	
	Dice dice = new Dice();
//	Turn player_turn = new Turn();
	
	public Player() {
//		player 1, default
		StdOut.println("Welcome to Skunk Game.");
		Scanner playerName = new Scanner(System.in); 
		StdOut.println("Enter names for the player: ");
		this.userName = playerName.nextLine();
////		multiple
//		Scanner playerName = new Scanner(System.in); 
//		Scanner playerName1 = new Scanner(System.in); 
//		Scanner playerName2 = new Scanner(System.in); 
//		Scanner playerNumber = new Scanner(System.in); 
//		Scanner rules_Input = new Scanner(System.in); 
//		
//		StdOut.println("How many Player?");
//		this.user_input = playerNumber.nextLine(); 
//		StdOut.println("Enter names for the player: ");
//
//		
//		if (user_input.equals("1") ){
//			this.userName = playerName.nextLine(); 
//			
//			StdOut.println("Do you want to see the Rules of Skunk?");
//			rules = rules_Input.nextLine();
//			
//		}
//		if (user_input.equals("2")) {
//			this.userName = playerName.nextLine(); 
//			this.userName1 = playerName1.nextLine(); 
//			StdOut.println("Do you want to see the Rules of Skunk?");
//			rules = rules_Input.nextLine();
//			
//		}
//		if (user_input.equals("3")) {
//			this.userName = playerName.nextLine(); 
//			this.userName1 = playerName1.nextLine(); 
//			this.userName2 = playerName2.nextLine();
//			StdOut.println("Do you want to see the Rules of Skunk?");
//			rules = rules_Input.nextLine();
//		
//		}
//		if(rules.equals("yes") || rules.equals("y")) {
//			StdOut.println("PENALTIES:" +"\n"+"A skunk in any series voids the score for that series only "+"\n"+ "and draws a penalty of 1 chip placed in the KITTY,and loss of dice.");
//			StdOut.println(" ");
//			StdOut.println("A skunk and a deuce voids the score for that series only "+"\n"+ "and draws a penalty of 2 chips placed in the KITY, and loss of dice.");
//			StdOut.println(" ");
//			StdOut.println("TWO skunks void the ENTIRE accumulated score and draws a penalty of 4 chips placed in the KITTY, "+"\n"+ "and loss of dice. Player must again start to score from scratch.");
//			StdOut.println(" ");	
//		}
//	
		
	}
	
	public String getuserName() {
		return this.userName;
	}
	public String getuserName1() {
		return this.userName1;
	}
	public String getuserName2() {
		return this.userName2;
	}
	public String numberUser()
	{
		return this.user_input;
	}
	
}
