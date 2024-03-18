package Demo;
public class main {
    public static void main(String[] args) {
        int n = 5;
        int[] result = zoho(n);

        // Print the result array
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] zoho(int num) {
        int[] f = new int[num + 1];

        for (int i = 1; i <= num; i++) {
            f[i] = f[i >> 1] + (i & 1);
        }

        return f;
    }
}