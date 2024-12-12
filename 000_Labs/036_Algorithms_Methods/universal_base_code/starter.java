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
		int [] arr;
		arr = new int[100];
		int ARL=arr.length;
		int X = (int)(1+(Math.random() * 100));
		for(int i = 0; i< arr.length; i++){
			X = (int)(1+(Math.random() * 100));
			arr[i] = X;
		}


		
	}
	public static void toStringArray(int ARL){
		int ARL2=ARL;
		System.out.println("The array has "+ARL2+" Values");
	}
	public static void getArrayAverage()
}
