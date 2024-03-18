package Demo;
import java.util.*;
import java.util.Map.Entry;

public class stringCompression {
	public static void main(String[] args) {
//		You are given a string containing uppercase and lowercase letters. 
//		Write a function to perform basic string compression using the counts 
//		of repeated characters. If the "compressed" string is not smaller than 
//		the original string, your function should return the original string. 
//		You can assume that the string only contains letters (both uppercase and lowercase).
//		String original = "aabcccccaaa";
//		String compressed = compressString(original);
//		System.out.println(compressed);  // Output: "a2b1c5a3"
		
		String s = "saanndeeeep";
//		LinkedHashMap is a specific implementation of the Map interface in Java that extends HashMap.
//		It maintains the order of elements based on their insertion order, 
//		unlike HashMap, which does not guarantee any specific order of the elements. 
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(int i=0;i<s.length();i++)
		{
			if(map.get(s.charAt(i)) != null)
			{
				map.put(s.charAt(i),map.get(s.charAt(i))+1);
			}
			else
			{
				map.put(s.charAt(i), 1);
			}
		}
		StringBuilder sb = new StringBuilder();
//		entrySet() provides direct access to both the key and the value 
//		When you use entrySet(), you directly get a reference to the Map.
//		Entry object, which contains both the key and the value. 
//		This allows concise and direct access to both components of the entry 
//		without the need for separate method calls.
		for(Entry<Character, Integer> entry : map.entrySet())
		{
			sb.append(entry.getKey());
			sb.append(entry.getValue());
		}
		System.out.println(sb.toString());

	}

}
