/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
        public static void main(String args[]) {
		while(true){
		int RAND1 = (int)((Math.random()*(1000))+1);
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 1000: "); 
		int INT1 = sc.nextInt();
		if(INT1==RAND1){
			System.out.println("Congratulations! you guessed the number correctly!");
			break;
		}
		else{
			System.out.println("Sorry, you guessed incorrectly.");
		}
		}
	}
}
