package Demo;
import java.util.*;
public class stringPanagramOrNot {
	public static void main(String[] args) {
		//panagram-the string which contains all alphabet characters
		String s = "The quick brown fox jumps over the lazy dog";
		System.out.println(isPanagram(s.toLowerCase()));
		
	}

	private static boolean isPanagram(String s) {
		
		if(s.length()< 26)
			return false;
		else
		{
			for(char ch = 'a';ch <= 'z';ch++)
			{
				if(s.indexOf(ch) < 0)//if index is less than 0 then the letter is not found
					return false;
				 //The indexOf() method in Java returns the position of the first occurrence of a 
//				character or a substring within a given string. If the character or substring 
//				is not found, the method returns -1.
			}
		}
		return true;
	}

}
