package Demo;
import java.util.*;

public class givenStringIsPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String original = sc.nextLine();
		String rev = "";
		for(int i=original.length()-1;i>=0;i--)
		{
			rev = rev + original.charAt(i);
		}
		if(original.equals(rev))
		{
			System.out.println("it is palindrome");
		}else
		{
			System.out.println("it is not palindrome");
		}
	}

}
