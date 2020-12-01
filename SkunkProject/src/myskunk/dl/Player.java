package myskunk.dl;

import java.util.Scanner;

import edu.princeton.cs.introcs.StdOut;

public class Player {
	private String userName;
	private String userName1;
	private String userName2;
	private String rules;
	private String user_input;
	private int final_total1 = 0, final_total2 = 0, final_total3 = 0, rollCount = 0, total = 0;
	//Scanner playerName;
	Dice dice = new Dice();
	Turn turn1 = new Turn();
	Turn turn2 = new Turn();
	Turn turn3 = new Turn();

	int i =0;
	private int remainingChip1 = 0;
	private int remainingChip2 = 0;
	private int remainingChip3 = 0;
	private int rollCount1 = 0;
	private int rollCount2 = 0;

	
	public boolean Player_info() {
		StdOut.println("Welcome to Skunk Game.");

//		multiple
		Scanner gamer = new Scanner(System.in);  
		StdOut.println("Do you want to see the Rules of Skunk?");
		this.rules = gamer.nextLine();
		if(rules.equals("yes") || rules.equals("y")) {
			StdOut.println("PENALTIES:" +"\n"+"A skunk in any series voids the score for that series only "+"\n"+ "and draws a penalty of 1 chip placed in the KITTY,and loss of dice.");
			StdOut.println(" ");
			StdOut.println("A skunk and a deuce voids the score for that series only "+"\n"+ "and draws a penalty of 2 chips placed in the KITY, and loss of dice.");
			StdOut.println(" ");
			StdOut.println("TWO skunks void the ENTIRE accumulated score and draws a penalty of 4 chips placed in the KITTY, "+"\n"+ "and loss of dice. Player must again start to score from scratch.");
			StdOut.println(" ");	
		}
		StdOut.println("How many Player? You can play upto 3 players.");
		this.user_input = gamer.nextLine(); 
		
		if (user_input.equals("1"))
		{
			
			StdOut.println("Enter your name here ");
			this.userName = gamer.nextLine(); 
			StdOut.println("The first player is " + this.userName);
			StdOut.println("----------------------------------------------------------------------------" );
			this.total = turn1.game();
			this.final_total1 = this.total;
			this.final_total1 = this.total + this.rollCount;
			
			int show_tot = extra_Turns1();
			
		}
		if (user_input.equals("2")) 
		{
			StdOut.println("Enter names for the player: ");
			this.userName = gamer.nextLine(); 
			this.userName1 = gamer.nextLine(); 
			StdOut.println("The first player is " + this.userName);
			StdOut.println("----------------------------------------------------------------------------" );
			this.total = turn1.game();
			StdOut.println("--------->>>>>>>>>>>>>>>>>>>>------------------------------------------------------" );
			this.final_total1 = this.total;
			this.final_total1 = this.total + this.rollCount;
//		
			StdOut.println(" ");
			StdOut.println("The second player is " + this.userName1);
			StdOut.println("----------------------------------------------------------------------------" );
			this.total = turn2.game();
			StdOut.println("---------->>>>>>>>>>>>>>>>>>>-----------------------------------------------------" );
			this.final_total2 = this.total;
			this.final_total2 = this.total + this.rollCount;
			//playing turns after aturn for different players
			while (this.final_total1 < 100 && this.final_total2 < 100) {
				int show_tot_1 = extra_Turns1();
				int show_tot_2 = extra_Turns2();
			}
			//giving a chance to increase the number 
			if (this.final_total1 < 100 ) {
				dice.roll();
				StdOut.println(dice);
				this.rollCount1  = dice.getLastRoll();
				this.final_total1 = this.final_total1 + this.rollCount1;
				StdOut.println("The total for first player after the final roll is "+ this.final_total1);
				
			}else {
				dice.roll();
				StdOut.println(dice);
				this.rollCount1  = dice.getLastRoll();
				this.final_total2 = this.final_total2 + this.rollCount1;
				StdOut.println("The total second playerafter the final roll is "+ this.final_total2);
				
			}
			String Winner= winner_twoPlayers( this.final_total1, this.final_total2 );
			
			StdOut.println("Winner of the game is the "+ Winner+ " player.");
			
		}
		
		if (user_input.equals("3")) 
		{
			StdOut.println("Enter names for the player: ");
			this.userName = gamer.nextLine(); 
			this.userName1 = gamer.nextLine(); 
			this.userName2 = gamer.nextLine();
			StdOut.println("The first player is " + this.userName);
			StdOut.println("----------------------------------------------------------------------------" );
			this.total = turn1.game();
			StdOut.println("---------->>>>>>>>>>>>>>>>>>>-----------------------------------------------------" );
			this.final_total1 = this.total;
			this.final_total1 = this.total + this.rollCount;
			StdOut.println(" ");
			StdOut.println("The second player is " + this.userName1);
			StdOut.println("----------------------------------------------------------------------------" );
			this.total = turn2.game();
			StdOut.println("---------->>>>>>>>>>>>>>>>>>>-----------------------------------------------------" );
			this.final_total2 = this.total;
			this.final_total2 = this.total + this.rollCount;
			StdOut.println(" ");
			StdOut.println("The third player is " + this.userName2);
			StdOut.println("----------------------------------------------------------------------------" );
			this.total = turn3.game();
			StdOut.println("---------->>>>>>>>>>>>>>>>>>>-----------------------------------------------------" );
			this.final_total3 = this.total;
			this.final_total3 = this.total + this.rollCount;
			//playing turns after aturn for different player
			while (this.final_total1 < 100 && this.final_total2 < 100 && this.final_total3 < 100   ) {
				int show_tot_1 = extra_Turns1();
				int show_tot_2 = extra_Turns2();
				int show_tot_3 = extra_Turns3();
			}
			// giving extra turn for player to increase the number
			if (this.final_total1 < 100 ) {
				dice.roll();
				StdOut.println(dice);
				this.rollCount1  = dice.getLastRoll();
				this.final_total1 = this.final_total1 + this.rollCount1;
				StdOut.println("The total for first player after the final roll is "+ this.final_total1);
				
				
			}
			if(this.final_total2 < 100 ) {
				dice.roll();
				StdOut.println(dice);
				this.rollCount1  = dice.getLastRoll();
				this.final_total2 = this.final_total2 + this.rollCount1;
				StdOut.println("The total of  second playerafter the final roll is "+ this.final_total2);
				
			}
			if(this.final_total3 < 100 ) {
				dice.roll();
				StdOut.println(dice);
				this.rollCount1  = dice.getLastRoll();
				this.final_total3 = this.final_total3 + this.rollCount1;
				StdOut.println("The total of third player after the final roll is "+ this.final_total3);
			}
			
			String Winner = winner_threePlayers( final_total1, final_total2, final_total3);
			
			StdOut.println("Winner of the game is the "+ Winner+ " player.");
		}
		
		return false;
	
		
	}
	public int extra_Turns1() {
		StdOut.println(" ");
		StdOut.println("The first player " +  this.userName +" extra turn " );
		StdOut.println("----------------------------------------------------------------------------" );
		int turn = 0;
		
		while (this.final_total1 < 100 || this.final_total2 < 100 || this.final_total3 < 100)
		{
	
			dice.roll();
			StdOut.println(dice);
			int die1_Roll = dice.getdie1Roll();
			int die2_Roll = dice.getdie2Roll();
			this.rollCount = dice.getLastRoll();
			this.remainingChip1 = turn1.get_remainingChip(die1_Roll,die2_Roll);
		
			if (dice.check_doubleSkunk(die1_Roll, die2_Roll) == true ) {
			 
				turn++;
				this.final_total1 = final_total1 + this.rollCount;
				StdOut.println("double skunk");
				final_total1 = 0;
				this.remainingChip1 = this.remainingChip1-4;
//				dice.roll();
//				StdOut.println(dice);
//				this.final_total1 = final_total1 + this.rollCount;
				
				break;
//				return final_total1;
			}
			
			if (dice.check_Skunk(die1_Roll, die2_Roll) == true )
			{ 
				turn++;
				this.final_total1 = final_total1 + this.rollCount;
				StdOut.println("skunk");
				this.remainingChip1 = this.remainingChip1-1;
				break;
				
			}
			
			if (dice.check_deuce(die1_Roll, die2_Roll) == true )
			{ 
				turn++;
				this.final_total1= final_total1 + this.rollCount;
				StdOut.println("deuce");
				this.remainingChip1 = this.remainingChip1-2;
//				dice.roll();
//				StdOut.println(dice);
//				this.final_total1 = final_total1 + this.rollCount;
				break;
//				return final_total1;
			}
			
			if (dice.check_Normal(die1_Roll, die2_Roll) == true) {
				turn++;
				this.final_total1 = final_total1 + this.rollCount;
				
			}
		}
		StdOut.println("Total after extra turns is "+ this.final_total1);
		StdOut.println("Remaining Chip is "+ this.remainingChip1);
		StdOut.println("---------->>>>>>>>>>>>>>>>>>>-----------------------------------------------------" );
	
		return final_total1;
	}
	
	public int extra_Turns2() {
		StdOut.println(" ");
		StdOut.println("The second player " +  this.userName1 +" extra turn " );
		StdOut.println("----------------------------------------------------------------------------" );
		int turn = 0;
		
		while (this.final_total2 < 100 || this.final_total1 < 100)
		{
	
			dice.roll();
			StdOut.println(dice);
			int die1_Roll = dice.getdie1Roll();
			int die2_Roll = dice.getdie2Roll();
			this.rollCount = dice.getLastRoll();
			this.remainingChip2  = turn2.get_remainingChip(die1_Roll,die2_Roll);
			if (dice.check_doubleSkunk(die1_Roll, die2_Roll) == true ) {
			 
				turn++;
				this.final_total2 = final_total2 + this.rollCount;
				StdOut.println("double skunk");
				final_total2 = 0;
				StdOut.println("Total after extra turns is "+ this.final_total2);
				this.remainingChip2 = this.remainingChip2-4;
				StdOut.println("Remaining Chip is "+ this.remainingChip2);
				StdOut.println("---------->>>>>>>>>>>>>>>>>>>-----------------------------------------------------" );
			
				return final_total2;
			}
			
			if (dice.check_Skunk(die1_Roll, die2_Roll) == true )
			{ 
				turn++;
				this.final_total2 = final_total2 + this.rollCount;
				StdOut.println("skunk");
				StdOut.println("Total after extra turns is "+ this.final_total2);
				this.remainingChip2 = this.remainingChip2-1;
				StdOut.println("Remaining Chip is "+ this.remainingChip2);
				StdOut.println("---------->>>>>>>>>>>>>>>>>>>-----------------------------------------------------" );
			
				return final_total2;
		
			}
			
			if (dice.check_deuce(die1_Roll, die2_Roll) == true )
			{ 
				turn++;
				this.final_total2  = final_total2 + this.rollCount;
				StdOut.println("deuce");
				StdOut.println("Total after extra turns is "+ this.final_total2);
				this.remainingChip2 = this.remainingChip2-2;
				StdOut.println("Remaining Chip is "+ this.remainingChip2);
				StdOut.println("---------->>>>>>>>>>>>>>>>>>>-----------------------------------------------------" );
			
				return final_total2;
			}
			
			if (dice.check_Normal(die1_Roll, die2_Roll) == true) {
//				turn++;
				this.final_total2 = final_total2 + this.rollCount;
				StdOut.println("Total after extra turns is "+ this.final_total1);
				StdOut.println("Remaining Chip is "+ this.remainingChip2);
			}
		}
		
		
		return final_total2;
	}
	
	
	public int extra_Turns3() {
		StdOut.println(" ");
		StdOut.println("The third player " +  this.userName2 +" extra turn " );
		StdOut.println("----------------------------------------------------------------------------" );
		int turn = 0;
		
		while (this.final_total1 < 100 || this.final_total2 < 100 || this.final_total3 < 100)
		{
	
			dice.roll();
			StdOut.println(dice);
			int die1_Roll = dice.getdie1Roll();
			int die2_Roll = dice.getdie2Roll();
			this.rollCount = dice.getLastRoll();
			this.remainingChip3 = turn3.get_remainingChip(die1_Roll,die2_Roll);
			if (dice.check_doubleSkunk(die1_Roll, die2_Roll) == true ) {
			 
				turn++;
				this.final_total3 = final_total3 + this.rollCount;
				StdOut.println("double skunk");
				final_total3 = 0;
				StdOut.println("Total after extra turns is "+ this.final_total3);
				this.remainingChip3 = this.remainingChip3-4;
				StdOut.println("Remaining Chip is "+ this.remainingChip3);
				StdOut.println("---------->>>>>>>>>>>>>>>>>>>-----------------------------------------------------" );
				
				return final_total3;
			}
			
			if (dice.check_Skunk(die1_Roll, die2_Roll) == true )
			{ 
				turn++;
				this.final_total3 = final_total3 + this.rollCount;
				StdOut.println("skunk");
				StdOut.println("Total after extra turns is "+ this.final_total3);
				this.remainingChip3 = this.remainingChip3-1;
				StdOut.println("Remaining Chip is "+ this.remainingChip3);
				StdOut.println("---------->>>>>>>>>>>>>>>>>>>-----------------------------------------------------" );
			
				return final_total2;
		
			}
			
			if (dice.check_deuce(die1_Roll, die2_Roll) == true )
			{ 
				turn++;
				this.final_total3  = final_total3 + this.rollCount;
				StdOut.println("deuce");
				StdOut.println("Total after extra turns is "+ this.final_total3);
				this.remainingChip3 = this.remainingChip3-2;
				StdOut.println("Remaining Chip is "+ this.remainingChip3);
				StdOut.println("---------->>>>>>>>>>>>>>>>>>>-----------------------------------------------------" );
			
				return final_total3;
			}
			
			if (dice.check_Normal(die1_Roll, die2_Roll) == true) {
//				turn++;
				this.final_total3 = final_total3 + this.rollCount;
				StdOut.println("Total after extra turns is "+ this.final_total3);
				StdOut.println("Remaining Chip is "+ this.remainingChip3);
			}
		}
		
		
		return final_total3;
	}
	
	public String winner_threePlayers( int a, int b, int c) {
		
		this.final_total1 = a;
		this.final_total2 = b;
		this.final_total3 = c;
		String winner ="";
		if  (final_total1 > final_total2 && final_total1 > final_total3 ) {
			winner ="first";
	
		}
		else if(final_total2 > final_total1 && final_total2 > final_total3 ) {
			winner ="second";
		}else {
			winner ="third";
		}
		return winner;
		
		}
	
	public String winner_twoPlayers( int a, int b ) {
			
			this.final_total1 = a;
			this.final_total2 = b;
			String winner ="";
			if  (final_total1 > final_total2  ) {
				winner ="first";
		
			}
			else {
				winner ="second";
			}
			return winner;
			
			}
		
	
	}



