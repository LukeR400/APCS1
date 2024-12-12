/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to check if they are equal");
		System.out.println("Enter a number: ");
		int INT1 = sc.nextInt();
		System.out.println("Enter a 2nd number: ");
		int INT2 = sc.nextInt();
		if (INT1==INT2){
			System.out.println("The numbers are equal");
		}
		else if (INT1!=INT2){
			System.out.println("the numbers are different");
		}
		else{
			System.out.println("Incorrect Input");
		}
	}
}
