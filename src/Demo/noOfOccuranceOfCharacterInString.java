package Demo;
import java.util.*;

public class noOfOccuranceOfCharacterInString {
	public static void main(String[] args) {
		String str = "malayalam";
		//java - 4
		//jv - 2
		//4-2 = 2;
		int intialLength = str.length();
		String s ="a";
		str = str.replace(s, "");
		int finallength = str.length();
		
		System.out.println("amount of occurance of "+"\t"+s+" "+"is"+" "+(intialLength-finallength));
	}

}
