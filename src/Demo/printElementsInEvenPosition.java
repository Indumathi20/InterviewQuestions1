package Demo;
import java.util.*;

public class printElementsInEvenPosition {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        for (int i = 1; i < arr.length; i += 2) { // Start from index 1, and increment by 2 for even positions
            System.out.print(arr[i] + " ");
        }
    }
}
