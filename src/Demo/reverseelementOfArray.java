package Demo;
import java.util.*;
public class reverseelementOfArray {
	public static void main(String[] args) {
		Stack stack = new Stack();
		int arr[] = {5,6,7,8};
		for(int i=0;i<arr.length;i++)
		{
			stack.add(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(stack.pop());
		}
	}

}
