package Demo;
import java.util.*;
public class moveAllZerosToEndOfArray {
	public static void main(String[] args) {
		int arr[] = {10,0,0,20,40,50,60};
		int newarr[] = new int[arr.length];
		rearrange(arr,newarr);
		System.out.println(Arrays.toString(newarr));
		
	}

	private static int[] rearrange(int[] arr, int[] newarr) {
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				newarr[j] = arr[i];
				j++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] == 0)
			{
				newarr[j] = arr[i];
				j++;
			}
		}
		return newarr;
		
	}

}
