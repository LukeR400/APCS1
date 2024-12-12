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
		System.out.println("Enter your name: ");
		String NAME = sc.nextLine();
		System.out.println("Enter the Title you want: ");
		String TITLE = sc.nextLine();
		System.out.print("Choose a Character type: Wizard, Warrior, or Rogue: "); 
		String CHAR = sc.nextLine();
		if((CHAR.equals("Wizard"))||(CHAR.equals("Warrior"))||(CHAR.equals("Rogue"))){
			System.out.print("You chose to be a "+CHAR);
		}
		else{
			System.out.print("You have not chosen a character.");
		}
		System.out.println(" ");
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Charisma. Spend them wisely.");
		System.out.println(" ");
		int FP = 20;
		System.out.println("Strength (1-10)");
		int INT1 = sc.nextInt();
		if(INT1<=10){
			FP=FP-INT1;
			System.out.println("You have "+FP+" free points left to spend");
			System.out.println("Dexterity (1-10)");
			int INT2 = sc.nextInt();
			if((INT2<=10)&&(INT2<=FP)){
				FP=FP-INT2;
				System.out.println("You have "+FP+" left to spend");
				System.out.println("Intelligence (1-10)");
				int INT3 = sc.nextInt();
				if((INT3<=10)&&(INT3<=FP)){
					FP=FP-INT3;
					System.out.println("You have "+FP+" left to spend");
					System.out.println("Charisma (1-10)");
					int INT4 = sc.nextInt();
					if((INT4<=10)&&(INT4<=FP)){
						System.out.println("You have "+FP+" left to spend");
						System.out.println("---------------------------------------------------------------------------------------------------------------");
						System.out.println("You have "+FP+" left.");
						System.out.println("You are "+NAME+" the "+TITLE+" OF CVHS");
						System.out.println("You're a "+CHAR+" with the following stats!");
						System.out.println("Strength - "+INT1);
						System.out.println("Dexterity - "+INT2);
						System.out.println("Intelligence - "+INT3);
						System.out.println("Charisma - "+INT4);
					}
					else if(INT4<=10){
						System.out.println("too much Charisma");
					}
					else if(INT4<=FP){
						System.out.println("Out Of/Not Enough Free Points");
					}
				}
				else if(INT3<=10){
					System.out.println("too much Intelligence");
				}
				else if(INT3<=FP){
					System.out.println("Out Of/Not Enough Free Points");
				}
			}
			else if(INT2<=10){
				System.out.println("too much Dexterity");
			}
			else if(INT2<=FP){
				System.out.println("Out Of/Not Enough Free Points");
			}
		}
		else if(INT1>10){
			System.out.println("too much strength.");
		}
	}
}
