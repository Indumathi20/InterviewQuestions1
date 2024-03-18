package Demo;
import java.util.*;
public class reverseElementsInArray {
	public static void main(String[] args) {
		int arr[] = {10,20,30,40};
		for(int i=0;i<arr.length/2;i++)
		{
			int temp = arr[i];
			arr[i] = arr[arr.length - i-1];
			arr[arr.length - i-1] = temp;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
