public class Solution {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            // Numbers less than or equal to 1 are not prime
            return false;
        }

        // Check divisors from 2 to √n
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                // If 'n' is divisible by any 'i', it's not prime
                return false;
            }
        }

        // If no divisors found, the number is prime
        return true;
    }

    public static void main(String[] args) {
        // Test the function
        int n = 5; // Example input
        if (isPrime(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
