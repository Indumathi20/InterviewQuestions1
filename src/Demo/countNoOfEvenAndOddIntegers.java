package Demo;
import java.util.*;
public class countNoOfEvenAndOddIntegers {
	public static void main(String[] args) {
		int num = 1234577;
		int even=0,odd = 0;
		 while(num != 0)
		 {
			 int digit = num % 10;
			 if(digit % 2 == 0)
			 {
				 even++;
			 }
			 else
			 {
				 odd++;
			 }
			 num = num / 10;
		 }
		 System.out.println("no of even "+even);
		 System.out.println("no of odd "+odd);
	}

}
