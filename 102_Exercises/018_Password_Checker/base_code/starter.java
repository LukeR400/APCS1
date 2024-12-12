import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
		int S1=0;
		int S2=0;
		int S3=0;
		int N1=0;
		for(int m = 0; m < passwords.length; m++){
		    String C1 = passwords[m];
		    boolean flag1=false;
		    boolean flag2=false;
		    if(C1.length()>=8){
		        S1=S1+1;
		        flag1=true;
		    }
		    if(C1.contains("!")||C1.contains("@")||C1.contains("#")||C1.contains("$")||C1.contains("%")||C1.contains("^")||C1.contains("&")||C1.contains("*")){
		        S2=S2+1;
		        flag2=true;
		    }
		    if(flag1&&flag2){
		        S3++;
		    }
		    else{
		    	N1=N1+1;
		    }
		}
		System.out.println("Strength 1: "+(S1-S3));
		System.out.println("Strength 2: "+(S2-S3));
		System.out.println("Strength 3: "+S3);
		System.out.println("No Strength: "+N1);
	}
}
