package Demo;
import java.util.*;

public class characterAndWordCount {
	public static void main(String[] args) {
		//a java program to find number of words in a sentence and the corresponding character count
		String str = "Hello World this is me";
		count(str);
	}

	private static void count(String str) {
		char ch[] = str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			String s = "";
			while(i < ch.length && ch[i] != ' ')
			{
				s = s + ch[i];
				i++;
			}
			if(s.length() > 0)
			{
				System.out.println(s + "->" + s.length());
			}
		}
		
	}

}
