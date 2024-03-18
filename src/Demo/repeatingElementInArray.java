package Demo;
import java.util.*;

public class repeatingElementInArray {
	public static void main(String[] args) {
		int arr[] = {1,5,1,5,4,5};
		int temp[] = new int[arr.length];
		for(int i=0;i<temp.length;i++)
		{
			if(temp[arr[i]] == 1)
			{
				System.out.println(arr[i]);
			}else
			{
				temp[arr[i]]++;
			}
		}
	}

}
