package Demo;
import java.util.*;
public class nextGreaterElementInArray {
	public static void main(String[] args) {
		int arr[] = {11,21,13,14};
		printNextGreatNumber(arr);
		
	}

	private static void printNextGreatNumber(int[] arr) {
		int i,j;
		
		for( i=0;i<arr.length;i++)
		{
			int next = -1;
			for(j=i+1;j<arr.length;j++)
			{
				
				if(arr[i] < arr[j])
				{
					next = arr[j];
					break;
				}
			}
			System.out.println(arr[i]+"the next greatest element is "+ next);
		}
		
	}

}
