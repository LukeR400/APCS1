/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Cipher COOL = new Cipher();
		System.out.println("Enter code to encode/decode: ");
		String CIPHER2 = sc.nextLine();
		//System.out.println("Please enter Key: ");
		//int KEY = sc.nextInt();
		//System.out.println(COOL.keyedEncode(CIPHER2, KEY));
		System.out.println(COOL.encode(CIPHER2));
	}
}
