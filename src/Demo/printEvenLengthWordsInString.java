package Demo;
import java.util.*;
public class printEvenLengthWordsInString {
	public static void main(String[] args) {
		String str = "this iss indu";
		String arr[] = str.split(" ");
		for(String s: arr)
		{
			if(s.length() % 2 == 0)
			{
				System.out.println(s);
			}
		}
	}

}
