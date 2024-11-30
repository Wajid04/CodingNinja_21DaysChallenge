import java.util.Scanner;

public class Solution {
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        int a = 1, b = 1;

        for (int i = 3; i <= n; i++) {
            int next = a + b;
            a = b;
            b = next;
        }

        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        sc.close();
    }
}
