import pkg.*;
import java.util.Scanner;

public class starter {

    public static boolean IFESCInt(int PerfectS) {
        int N1=1;
        int SM1=0;
        while(SM1<PerfectS){
            SM1+=N1;
            N1++;
        }
        return SM1 == PerfectS;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many values you want to print: ");
        int n = sc.nextInt();
        int Count=0;
        int N1=1;
        while(Count<n){
            int PerfectS=N1*N1;
            if(IFESCInt(PerfectS)){
                System.out.println(PerfectS);
                Count++;
            }
            N1++;
        }
    }
}