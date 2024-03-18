package Demo;
import java.util.*;
public class evenOrOddWithoutModulusOperator {
	public static void main(String[] args) {
		//formula (numb / 2)*2 == numb
		//exam (4/2)*2==4 even
		Scanner sc = new Scanner(System.in);
		int numb = sc.nextInt();
		int result = (numb / 2)* 2 ;
		if(result == numb)
		{
			System.out.println("it is even");
		}
		else
		{
			System.out.println("it is odd");
		}
	}

}
