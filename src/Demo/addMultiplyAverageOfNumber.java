package Demo;
import java.util.*;
public class addMultiplyAverageOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice,sum = 0,mul = 1;
		System.out.println("1 sum , 2 mul , 3 avg");
		System.out.println("enter choice");
		choice = sc.nextInt();
		System.out.println("enter the no with comma to perform operation");
		Scanner sc1 = new Scanner(System.in);
		String inputnums = sc.next();
		String numbs[] = inputnums.split(",");
		for(int i=0;i<numbs.length;i++)
		{
			sum = sum + Integer.parseInt(numbs[i]);
		}
		for(int i=0;i<numbs.length;i++)
		{
			mul = mul *  Integer.parseInt(numbs[i]);
		}
		switch(choice)
		{
		case 1 :
			System.out.println("sum is " + sum);
			break;
		case 2:
			System.out.println("mul is "+mul);
			break;
		case 3:
			System.out.println("avg is "+sum/numbs.length);
			break;

		default:
			System.out.println("enter correct no");
		}
		
	}

}
