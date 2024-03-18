package Demo;
import java.util.*;
public class swapElementsInList {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(9);
		list.add(2);
		list.add(8);
		list.add(20);
		System.out.println("before swaping "+list);
		Collections.swap(list, 1, 2);
		System.out.println("after swaping "+list);
//		before swaping [1, 9, 2, 8, 20]
//		after swaping [1, 2, 9, 8, 20]
	}

}
