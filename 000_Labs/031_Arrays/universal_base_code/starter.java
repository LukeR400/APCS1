/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
		int [] arr1 = new int[10];
		int N1=0;
		int N2=9;
		while(N1<arr1.length){
			arr1[N1]=N2;
			N1++;
			N2--;
		}
		System.out.println(arr1[0]);
		
	}
}
