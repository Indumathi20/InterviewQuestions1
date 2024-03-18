package Demo;
import java.util.*;
public class floydstriangle {
	public static void main(String[] args) {
//		1
//		2 3
//		4 5 6
//		7 8 9 10 
		int n,num = 1;
		//n - no of rows 
		n = 4;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
