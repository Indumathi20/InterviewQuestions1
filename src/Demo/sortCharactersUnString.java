package Demo;
import java.util.*;
public class sortCharactersUnString {
	public static void main(String[] args) {
		//eg: java   aajv
		String str = "indumathi";
		
		char[] c = str.toCharArray();
		Arrays.sort(c);
		String sorted = new String(c);
//		The sorted character array c is converted back into a string
//		using the String class's constructor, and the resulting string 
//		is stored in the variable sorted.
		System.out.println(sorted);
	}

}
