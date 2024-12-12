/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) 
	{
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers to create a range for your random number");
		System.out.println("Please enter an integer: ");
		int INT1 = sc.nextInt();
		System.out.println("Please enter another integer (bigger than the first): ");
		int INT2 = sc.nextInt();
		System.out.println("Your range is "+INT1+" to " +INT2+".");
		INT2 = INT2+1;
		int RAND1 = (int)((Math.random()*(INT2-INT1))+INT1);
		int RAND2 = (int)((Math.random()*(INT2-INT1))+INT1);
		int RAND3 = (int)((Math.random()*(INT2-INT1))+INT1);
		int RAND4 = (int)((Math.random()*(INT2-INT1))+INT1);
		int RAND5 = (int)((Math.random()*(INT2-INT1))+INT1);
		System.out.println("Here are 5 numbers that generated in that range.");
		System.out.println(RAND1+", "+RAND2+", "+RAND3+", "+RAND4+", "+RAND5);
    }
}
