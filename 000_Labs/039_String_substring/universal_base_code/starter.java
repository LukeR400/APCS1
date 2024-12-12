/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Word to be Segmented: ");
		String UserWord = sc.nextLine();
		for(int i=0; i<UserWord.length(); i++){
			System.out.println(i+" "+UserWord.substring(i,i+1));
		}
		
		
	}
}
