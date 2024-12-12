/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Dog test = new Dog();
		System.out.println("Dog name?");
		String USERname = sc.nextLine();
		test.setName(USERname);
		System.out.println("What age should "+USERname+" be? ");
		int USERage = sc.nextInt();
		test.setAge(USERage);
		String USERbreed1 = "Dog";
		test.setBreed(USERbreed1);
		test.getAge();
		test.getBreed();
		test.FINAL();
		test.isSleeping();
		if(test.isSleeping()==true){
			System.out.println(USERname+" is asleep");
			test.isSleeping();
			if(test.isSleeping()==true){
				System.out.println(test.getName()+" is also asleep");
			}
			else if(test.isSleeping()==false){
				System.out.println(test.getName()+" is awake!");
			}
		}
		else if(test.isSleeping()==false){
			System.out.println(USERname+" is awake!");
			test.bark(USERname);
			test.isSleeping();
			if(test.isSleeping()==true){
				System.out.println(USERname+" woke "+test.getName()+" up!");
				test.bark(test.getName());
			}
			else if(test.isSleeping()==false){
				System.out.println(test.getName()+" is also awake!");
				test.bark(test.getName());
			}
		}
		
	}
}
