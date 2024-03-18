package Demo;
import java.util.*;

public class countNoOfVowelsInString {
    public static void main(String[] args) {
        String str = "indumathi";
        String vowels = "aeiouAEIOU"; // Remove the square brackets from here

        int vowelCount = 0; // Counter to keep track of the number of vowels

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (vowels.indexOf(c) != -1) { // Check if the character is a vowel
            	//The indexOf() method checks if the character 'i' exists in the vowels string.
            	//is present in the vowels string, indexOf() returns an index value greater than or equal to 0.
                vowelCount++; // Increment the counter
            }
        }

        System.out.println("Number of vowels in the string: " + vowelCount);
    }
}
