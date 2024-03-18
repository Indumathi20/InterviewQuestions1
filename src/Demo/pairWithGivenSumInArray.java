package Demo;
import java.util.*;
public class pairWithGivenSumInArray {
	public static void main(String[] args) {
		//two sum problem
		int arr[] = {10,20,30,40,50};
		int target = 30;
		int n = arr.length-1;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			if(arr[i] + arr[n-j] == target)
			{
				System.out.println(arr[i]+"and "+arr[n-j]);
				
			}
			
			}
		}
		
	}

}
