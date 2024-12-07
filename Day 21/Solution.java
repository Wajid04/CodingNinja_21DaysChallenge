public class Solution {
    public static int numberOfInversions(int[] a, int n) {
        // Helper function to perform merge sort and count inversions
        return mergeSortAndCount(a, 0, n - 1);
    }

    private static int mergeSortAndCount(int[] a, int left, int right) {
        if (left >= right) {
            return 0; // Base case: no inversions in a single element
        }

        int mid = left + (right - left) / 2;
        int inversions = 0;

        // Count inversions in the left and right halves
        inversions += mergeSortAndCount(a, left, mid);
        inversions += mergeSortAndCount(a, mid + 1, right);

        // Count inversions during merge
        inversions += mergeAndCount(a, left, mid, right);

        return inversions;
    }

    private static int mergeAndCount(int[] a, int left, int mid, int right) {
        int[] temp = new int[right - left + 1];
        int i = left, j = mid + 1, k = 0, inversions = 0;

        // Merge process with inversion counting
        while (i <= mid && j <= right) {
            if (a[i] <= a[j]) {
                temp[k++] = a[i++];
            } else {
                // Inversion found
                inversions += (mid - i + 1);
                temp[k++] = a[j++];
            }
        }

        // Copy remaining elements from both halves
        while (i <= mid) {
            temp[k++] = a[i++];
        }
        while (j <= right) {
            temp[k++] = a[j++];
        }

        // Copy merged elements back to original array
        System.arraycopy(temp, 0, a, left, temp.length);

        return inversions;
    }
}
