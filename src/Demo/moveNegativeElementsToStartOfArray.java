package Demo;
import java.util.*;
public class moveNegativeElementsToStartOfArray {
	public static void main(String[] args) {
		int arr[] = {-1,-20,30,40,50,-8};
		int newarr[] = new int[arr.length];
		rearrange(arr,newarr);
		System.out.println(Arrays.toString(newarr));
	}

	private static int[] rearrange(int[] arr,int[] newarr) {
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < 0)
			{
				newarr[j] = arr[i];
				j++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > 0)
			{
				newarr[j] = arr[i];
				j++;
			}
		}
		return newarr;
		
	}

}
