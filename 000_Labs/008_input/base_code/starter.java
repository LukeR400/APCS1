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
		System.out.println("Please enter your name");
		String name = sc.nextLine();
		System.out.println("Your name is "+name);
		System.out.println("Please enter your Age");
		String Age = sc.nextLine();
		System.out.println("You are "+Age+" years old");
		System.out.println("Please enter your Birthday Month");
		String BM = sc.nextLine();
		System.out.println("You were born in "+BM);
		System.out.println("What is your Birthday Day?");
		String BD = sc.nextLine();
		System.out.println("your Birthday Day is "+BD);
		System.out.println("Please enter your Birth year");
		String BY = sc.nextLine();
		System.out.println("You were born in the year "+BY);
		System.out.println("A buck fifty is $1.50");
	}
}
