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
}