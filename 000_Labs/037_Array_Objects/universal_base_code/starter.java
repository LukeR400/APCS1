/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		Wizard[] x=new Wizard[100];
		Warrior[] y=new Warrior[100];
		for(int i = 0; i< 100; i++){
			x[i] = new Wizard();
		}
		for(int i = 0; i< 100; i++){
			y[i] = new Warrior();
		}
		int WIZRAL=100;
		int WARAL=100;
		int IN1=0;
		int IN2=0;
		int IN3=0;
		while(WIZRAL>0&&WARAL>0&&IN1<100&&IN2<100){
			x[IN1].attack(y[IN2]);
			if(y[IN2].isDead()==true){
				WARAL=WARAL-1;
				IN2++;
			}
			if(WARAL>0){
			y[IN2].attack(x[IN1]);
			if(x[IN1].isDead()==true){
				WIZRAL=WIZRAL-1;
				IN1++;
			}
			}
			IN3++;
		}
		if(WIZRAL>WARAL){
			System.out.println("Wizards won with "+WIZRAL+" left in their army");
		}
		else if(WARAL>WIZRAL){
			System.out.println("Warriors won with "+WARAL+" left in their army");
		}
	}
}
