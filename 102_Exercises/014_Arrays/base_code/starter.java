/*
 *	Author:
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr1 = new int[1001];
		 int N1 = 0;
		 int N2 = 3;
		 while(N1<1001){
		 	arr1[N1]=N2;
		 	N1++;
		 	N2=N2+3;
		 }
		 System.out.println(arr1[1000]);
		 int [] arr2 = new int[1001];
		 int N3=0;
		 int N4=1000;
		 while(N3<1001){
		 	arr2[N3]=N4;
		 	N3++;
		 	N4--;
		 }
		 System.out.println(arr2[1000]);
	}
}
