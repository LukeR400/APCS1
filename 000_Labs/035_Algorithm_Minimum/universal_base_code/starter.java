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
		int x = (int)(1+(Math.random() * 100));
		arr = new int[151];
			for(int i = 0; i< arr.length; i++){
			x = (int)(1+(Math.random() * 100));
			arr[i] = x;
		}
		int min = Integer.MAX_VALUE;
		for(int i = 0; i< arr.length; i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println(min);
		int max = 0;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println(max);
		int average;
		int temp= 0;
		for(int i = 0; i< arr.length; i++){
			temp = temp+arr[i];
		}
		average = temp/ arr.length;
		System.out.println(average);
		System.out.println("150");
	}
}
