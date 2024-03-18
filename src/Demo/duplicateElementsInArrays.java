package Demo;
import java.util.*;
public class duplicateElementsInArrays {
	public static void main(String[] args) {
		String dup[] = new String[] {"java","one","two","java","one","indu"};
		Set nondupset = new HashSet<>();
		Set dupset = new HashSet<>();
		for(String str : dup)
		{
			if(!nondupset.contains(str))
			{
				nondupset.add(str);
			}
			else
			{
				dupset.add(str);
			}
		}
		System.out.println("duplicates are "+dupset);
		
	}

}
