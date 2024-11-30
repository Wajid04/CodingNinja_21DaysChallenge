public class Solution {
    public static int reverseNumber(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

    public static void main(String[] args) {
        int n = 123;
        System.out.println(reverseNumber(n)); // Output: 321
    }
}
