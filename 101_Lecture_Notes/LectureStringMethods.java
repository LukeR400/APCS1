/* 
    Lecture note example - String Methods!
    length() - Returns the number of characters in a String
    substring(int) - Starts from the given int and returns to the end of the String
    substring(int, int) - Starts from the first int and returns until the last int (NOT including last int index)
    indexOf(String) - Returns the index of the first instance of a given String
    indexOf(String, int) - Returns the index of the first instance of a given String STARTING at the int index given
*/
import java.util.*;

class LectureStringMethods {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String SENT1=sc.nextLine();
        PrintREVRS(SENT1);
    }

    public static void PrintREVRS(String SENT1) {
        if (SENT1.isEmpty()) {
            return;
        }
        int Space1=SENT1.indexOf(" ");
        if(Space1==-1) {
            System.out.print(SENT1+" ");
            return;
        }
        String Word1=SENT1.substring(0, Space1);
        String REMSENT1=SENT1.substring(Space1+1);
        PrintREVRS(REMSENT1);
        System.out.print(Word1+" ");
    }
}