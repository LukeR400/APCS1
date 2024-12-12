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
		System.out.println("Please enter an integer: ");
		int INT1 = sc.nextInt();
		System.out.println("Please enter another integer: ");
		int INT2 = sc.nextInt();
		System.out.println("Please enter another integer again: ");
		int INT3 = sc.nextInt();
		if((INT1>INT2)&&(INT1>INT3)){
			System.out.println("INT1, the first integer you entered, was the greatest one.");
		}
		else if((INT2>INT1)&&(INT2>INT3)){
			System.out.println("INT2, the second integer you entered, was the greatest one.");
		}
		else if((INT3>INT1)&&(INT3>INT2)){
			System.out.println("INT3, the third integer you entered, was the greatest one.");
		}
		if((INT1<INT2)&&(INT1<INT3)){
			System.out.println("INT1, the first integer you entered, was the smallest one.");
		}
		else if((INT2<INT1)&&(INT2<INT3)){
			System.out.println("INT2, the second integer you entered, was the smallest one.");
		}
		else if((INT3<INT1)&&(INT3<INT2)){
			System.out.println("INT3, the third integer you entered, was the smallest one.");
		}
	}
}
