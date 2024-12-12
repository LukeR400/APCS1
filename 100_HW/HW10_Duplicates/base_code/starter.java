/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		int [] arr;
		int T1 = (int)(1+(Math.random() * 10));
		int x = (int)(1+(Math.random() * 10));
		arr = new int[20];
		for(int i = 0; i< arr.length; i++){
			x = (int)(1+(Math.random() * 10));
			arr[i] = x;
		}
		System.out.println("----------------------------------------------------");
		System.out.println("These are the 20 numbers");
		for(int i=0; i<arr.length; i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println("");
		System.out.println("----------------------------------------------------");
		System.out.println("The random number to look for is "+T1);
		int NUM1 = 0;
		int H=0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]==T1){
				H=H+1;
				System.out.println("Duplicate found at index "+i);
			}
		}
		System.out.println("Total number of duplicates for "+T1+" is "+H);
		System.out.println("----------------------------------------------------");
		System.out.println("Looking for two in a row: ");
		int IF1=0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]==T1){
				H=H+1;
				if(i<19 && arr[i+1]==T1){
					System.out.println("Two in a row found at indexes "+i+" and "+(i+1)+". The number is "+T1);
					IF1=IF1+1;
				}
			}
		}
		if(IF1==0){
			System.out.println("No two in a row duplicates found");
		}
	}
}
