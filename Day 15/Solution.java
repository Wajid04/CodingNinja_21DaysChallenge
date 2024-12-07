public class Solution {
    public static int lowerBound(int[] arr, int n, int x) {
        int low = 0;
        int high = n; // Setting high to n to handle the case where x is larger than all elements
        while (low < high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] < x) {
                low = mid + 1; // Move right as all elements before mid are less than x
            } else {
                high = mid; // Move left to find the first index where arr[mid] >= x
            }
        }
        return low; // At the end of the loop, 'low' points to the lower bound of x
    }
}