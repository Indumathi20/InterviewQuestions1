package Demo;
import java.util.*;

public class removeDuplicatesFromStringAndPrint {
	public static void main(String[] args) {
		String str = "sandiippeee";
		removedup(str);
	}

	private static void removedup(String str) {
		Set<Character> set = new HashSet<>();
		StringBuffer sf = new StringBuffer();
		for(int i=0;i<str.length();i++)
		{
			Character c = str.charAt(i);
			if(!set.contains(c))
			{
				set.add(c);
				sf.append(c);
			}
			
		}
		System.out.println(sf.toString());
		
		
	}

}
