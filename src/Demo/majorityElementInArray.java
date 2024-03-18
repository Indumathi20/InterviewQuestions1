package Demo;
import java.util.*;
public class majorityElementInArray {
	public static void main(String[] args) {
		//majority element appreas more than size/2
		//{10,10,10,20,40} size = 5,10 occurs 3 times 
		//size/2 = 2 < 3 so it is majority element
		Map<Integer,Integer> map = new HashMap<>();
		int arr[] = {10,20,10,10,40};
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
//			getOrDefault(key, defaultValue): This method retrieves the value associated
//			with the specified key from the map. If the key is not found in the map
//			it returns the specified defaultValue.
		}
		for(Map.Entry<Integer,Integer> entry: map.entrySet())
		{
			if(entry.getValue() > arr.length/2)
			{
				
				System.out.println("majority element is "+ entry.getKey());
			}
		}
		
	}

}
