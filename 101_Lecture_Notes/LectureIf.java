/* 
    Lecture note example - If Statements
*/
import java.util.Scanner;
class LectureIf{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Your Code Goes here!
        System.out.println("Youre a student getting ready for school");
        System.out.println("1. Put on your backpack");
        System.out.println("2. Choose your outfit");
        System.out.println("3. Eat a healthy breakfast");
        int answer1 = sc.nextInt();
        if(answer1==1){
            System.out.println("You put on your backpack!");
        }
        else if(answer1==2){
            System.out.println("You choose some good drip to wear.");
        }
        else if(answer1==3){
            System.out.println("You eat some cereal and a banana.");
        }
        else{
            System.out.println("You didnt type a correct answer!");
        }
        System.out.println("Choose how you want to get to school");
        System.out.println("1. Bike to school");
        System.out.println("2. Make your parents drive you there");
        System.out.println("3. Take the bus");
        int answer2 = sc.nextInt();
        if(answer2==1){
            System.out.println("You choose to drive your bike to school, it takes 25 minutes");
        }
        else if(answer2==2){
            System.out.println("Your parents drive you to school, it takes 10 minutes");
        }
        else if(answer2==3){
            System.out.println("You take the bus to school, it takes 35 minutes");
        }
        else{
            System.out.println("Nobody Cares, answer the question correctly");
        }
	}
}