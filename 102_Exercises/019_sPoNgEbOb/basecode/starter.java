/*
	Author:
	Date:
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Sentence to be translated to SpongeCase");
		String UserSent = sc.nextLine();
		while(true){
			if(UserSent.indexOf(" ")==-1){
				System.out.println(spongeCase(UserSent)+" ");
				break;
			}
			int SPC = UserSent.indexOf(" ");
			String Word = UserSent.substring(0, SPC);
			System.out.print(spongeCase(Word)+" ");
			UserSent=UserSent.substring(SPC+1);
		}
	}
	
	public static String spongeCase(String UserSent){
		String RES = "";
		for(int C=0; C<UserSent.length(); C++){
			String SentLTR = UserSent.substring(C, C+1);
			if(C%2==0){
				SentLTR = SentLTR.toLowerCase();
			}
			else{
				SentLTR = SentLTR.toUpperCase();
			}
			RES=RES+SentLTR;
		}
		return RES;
	}
}
