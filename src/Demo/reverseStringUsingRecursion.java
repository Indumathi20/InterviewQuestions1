package Demo;
import java.util.*;
public class reverseStringUsingRecursion {
	public static void main(String[] args) {
		String str = "indu";
		String rev = recursiveString(str);
		System.out.println(rev);
		
//		step 1 : ndu + i;
//		stepp 2 : du + n + i;
//		step 3 : u + d + n + i;
	}
	private static String recursiveString(String s)
	{
		if(s == null || s.length() <= 1)
			return s;
		
		return recursiveString(s.substring(1))+s.charAt(0);
		//"unhappy.substring(2) returns "happy"
	}

}
