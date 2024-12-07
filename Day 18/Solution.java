import java.util.*;

public class Solution {
    public static int[] spiralMatrix(int[][] MATRIX) {
        if (MATRIX == null || MATRIX.length == 0) return new int[0];

        ArrayList<Integer> result = new ArrayList<>();
        int top = 0, left = 0; // Start boundaries
        int bottom = MATRIX.length - 1, right = MATRIX[0].length - 1; // End boundaries

        while (top <= bottom && left <= right) {
            // Traverse from left to right
            for (int i = left; i <= right; i++) {
                result.add(MATRIX[top][i]);
            }
            top++;

            // Traverse from top to bottom
            for (int i = top; i <= bottom; i++) {
                result.add(MATRIX[i][right]);
            }
            right--;

            // Traverse from right to left, if there are rows remaining
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result.add(MATRIX[bottom][i]);
                }
                bottom--;
            }

            // Traverse from bottom to top, if there are columns remaining
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result.add(MATRIX[i][left]);
                }
                left++;
            }
        }

        // Convert the ArrayList to int[]
        int[] spiralOrder = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            spiralOrder[i] = result.get(i);
        }

        return spiralOrder;
    }
}