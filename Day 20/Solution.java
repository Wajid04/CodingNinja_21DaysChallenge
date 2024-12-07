import java.util.ArrayList;

public class Solution {
    public static ArrayList<ArrayList<Long>> printPascal(int n) {
        ArrayList<ArrayList<Long>> result = new ArrayList<>();
        
        // Generate Pascal's triangle row by row
        for (int i = 0; i < n; i++) {
            ArrayList<Long> row = new ArrayList<>();
            
            // First and last element of each row is always 1
            row.add(1L);
            for (int j = 1; j < i; j++) {
                // Sum of the two elements directly above
                long value = result.get(i - 1).get(j - 1) + result.get(i - 1).get(j);
                row.add(value);
            }
            if (i > 0) {
                row.add(1L);
            }
            
            // Add the current row to the result
            result.add(row);
        }
        
        return result;
    }
}