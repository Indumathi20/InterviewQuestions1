package Demo;
import java.util.*;
public class compareTwoStringsWithoutBuildInFunctions {
	public static void main(String[] args) {
		String str1 = "indiumathi";
		String str2 = "indumathii";
		boolean iscomp = false;
		for(int i=0;i<str1.length();i++)
		{
			if(str1.charAt(i) != str2.charAt(i))
			{
				iscomp = false;
				break;
				
			}
			iscomp = true;
			
			
		}
		if(iscomp)
		{
			System.out.println("same");
		}else
		{
			System.out.println("not same");
		}
	}

}
