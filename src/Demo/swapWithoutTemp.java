package Demo;
import java.util.*;
public class swapWithoutTemp {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.println("a = "+a+" b = "+b);
//		a = a * b; //10 * 20 = 200
//		b = a/b; //200/20=10
//		a = a/b; //200/10 = 20
//		System.out.println("a = "+a+" b = "+b);
		//			OR
		
		//using addition and subtraction
		
		a = a+b; //10+20 = 30
		b = a-b; //30-20 = 10
		a = a-b; //30-10 = 20
		System.out.println("a = "+a+" b = "+b);
		
	}

}
