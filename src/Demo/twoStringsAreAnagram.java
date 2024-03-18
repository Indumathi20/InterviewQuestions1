package Demo;
import java.util.*;

public class twoStringsAreAnagram {
	public static void main(String[] args) {
		//if tow strings contain same characters but in different order
//		1 take two strings as input
//		2 convert two strings to character array
//		3 sort two string arrays using arrays.sort() method
//		4 compare two strings if they are equal they are anagrams otherwise they are not
		String str = "javana";
		String str1 = "avajna";
		char c[] = str.toCharArray();
		char c1[] = str1.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		if(Arrays.equals(c, c1)) {
			System.out.println("it is anagram");
		}else
		{
			System.out.println("it is not anagram");
		}
	}

}
