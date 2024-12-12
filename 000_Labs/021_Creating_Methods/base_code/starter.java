/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Write a Sentence: ");
		String SENT1 = sc.nextLine();
		System.out.println("Write another Sentence: ");
		String SENT2 = sc.nextLine();
		System.out.println("                        ");
		System.out.println("This is using the Method!");
		toString(SENT1);
		toStringCombined(SENT1,SENT2);
	}
	public static void toString(String A){
		System.out.println(A);
	}
	
	public static void toStringCombined(String A, String B){
		System.out.println(A+" "+B);
	}
}
