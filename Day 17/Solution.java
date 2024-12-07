public class Solution {
    public static int upperBound(int[] arr, int x, int n) {
        int left = 0, right = n - 1;
        int result = n; // Default to 'n' if no element is greater than 'x'

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > x) {
                result = mid; // Update the result to the current index
                right = mid - 1; // Search in the left half
            } else {
                left = mid + 1; // Search in the right half
            }
        }

        return result;
    }
}