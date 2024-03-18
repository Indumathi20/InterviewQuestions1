package Demo;
import java.util.*;
import java.util.Map.Entry;
public class firstNonRepeatedCharacterFromString {
public static void main(String[] args) {
	//Iteration order is the order in which keys were inserted.
	char c = getFirstrepeated("aabbdide");
	System.out.println("first repeated char in string is "+c);
	
}

private static char getFirstrepeated(String str) {
	Map<Character,Integer> map = new LinkedHashMap<>();
	for(char c: str.toCharArray() )
	{
		map.put(c,map.containsKey(c) ? map.get(c) + 1 : 1);
		
	}
	for(Entry<Character,Integer> entry : map.entrySet())
	{
		if(entry.getValue() == 1)
		{
			return entry.getKey();
		}
	}
	throw new RuntimeException("didnt find any non repeated character");
	
}
}
