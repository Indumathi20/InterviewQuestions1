package Demo;
import java.util.*;
public class printNumberWithoutLoops {
	public static void main(String[] args) {
		printnumber(1);
	}

	private static void printnumber(int n) {
		if(n <= 10)
		{
			System.out.println(n);
			printnumber(n+1);
		}
		
	}

}
