/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter a number: ");
		int INT1 = sc.nextInt();
		System.out.println("Enter amount of times should it print: ");
		int INT2 = sc.nextInt();
		while(count<INT2){
			System.out.println(INT1);
			count=count+1;
		}
	}
}
