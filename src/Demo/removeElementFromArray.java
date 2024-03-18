package Demo;
import java.util.*;
public class removeElementFromArray {
	public static void main(String[] args) {
		int original[] = {1,2,3,4,5,6,7,8,9};
		int removeelment = 3;
		int newarr[] = remove(original,removeelment);
		
		System.out.println(Arrays.toString(newarr));
	}
	public static int[] remove(int arr[],int element)
	{
		int newarr[] = new int[arr.length];
		int index = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] != element)
			{
				newarr[index] = arr[i];
				index++;
			}
		}
		return newarr;
	}
}
