/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;
class LectureInput{
    public static void main(String args[]) {
        // Your Code Goes here!
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Hello "+name+"!");
        System.out.println("Please enter a number: ");
        int bob = sc.nextInt();
        sc.nextLine();
        System.out.println("Please enter another number: ");
        int SomethingElse = sc.nextInt();
        sc.nextLine();
        System.out.println("The sum of these numbers is: " + (bob+SomethingElse));
        System.out.println("whats your favorite food? ");
        String food = sc.nextLine();
        
	}
}