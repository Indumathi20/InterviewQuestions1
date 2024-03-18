package Demo;
import java.util.*;
public class sortHashMapKeys {
	public static void main(String[] args) {
//		1 create hashmap
//		2 add elements to hashmap
//		3 create treemap by passing hashmap object created in step1
//		4 print the elements of treemap
		Map<String,String> map = new HashMap<>();
		map.put("apple", "apple");
		map.put("pine", "pinee");
		map.put("owl", "owl");
		map.put("banana", "banana");
		
		for(Map.Entry<String, String> entry : map.entrySet())
		{
			System.out.print(entry.getKey()+" ");
		}
		
		System.out.println();
		Map<String,String> tmap = new TreeMap<>(map);
//		TreeMap stores its elements in a sorted order 
//		based on the natural ordering of keys or a custom comparator provided during creation. 
		for(Map.Entry<String, String> entry : tmap.entrySet())
		{
			System.out.print(entry.getKey()+" ");
		}
		
		
		
	}

}
