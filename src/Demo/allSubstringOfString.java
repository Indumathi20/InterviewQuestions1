package Demo;
import java.util.*;
public class allSubstringOfString {
	public static void main(String[] args) {
//		abc
//		ij first 0-1,0-2,0-3
		String str = "abc";
		for(int i=0;i<=str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i, j));
			}
		}
	}

}
