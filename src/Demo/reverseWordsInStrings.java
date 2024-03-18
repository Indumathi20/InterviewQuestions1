package Demo;
import java.util.*;

public class reverseWordsInStrings {
    // Method to reverse the words in a string
    public static void main(String[] args) {
        // Input string
        String str = "welcome to java world";
        
        // Split the input string into words
        String[] words = str.split(" ");
        
        // Create a stack to store the words in reverse order
        Stack<String> stack = new Stack<>();
        
        // Push each word onto the stack
        for (String word : words) {
            stack.push(word);
        }
        
        // Pop and print words from the stack to reverse the order
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");
        }
    }
}
