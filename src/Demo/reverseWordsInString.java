package Demo;
import java.util.*;

public class reverseWordsInString {
	public static void main(String[] args) {
		String str = "Hello world";
		reverseWords(str);
	}

	private static void reverseWords(String str) {
		Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) != ' ')
			{
				st.push(str.charAt(i));
			}
			else
			{
				while(st.empty() == false)
				{
					System.out.println(st.pop());
				}
			}
		}
		System.out.println(" ");
		while(st.empty() == false)
		{
			System.out.println(st.pop());
		}
		
	}

}
