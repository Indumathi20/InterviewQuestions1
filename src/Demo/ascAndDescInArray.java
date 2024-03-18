package Demo;
import java.util.*;
public class ascAndDescInArray {
	public static void main(String[] args) {
		String arr[] = {"one","two","three","four"};
		System.out.println("before sort");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("after sort in asc");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr,Collections.reverseOrder()); // to sort in desc
		System.out.println("after sort in desc");
		System.out.println(Arrays.toString(arr));
	}

}
