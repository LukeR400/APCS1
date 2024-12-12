/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		int NUM1=0;
		PooleDwarf test1 = new PooleDwarf(randName(),1);
		PooleDwarf test2 = new PooleDwarf(randName(),2);
		PooleDwarf test3 = new PooleDwarf(randName(),3);
		PooleDwarf test4 = new PooleDwarf(randName(),4);
		PooleDwarf test5 = new PooleDwarf(randName(),5);
		PooleDwarf test6 = new PooleDwarf(randName(),6);
		PooleDwarf test7 = new PooleDwarf(randName(),7);
		
		if((test1.isSameName(test2.getName()))==true){
			NUM1=NUM1+1;
		}
		if((test1.isSameName(test3.getName()))==true){
			NUM1=NUM1+1;
		}
		if((test1.isSameName(test4.getName()))==true){
			NUM1=NUM1+1;
		}
		if((test1.isSameName(test5.getName()))==true){
			NUM1=NUM1+1;
		}
		if((test1.isSameName(test6.getName()))==true){
			NUM1=NUM1+1;
		}
		if((test1.isSameName(test7.getName()))==true){
			NUM1=NUM1+1;
		}
		System.out.println(test1.getName()+" was the name with "+NUM1+" matches");
		
		
	}
}
