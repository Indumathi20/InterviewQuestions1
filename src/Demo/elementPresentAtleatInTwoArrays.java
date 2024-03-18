package Demo;
import java.util.*;
public class elementPresentAtleatInTwoArrays {
	public static void main(String[] args) {
		Integer[] arr = {1,2,3,9,8,7};
		Integer[] arr1 = {4,1,2,10,15};
		Integer[] arr2 = {5,1,2,4,10};
		 // Create a HashSet to store unique elements
		HashSet<Integer> h = new HashSet<>();
		// Convert arrays to lists
		List<Integer> l1 = Arrays.asList(arr);
		List<Integer> l2 = Arrays.asList(arr1);
		List<Integer> l3 = Arrays.asList(arr2);
		// Add all elements from all lists to the HashSet to remove duplicates
		h.addAll(l1);
		h.addAll(l2);
		h.addAll(l3);
		 // Create a list to store elements present in at least two arrays
		List<Integer> finalli = new ArrayList<>();
		
		for (Integer numb : h) {
			if((l1.contains(numb) && (l2.contains(numb))) || (l2.contains(numb) && (l3.contains(numb))) 
					|| (l3.contains(numb) && (l1.contains(numb))))
			{
				finalli.add(numb);
			}
			
		}
		System.out.println(finalli);
		
		
		
	}

}
