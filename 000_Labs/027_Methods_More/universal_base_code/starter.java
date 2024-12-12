import pkg.*;
import java.util.Scanner;
import java.util.Random;
class starter{
    public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    Role test = new Role();
    System.out.println("Enter your Role");
    String User = sc.nextLine();
    test.setRole(User);
    System.out.println("Enter your Dexterity");
    int User2 = sc.nextInt();
    test.setDex(User2);
    System.out.println("Enter your Charisma");
    int User3= sc.nextInt();
    test.setCharisma(User3);
    System.out.println("Enter your intelegence");
    int User4 = sc.nextInt();
    test.setIntel(User4);
    System.out.println("Enter your Strength");
    int User5 = sc.nextInt();
    test.setStrength(User5);
    System.out.println(test.setAll(User,User2,User3,User4,User5));
    test.myToString();
    }
}