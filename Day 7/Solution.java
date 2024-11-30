public class Solution {
    public static int[] reverseArray(int n, int[] nums) {
        int[] reversed = new int[n];
        for (int i = 0; i < n; i++) {
            reversed[i] = nums[n - 1 - i];
        }
        return reversed;
    }
}
