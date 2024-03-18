package Demo;
import java.util.*;
public class orderOfElementsInArrayList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(2);
		list.add(8);
		list.add(20);
		System.out.println("before reverse "+ list);
		Collections.reverse(list);
		System.out.println("after reverse "+list);
	}

}
