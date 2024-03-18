package Demo;
import java.util.*;
public class longestSubstringWithoutRepetition {
public static void main(String[] args) {
//	"abcdab" --> substrings abcd,bcda,cdab
//	among them first logest is abcd
	String str = "abcdab";
	System.out.println(longest(str));
	
}

private static String longest(String str) {
	HashSet<Character> hs = new HashSet<>();
	String longestOverall = "";
	String longestTillnow = "";
	for(int i=0;i<str.length();i++)
	{
		char c = str.charAt(i);
		if(hs.contains(c))
		{
			longestTillnow = "";
			hs.clear();
		}
		
		hs.add(c);
		longestTillnow += c;
		
		if(longestTillnow.length() > longestOverall.length())
		{
			longestOverall = longestTillnow;
		}
		
			
	}
	
	return longestOverall;
}
}
