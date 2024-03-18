package Demo;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
public class generateRandomNumbers {
	public static void main(String[] args) {
		//method 1
		System.out.println(Math.random());
		//method 2
		System.out.println(ThreadLocalRandom.current().nextInt());
		System.out.println(ThreadLocalRandom.current().nextDouble());
		System.out.println(ThreadLocalRandom.current().nextFloat());
		System.out.println(ThreadLocalRandom.current().nextBoolean());
		
		//method 3
		Random random = new Random();
		System.out.println(random.nextInt(1000));//btw  0 to 1000;
		
		
	}

}
