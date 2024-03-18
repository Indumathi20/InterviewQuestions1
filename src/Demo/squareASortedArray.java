package Demo;
import java.util.*;
public class squareASortedArray {
//	square a sorted array of +ve and -ve numbers
	public static void main(String[] args) {
		int arr[] = {-6,-1,2,4,5};
		int sqrArray[] = squaredArray(arr);
		System.out.println(Arrays.toString(sqrArray));
		
	}

private static int[] squaredArray(int[] arr) {
	int squaredArray[] = new int[arr.length];
	int start = 0;
	int end = arr.length - 1;
	int squareIndex = arr.length - 1;
	while(start <= end)
	{
		if(arr[start] * arr[start] > arr[end]*arr[end])
		{
			squaredArray[squareIndex--] = arr[start]* arr[start];
			start++;
		}
		else
		{
			squaredArray[squareIndex--] = arr[end] * arr[end];
			end--;
		}
	}
	return squaredArray;
}

}
