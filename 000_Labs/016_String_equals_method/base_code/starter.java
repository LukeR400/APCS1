/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.print("Choose a Character type: Wizard, Warrior, or Rogue: "); 
		String CHAR = sc.nextLine();
		if((CHAR.equals("Wizard"))||(CHAR.equals("Warrior"))||(CHAR.equals("Rogue"))){
			System.out.print("You chose to be a "+CHAR);
		}
		else{
			System.out.print("You have not chosen a character.");
		}
	}
}
