package Demo;
import java.util.*;
public class stockBuyAndSellProblem {
	public static void main(String[] args) {
//		{10,20,40,80,90}
//		if for 20 it is bought and selled at 90 then 
//		90 - 20 = 70 is the profit 
//		what will be the highest profit
//		highest profit = 90-10 = 80
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int arr[] = {10,20,30,40,80,90};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] < min)
			{
				min = arr[i];
			}
			if(arr[i] - min > max)
			{
				max = arr[i] - min;
			}
		}
		System.out.println("max value is " + max);
		
		
	}

}
