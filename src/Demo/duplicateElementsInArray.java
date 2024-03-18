package Demo;
import java.util.*;

public class duplicateElementsInArray {
	public static void main(String[] args) {
		//brute force approach - comparing each element with others
		//time complexity: O(n2) spacecomplexity : O(1)
//		2nd approach is extra space approach
//		time complexity: O(n) space complexity:O(n)
//		set = {};
		int arr[] = {10,20,20,40,50};
		bruteforece(arr);
		extraMemory(arr);
		
	}

	private static void extraMemory(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++)
		{
			if(set.contains(arr[i]))
			{
				System.out.println("duplicate element is "+arr[i]);
			}else
			{
				set.add(arr[i]);
			}
		}
		
		
	}

	private static void bruteforece(int[] arr) {
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println(arr[i]+" is the duplicate element");
				}
			}
		}
		
	}

}
