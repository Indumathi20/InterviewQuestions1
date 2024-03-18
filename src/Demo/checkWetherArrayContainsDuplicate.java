package Demo;
import java.util.*;
public class checkWetherArrayContainsDuplicate {
	public static void main(String[] args) {
		String dup[] = new String[] {"one","two","threee","four"};
		List duplist = Arrays.asList(dup);
		Set dupset = new HashSet<>();
		if(duplist.size() != dupset.size())
		{
			System.out.println("contains duplicate");
		}
		else
		{
			System.out.println("does not contain duplicates");
		}
		
	}

}
