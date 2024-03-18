package Demo;
import java.util.*;
public class maxDifferenceBetweenElementInArray {
	public static void main(String[] args) {
		int arr[] = {10,20,2,90,40};
		int max = max(arr);
		int min = min(arr);
		System.out.println("max difference is "+ (max-min));
				
	
	}

	private static int min(int[] arr) {
		int min = arr[1];
		for(int i=0;i<arr.length;i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}
		
		return min;
	}

	private static int max(int[] arr) {
		int max= arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		
		return max;
	}

}
