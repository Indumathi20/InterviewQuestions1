package Demo;
import java.util.*;
public class arraysToArrayList {
	public static void main(String[] args) {
		String clr[] = {"red","blue","green","pink","black"};
		//method 1
//		List list = Arrays.asList(clr);
//		System.out.println(list);
		
		//method 2
//		List<String> l = new ArrayList<>();
//		Collections.addAll(l, clr);
//		System.out.println(l);
		
		//method 3
		List<String> l = new ArrayList<>();
		for(String str:clr)
		{
			l.add(str);
		}
		System.out.println(l);
	}

}
