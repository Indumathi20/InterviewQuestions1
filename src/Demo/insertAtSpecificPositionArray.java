package Demo;
import java.util.*;
public class insertAtSpecificPositionArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		System.out.println("enter 5 elements: ");
		for(int i=0;i<5;i++)
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the pos");
		int pos = sc.nextInt();
		System.out.println("enter the value");
		int value = sc.nextInt();
		for(int i=arr.length-1;i>pos-1;i--)
		{
			arr[i] = arr[i-1];
		}
		arr[pos-1] = value;
		System.out.println(Arrays.toString(arr));
		
	}
}
