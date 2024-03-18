package Demo;
import java.util.*;
public class reverseANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//method 1
		
//		String str = Integer.toString(num);
//		int digit[] = new int[str.length()];
//		for(int i=0;i<str.length();i++)
//		{
//			digit[i] = Character.getNumericValue(str.charAt(i));	
//		}
//		for(int i=digit.length-1;i>=0;i--)
//		{
//			System.out.print(digit[i]);
//		}
		
		//method 2
		int rev = 0;
		while(num != 0)
		{
			int digit = num % 10;
			rev = rev * 10 + digit;
			num = num / 10;
			
		}
		System.out.println(rev);
	}

}
