package Demo;
import java.util.*;
public class firstLetterOfEachWord {
	public static void main(String[] args) {
		String str = "Learn with indu"; //otp : lwi
		splitWords(str);
	}

	private static void splitWords(String str) {
		String words[] = str.split(" ");
		for(int i=0;i<words.length;i++)
		{
			String  s = words[i];
			System.out.print(s.charAt(0));
		}
	}

}
