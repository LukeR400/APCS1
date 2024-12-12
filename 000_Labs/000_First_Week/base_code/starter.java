
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
			String SentLTR2 = UserSent.substring(C+1, C+2);
			if((SentLTR!="a"||SentLTR!="e"||SentLTR!="i"||SentLTR!="o"||SentLTR!="u"||SentLTR!="A"||SentLTR!="E"||SentLTR!="I"||SentLTR!="O"||SentLTR!="U")&&(SentLTR2=="a"||SentLTR=="e"||SentLTR=="i"||SentLTR=="o"||SentLTR=="u"||SentLTR=="A"||SentLTR=="E"||SentLTR=="I"||SentLTR=="O"||SentLTR=="U")){
				SentLTR=
			}
			else if(SentLTR=="a"||SentLTR=="e"||SentLTR=="i"||SentLTR=="o"||SentLTR=="u"||SentLTR=="A"||SentLTR=="E"||SentLTR=="I"||SentLTR=="O"||SentLTR=="U"){
				SENTLTR=SENTLTR+"-way";
			}
			else{
				SentLTR = SentLTR.toUpperCase();
			}
			RES=RES+SentLTR;
		}
		return RES;
	}
}