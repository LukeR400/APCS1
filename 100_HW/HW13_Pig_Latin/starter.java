import java.util.*;

class starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentence to be translated to Pig Latin");
        String UserSent = sc.nextLine();
        int startIndex=0;
        while(startIndex<UserSent.length()){
            int endIndex=UserSent.indexOf(" ", startIndex);
            if(endIndex==-1) {
                endIndex=UserSent.length();
            }
            String word=UserSent.substring(startIndex, endIndex);
            System.out.print(PigLatin(word)+" ");
            startIndex=endIndex+1;
        }
    }
    
    public static String PigLatin(String word) {
        String RES="";
        String SentLTR=word.substring(0, 1);
        String SentLTR2="";
        if(word.length()>1) {
            SentLTR2 = word.substring(1, 2);
        }
        if((!(SentLTR.equals("a"))&&!(SentLTR.equals("e"))&&!(SentLTR.equals("i"))&&!(SentLTR.equals("o"))&&!(SentLTR.equals("u"))&&!(SentLTR.equals("A"))&&!(SentLTR.equals("E"))&&!(SentLTR.equals("I"))&&!(SentLTR.equals("O"))&&!(SentLTR.equals("U")))&&((SentLTR2.equals("a"))||(SentLTR2.equals("e"))||(SentLTR2.equals("i"))||(SentLTR2.equals("o"))||(SentLTR2.equals("u"))||(SentLTR2.equals("A"))||(SentLTR2.equals("E"))||(SentLTR2.equals("I"))||(SentLTR2.equals("O"))||(SentLTR2.equals("U")))){
            RES=RES+word.substring(1)+"-"+SentLTR+"ay";
        }
        else if((!(SentLTR.equals("a"))&&!(SentLTR.equals("e"))&&!(SentLTR.equals("i"))&&!(SentLTR.equals("o"))&&!(SentLTR.equals("u"))&&!(SentLTR.equals("A"))&&!(SentLTR.equals("E"))&&!(SentLTR.equals("I"))&&!(SentLTR.equals("O"))&&!(SentLTR.equals("U")))&&(!(SentLTR2.equals("a"))&&!(SentLTR2.equals("e"))&&!(SentLTR2.equals("i"))&&!(SentLTR2.equals("o"))&&!(SentLTR2.equals("u"))&&!(SentLTR2.equals("A"))&&!(SentLTR2.equals("E"))&&!(SentLTR2.equals("I"))&&!(SentLTR2.equals("O"))&&!(SentLTR2.equals("U")))){
            RES=RES+word.substring(2)+"-"+SentLTR+SentLTR2+"ay";
        }
        else if((SentLTR.equals("a"))||(SentLTR.equals("e"))||(SentLTR.equals("i"))||(SentLTR.equals("o"))||(SentLTR.equals("u"))||(SentLTR.equals("A"))||(SentLTR.equals("E"))||(SentLTR.equals("I"))||(SentLTR.equals("O"))||(SentLTR.equals("U"))){
            RES=RES+word+"-way";
        }
        return RES;
    }
}

