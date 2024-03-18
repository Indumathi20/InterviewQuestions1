package Demo;
import java.util.*;

public class duplicateCharacterWithNoOfOccurance {
    public static void main(String[] args) {
        String str = "sandeeppppii";
        displayDuplicates(str);
    }

    private static void displayDuplicates(String str) {
        Map<Character,Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();
        for(char c: chars) {
            if(!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        
        // Printing the result
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Character '" + entry.getKey() + "' occurs " + entry.getValue() + " times.");
            }
        }
    }
}
