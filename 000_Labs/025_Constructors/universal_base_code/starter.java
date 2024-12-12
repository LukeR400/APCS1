/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        myCharacter test = new myCharacter();
        System.out.println(test.GiveRole());
        System.out.println("Your strength trait is 0");
        System.out.println("Your dexterity trait is 0");
        System.out.println("Your intelligence trait is 0");
        System.out.println("Your constitution trait is 0");
        System.out.println("Your charisma trait is 0");
        System.out.println("==============================");
        System.out.println("Please pick a class:");
        String classV1 = sc.nextLine();
            if(classV1.equals("Wizard")||classV1.equals("wizard")||classV1.equals("Rogue")||classV1.equals("rogue")||classV1.equals("Warrior")||classV1.equals("warrior") ){
                myCharacter roletest = new myCharacter(classV1);
                System.out.println("You are a "+roletest.GiveRole());
                System.out.println("Your strength trait is 0");
                System.out.println("Your dexterity trait is 0");
                System.out.println("Your intelligence trait is 0");
                System.out.println("Your constitution trait is 0");
                System.out.println("Your charisma trait is 0");
            }else{
                myCharacter roletest = new myCharacter();
                System.out.println("You are a "+roletest.GiveRole());
                System.out.println("Your strength trait is 0");
                System.out.println("Your dexterity trait is 0");
                System.out.println("Your intelligence trait is 0");
                System.out.println("Your constitution trait is 0");
                System.out.println("Your charisma trait is 0");
            }
        }
    }
