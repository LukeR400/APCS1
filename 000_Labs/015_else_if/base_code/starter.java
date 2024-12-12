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
		int RAND1 = (int)((Math.random()*(1000))+1);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 1000: "); 
		int INT1 = sc.nextInt();
		if(INT1<RAND1){
			System.out.println("The number you entered is lower than the random number");
		}
		else if(INT1>RAND1){
			System.out.println("The number you entered is higher than the random number");
		}
		else{
			System.out.println("Congratulations! you guessed correctly!");
		}
	}
}