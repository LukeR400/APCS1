/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class Spiderman {
	String UserCHAR;
	String Villain;
	int AGE;
	public Spiderman() {
		UserCHAR="Miles Morales";
		AGE=13;
		Villain="King Pin";
	}
	public Spiderman(String CHAR1){
		UserCHAR=CHAR1;
		Villain="None";
		AGE=0;
	}
	public Spiderman(String CHAR1, int AGE2){
		UserCHAR=CHAR1;
		Villain="None";
		AGE=AGE2;
	}
	public Spiderman(String CHAR1, String VILLAIN2){
		UserCHAR=CHAR1;
		Villain=VILLAIN2;
		AGE=0;
	}
	public Spiderman(String CHAR1, String VILLAIN2, int AGE2){
		UserCHAR=CHAR1;
		Villain=VILLAIN2;
		AGE=AGE2;
	}
	public void print(){
		System.out.println("");
		System.out.println("--------------------------------");
		System.out.println("The actor "+UserCHAR+" is "+AGE+" years old.");
		System.out.println("They play Spiderman who's villain is "+Villain+".");
		System.out.println("--------------------------------");
	}
	public int setAge(int AGE3){
		AGE=AGE3;
		return AGE;
	}
	public String setVillain(String VILLAIN2){
		Villain=VILLAIN2;
		return Villain;
	}
}
