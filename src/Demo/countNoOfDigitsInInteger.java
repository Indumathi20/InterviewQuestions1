package Demo;
import java.util.*;
public class countNoOfDigitsInInteger {
	public static void main(String[] args) {
		int num = 1234576;
		int count = 0;
		while(num != 0)
		{
			num = num / 10;
			count++;
		}
		System.out.println(count);
	}

}
