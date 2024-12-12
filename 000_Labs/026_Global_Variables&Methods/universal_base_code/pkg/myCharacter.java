package pkg;
import java.util.Scanner;
import java.util.Random;


public class myCharacter {
    String role;
    public  myCharacter(){
    role = " No Role";
    }
    public  myCharacter(String userRole){
    role = userRole;
    }
    public String GiveRole(){
    return role;
    }
    public void myToString(){
        System.out.println("You are a "+role);
        System.out.println("Your strength trait is 0");
        System.out.println("Your dexterity trait is 0");
        System.out.println("Your intelligence trait is 0");
        System.out.println("Your constitution trait is 0");
        System.out.println("Your charisma trait is 0");
    }
}