package Demo;
import java.util.*;
//remove duplicate from string
//eg java otp: jav
public class RemoveDuplicateFromString {
	public static void main(String[] args) {
		String str = "sandeep";
		System.out.println(removeDuplicate(str));
	}
	
	public static String removeDuplicate(String str){
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

		return sf.toString();
	}

}
