/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter{
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		int Num1 = sc.nextInt();
		System.out.println("Here are the next 5 numbers!");
		sc.nextLine();
		System.out.println(Num1+", "+(Num1+1)+", "+(Num1+2)+", "+(Num1+3)+", "+(Num1+4)+", "+(Num1+5));
		System.out.println("Here are the next 5 multiples of "+Num1+"!");
		System.out.println(Num1+", "+(Num1*2)+", "+(Num1*3)+", "+(Num1*4)+", "+(Num1*5)+", "+(Num1*6));
		System.out.println("Here is "+Num1+" divded by 100!");
		System.out.println(Num1/100.0);
		System.out.println("Here is "+Num1+" divded by 10!");
		System.out.println(Num1/10.0);

	}
}
