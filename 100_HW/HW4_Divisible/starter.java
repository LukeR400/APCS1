/*
 *	Author:
 *  Date:
 * 	Collaborator: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int INT1 = sc.nextInt();
		System.out.println("Enter another Integer: ");
		int INT2 = sc.nextInt();
		if(INT1%2==0){
			System.out.println("INT1 is an Even Integer");
		}
		else if(INT1%2==1){
			System.out.println("INT1 is an Odd Integer");
		}
		if(INT2%2==0){
			System.out.println("INT2 is an Even Integer");
		}
		else if(INT2%2==1){
			System.out.println("INT2 is an Odd Integer");
		}
		if((INT1%3==0)&&(INT1%4==0)&&(INT1%5==0)){
			System.out.println("INT1 is divisible by 3,4 and 5");
		}
		if((INT1%3==1)||(INT1%4==1)||(INT1%5==1)||((INT1==3)||(INT1==4)||(INT1==5))){
			System.out.println("INT1 is not divisible by the following integers: 3 4 5");
		}
		if((INT2%3==0)&&(INT2%4==0)&&(INT2%5==0)){
			System.out.println("INT2 is divisible by 3,4 and 5");
		}
		if((INT2%3==1)||(INT2%4==1)||(INT2%5==1)||((INT2==3)||(INT2==4)||(INT2==5))){
			System.out.println("INT2 is not divisible by the following integers: 3 4 5");
		}
	}
}
