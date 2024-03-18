package Demo;
import java.util.*;
public class twoStringRotation {
	public static void main(String[] args) {
//		Two strings are considered rotations of each other
//		if one string can be obtained by rotating the other string by 
//		some number of positions. For example, the strings "abcde" 
//		and "eabcd" are rotations of each other because you can obtain 
//		one from the other by rotating the characters.
//
//		The condition to check if two strings are rotations of each other is as follows:
//
//		1 Both strings must have the same length.
//		2 Concatenate one of the strings with itself.
//		3 Check if the other string is a substring of the concatenated string.
		String str1 = "abcd";
		String rotatedstring = "bcda";
		System.out.println(isRotatable(str1,rotatedstring));
		
	}

	private static boolean isRotatable(String str1, String rotatedstring) {
		
		if(str1 == null || rotatedstring == null)
		{
			return false;
		}
		else if(str1.length() != rotatedstring.length())
		{
			return false;
		}
		else
		{
			String concatinated = str1+str1;
			if(!concatinated.contains(str1))
			{
				return false;
			}
		}
		
		
		return true;
	}

}
