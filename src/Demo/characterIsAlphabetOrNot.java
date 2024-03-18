package Demo;
import java.util.*;
public class characterIsAlphabetOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c = sc.next().charAt(0);
//		if(Character.isAlphabetic(c))
//		{
//			System.out.println("it is alphabet");
//		}else
//		{
//			System.out.println("not an alphabet");
//		}
//							OR
		
		if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
		{
			System.out.println("it is alphabet");
		}
		else
			{
				System.out.println("not an alphabet");
		}
	}

}
