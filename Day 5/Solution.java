public class Solution {
    public static int isSorted(int n, int[] a) {
        for (int i = 1; i < n; i++) {
            if (a[i] < a[i - 1]) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        int n = 5;
        int[] a = {1, 2, 3, 4, 5};
        System.out.println(isSorted(n, a)); // Output: 1
    }
}
