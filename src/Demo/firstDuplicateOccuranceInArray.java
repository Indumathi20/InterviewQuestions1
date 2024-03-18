package Demo;
import java.util.*;
public class firstDuplicateOccuranceInArray {
public static void main(String[] args) {
	int arr[] = {1,2,3,4,4,5,5,8};
	Set<Integer> set = new HashSet<>();
	for(int i=0;i<arr.length;i++)
	{
		if(set.contains(arr[i]))
		{
			System.out.println("first duplicate is "+arr[i]);
			break;
		}
		else
		{
			set.add(arr[i]);
		}
	}
	
	
}
}
