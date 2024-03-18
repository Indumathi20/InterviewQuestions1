package Demo;
import java.util.*;
public class factorsOfNumber {
public static void main(String[] args) {
	//factor of no from 1 to 100
	int num =57;
	for(int i=1;i<=100;i++)
	{
		System.out.println("factors of no "+i+" are ");
		for(int j=1;j<=i;j++)
		{
			if(i % j == 0)
			{
				System.out.print(j+ " ");
			}
		}
		System.out.println();
	}
}
}
