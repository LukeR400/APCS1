import java.util.*;
class Starter {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();
        
        // Initialize index to start at the beginning of the sentence
        int startIndex = 0;
        // Process each word in the sentence
        while (startIndex < sentence.length()) {
            // Find the position of the next space or the end of the sentence
            int endIndex = sentence.indexOf(" ", startIndex);
            
            // If no space is found, it means we've reached the last word
            if (endIndex == -1) {
                endIndex = sentence.length();
            }
            
            // Extract the current word
            String word = sentence.substring(startIndex, endIndex);
            
            // Print the word on a new line
            System.out.println(word);
            
            // Move the startIndex to the next word (after the space)
            startIndex = endIndex + 1;
        }
    }
}