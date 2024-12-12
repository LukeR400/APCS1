/*
 *	Author:  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What number would you like to increase the power of?: ");
		int A = sc.nextInt();
		System.out.println("To what power would you like to raise this number?: ");
		int B = sc.nextInt();
		pow(A,B);
	}
	
	public static void pow(int A, int B){
        int count=0;
        int C = 1;
        while(count<C){
        B=B*A;
        count++;
        }
        System.out.println(B);
	}
}
