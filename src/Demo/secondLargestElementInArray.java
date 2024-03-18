package Demo;
import java.util.*;
public class secondLargestElementInArray {
	public static void main(String[] args) {
		int arr[] = {1,20,5,6,16,10};
		Arrays.sort(arr);
		int n = arr.length-2;
		System.out.println(arr[n]);
	}

}
