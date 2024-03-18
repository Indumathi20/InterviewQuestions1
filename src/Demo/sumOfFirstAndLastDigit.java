package Demo;
import java.util.*;

public class sumOfFirstAndLastDigit {
	public static void main(String[] args) {
		//find the first and last digit and sum them
		int num = 124;
		//one method
		
//		int lastDigit = 124%10;
//		int firstDigit;
//		firstDigit = num;
//		while(firstDigit >= 10)
//		{
//			firstDigit /= 10;
//		}
//		System.out.println("first digit is "+firstDigit);
//		System.out.println("last digit is "+lastDigit);
//		System.out.println("sum is "+(firstDigit+lastDigit));
		
		//another method
		int digits[] = split(num);
		System.out.println("first digit is "+digits[0]);
		System.out.println("second digit is "+ digits[digits.length-1]);
		System.out.println("sum is "+(digits[0]+digits[digits.length-1]));
	}

	private static int[] split(int num) {
		String numbers = Integer.toString(num);
		int digit[] = new int[numbers.length()];
		for(int i=0;i<numbers.length();i++)
		{
			digit[i] = Character.getNumericValue(numbers.charAt(i));
		}
		return digit;
	}


}
