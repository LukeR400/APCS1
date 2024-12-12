/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		// the string "I love to learn coding remotely." will appear in
		// the command window when you compile and run this program.
		Scanner sc = new Scanner(System.in);
		System.out.println("What day is it? 1=Monday,2=Tuesday,3=Wednesday,4=Thursday,5=Friday,6=Saturday,7=Sunday");
		int Day = sc.nextInt();
		if(Day==1){
			System.out.println("BEEP BEEP BEEP WAKE UP ITS 7AM ON A WEEKDAY");
		}
		else if(Day==2){
			System.out.println("BEEP BEEP BEEP WAKE UP ITS 7AM ON A WEEKDAY");
		}
		else if(Day==3){
			System.out.println("BEEP BEEP BEEP WAKE UP ITS 7AM ON A WEEKDAY");
		}
		else if(Day==4){
			System.out.println("BEEP BEEP BEEP WAKE UP ITS 7AM ON A WEEKDAY");
		}
		else if(Day==5){
			System.out.println("BEEP BEEP BEEP WAKE UP ITS 7AM ON A WEEKDAY");
		}
		else if(Day==6){
			System.out.println("BEEP BEEP BEEP WAKE UP ITS 10AM ON THE WEEKEND");
		}
		else if(Day==7){
			System.out.println("BEEP BEEP BEEP WAKE UP ITS 10AM ON THE WEEKEND");
		}
		else{
			System.out.println("INCORRECT INPUT");
		}
	}
}
