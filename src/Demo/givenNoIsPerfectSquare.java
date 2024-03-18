package Demo;
import java.util.*;
public class givenNoIsPerfectSquare {
public static void main(String[] args) {
//	 In other words, it is the square of an integer. 
//	 For example, 1, 4, 9, 16, 25, etc., are perfect 
//	 squares because they can be expressed as 1^2, 2^2, 3^2, 4^2, 5^2, and so on.
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int flag = 0;
	for(int i=0;i<num;i++)
	{
		if(i * i == num)
		{
			flag = 1;
		}
	}
	if(flag == 0)
	{
		System.out.println("not a perfect square");
	}
	else
	{
		System.out.println("it is a perfect square");
	}
	
}
}
