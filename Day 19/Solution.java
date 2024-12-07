import java.util.*;

public class Solution {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
        // Step 1: Initialize flags for first row and first column
        boolean firstRowZero = false, firstColZero = false;

        // Step 2: Check if the first row or column needs to be zeroed
        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(0) == 0) {
                firstColZero = true;
                break;
            }
        }

        for (int j = 0; j < m; j++) {
            if (matrix.get(0).get(j) == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Step 3: Use the first row and column as markers
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    matrix.get(i).set(0, 0); // Mark the first cell of the row
                    matrix.get(0).set(j, 0); // Mark the first cell of the column
                }
            }
        }

        // Step 4: Zero out cells based on markers
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        // Step 5: Zero out the first row and column if necessary
        if (firstRowZero) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }

        if (firstColZero) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }

        return matrix;
    }
}