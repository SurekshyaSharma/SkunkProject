package myskunk.dl;
import edu.princeton.cs.introcs.StdOut;
import java.util.Scanner;

public class Roll
{
	Dice dice = new Dice();
	private int gamer1, gamer2, gamer3;
	private String uname, uname1, uname2, user_input;
	
	Scanner playerNumber, playerName;
	private int remainingChip = 0, Chips = 50,  rollCount=0, rollCount_one;
//	private int dSku,dskunk;
	private int total = 0, total1 = 0, total2 = 0;
	private int doubleSkunkCount;
	
	public Roll(Player player) {
		this.uname = player.getuserName();
		this.uname1 = player.getuserName1();
		this.uname2 = player.getuserName2();
		this.user_input = player.numberUser();  
		
		
	}
		
	public int roll_Dice_Player()
	{ 
		int i=0;
		dice.roll();
		StdOut.println(dice);
		rollCount = dice.getLastRoll();

		total += rollCount;
		
		//---------------------------Checking SKUNK----------s--------------------------------------------------
		if (this.user_input.equals("1")){
			
			//if not skunk, deuce and double skunk
			if (dice.check_doubleSkunk(rollCount) !=true && dice.check_Skunk(dice.getdie1Roll(),dice.getdie2Roll()) != true && dice.check_deuce(rollCount) != true)
			{
			
				StdOut.println(dice);
				total += rollCount;
				StdOut.println("No Skunk" +" " + total);
				
			}else {
				
				if (dice.check_doubleSkunk(rollCount) ==true)
				{ 
					//penalties lost of die and 4chips and lost all points
					total = 0;
					StdOut.println("Total is:" +" " + total);
				
					System.exit(i);
				}
				//---------------------------Checking DoUBLE SKUNK-----------------------------------------------------
				if (dice.check_Skunk(dice.getdie1Roll(),dice.getdie2Roll()) == true)
				{	
					
				//penalties lost of die and 1chips 
				
					StdOut.println("Total is:" +" " + total1);
					System.exit(i);
					
				}
				//---------------------------Checking DoUBLE DEUCE------------------------------------------------
				if (dice.check_deuce(rollCount) == true)
				{
					//penalties lost of die and 2 chips
					StdOut.println("Total is:" +" " + total);
					System.exit(i);
					
				}
					
			}
	}
		return total;
	}
}