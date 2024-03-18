package Demo;
import java.math.BigInteger;
import java.util.*;
public class factorialOfLargeNumber {
	public static void main(String[] args) {
		int numb = 20;
		BigInteger fact = BigInteger.ONE; //initializing fact = 1
		for(int i=1;i<=numb;i++)
		{
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact);
	}

}
