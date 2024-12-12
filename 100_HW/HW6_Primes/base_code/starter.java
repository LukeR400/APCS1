/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number and we'll print out every prime until that number: ");
		int PRNM1 = sc.nextInt();
		System.out.println("The prime numbers that are lower than the integer you entered are: ");
		printPrimes(PRNM1);
	}
	public static boolean checkPrime(int PRNM1){
		int PRNM2=PRNM1-1;
		boolean PRNMIF1 = false;
		while(PRNM2>1){
			if(PRNM1%PRNM2==0){
				PRNMIF1=false;
				break;
			}
			PRNMIF1=true;
			PRNM2--;
		}
		return PRNMIF1;
	}
	public static void printPrimes(int PRNM2){
		boolean PRNMIF2;
		while(PRNM2>=0){
			PRNMIF2 = checkPrime(PRNM2);
			if(PRNMIF2==true){
				System.out.println(PRNM2);
			}
			else if(PRNM2==2){
				System.out.println(PRNM2);
			}
			PRNM2--;
		}
		return;
	}
}
