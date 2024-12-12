/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.Scanner;

class starter{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Slot Machine Rules: ");
	System.out.println("1. Each player starts with $100.");
	System.out.println("2. Input a wager less than your total amount of money.");
	System.out.println("3. The slot machine will roll 3 numbers from 1 to 10.");
	System.out.println("   a. If two numbers match, you double your money.");
	System.out.println("   b. If three numbers match, you triple your money.");
	System.out.println("   c. If none match, you lose your money.");
	System.out.println("-------------------------------------------------------");
	int CASH = 100;
	while(true){
		System.out.println("Would you like to play the slots? (Yes/yes/Y/y) if not (No/no/N/n): ");
		String PLAY = sc.nextLine();
		if((PLAY.equals("Yes"))||(PLAY.equals("yes"))||(PLAY.equals("Y"))||(PLAY.equals("y"))){
			System.out.print("You have $"+CASH+". How much would you like to wager?");
			int GAMBLED = sc.nextInt();
			CASH=CASH-GAMBLED;
			int RAND1 = (int)((Math.random()*(10))+0);
			int RAND2 = (int)((Math.random()*(10))+0);
			int RAND3 = (int)((Math.random()*(10))+0);
			System.out.println("Great! Let's play!");
			System.out.println("Your rolls are:");
			System.out.println("_______________________");
			System.out.println("| "+RAND1+" | "+RAND2+" | "+RAND3+" |");
			System.out.println("_______________________");
			if(RAND1!=RAND2&&RAND1!=RAND3&&RAND2!=RAND3){
				System.out.println("Didn't win this time, better luck next time!");
				GAMBLED=GAMBLED/2;
				CASH=CASH+GAMBLED;
				System.out.println("You now have $"+CASH+".");
			}
			else if(RAND1==RAND2||RAND1==RAND3||RAND1==RAND3){
				System.out.println("You won! You're wager has now been doubled!");
				GAMBLED=GAMBLED*2;
				CASH=CASH+GAMBLED;
				System.out.println("You now have $"+CASH+".");
			}
			else if((RAND1==RAND2&&RAND1==RAND3)||(RAND2==RAND1&&RAND2==RAND3)||(RAND3==RAND1&&RAND3==RAND2)){
				System.out.println("JACKPOT! You're wager has now been tripled!");
				GAMBLED=GAMBLED*3;
				CASH=CASH+GAMBLED;
				System.out.println("You now have $"+CASH+".");
			}
		}
		else if((PLAY.equals("No"))||(PLAY.equals("no"))||(PLAY.equals("N"))||(PLAY.equals("n"))){
			break;
		}
		else if((PLAY.equals("No"))||(PLAY.equals("no"))||(PLAY.equals("N"))||(PLAY.equals("n"))||(PLAY.equals("Yes"))||(PLAY.equals("yes"))||(PLAY.equals("Y"))||(PLAY.equals("y")))
		{
			System.out.println("That wasn't quite the correct answer. Try again.");
		}
	}
	}
}
