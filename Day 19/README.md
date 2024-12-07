# Day 19: Zero Matrix

## Problem Description 📝

Given an **m x n matrix**, if an element in the matrix is **0**, set its entire row and column to 0. Modify the matrix in place, without using extra space (except for a few variables for tracking the first row and column).

---

### Example:

#### **Example 1**:

- **Input**:  
  ```
  matrix = [
      [1, 2, 3],
      [4, 0, 6],
      [7, 8, 9]
  ]
  ```

- **Output**:  
  ```
  [
      [1, 0, 3],
      [0, 0, 0],
      [7, 0, 9]
  ]
  ```

  **Explanation**:  
  The element at `matrix[1][1]` is `0`, so we set the entire row and column containing `0` to `0`.

---

#### **Example 2**:

- **Input**:  
  ```
  matrix = [
      [0, 1, 2, 0],
      [3, 4, 5, 2],
      [1, 3, 1, 5]
  ]
  ```

- **Output**:  
  ```
  [
      [0, 0, 0, 0],
      [0, 4, 5, 0],
      [0, 3, 1, 0]
  ]
  ```

  **Explanation**:  
  The elements at `matrix[0][0]` and `matrix[0][3]` are `0`, so their respective rows and columns are zeroed out.

---

## Function Definition 📦

### **Function**:  
```java
public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m)
```

- **Parameters**:
  - `matrix`: A 2D array represented as an `ArrayList` of `ArrayLists`, where each `ArrayList<Integer>` is a row in the matrix.
  - `n`: The number of rows in the matrix.
  - `m`: The number of columns in the matrix.

- **Return Value**:
  - Returns the modified matrix with rows and columns set to zero where necessary.

---

## Algorithm Explanation 🚀

1. **Track the First Row and Column**:
   - Initialize flags, `firstRowZero` and `firstColZero`, to determine if the first row or first column contains a zero. This will help us later when we zero out the first row and column if necessary.

2. **Mark Zeros Using First Row and Column**:
   - Traverse the matrix starting from the second row and column. If a `0` is found at `matrix[i][j]`, mark the corresponding row (`matrix[i][0]`) and column (`matrix[0][j]`) by setting them to `0`.

3. **Zero Rows and Columns**:
   - Traverse the matrix again, starting from the second row and column. For each element, if its corresponding row or column marker is `0`, set that element to `0`.

4. **Zero First Row and Column**:
   - Finally, if the flags `firstRowZero` and `firstColZero` are set, zero out the entire first row and/or first column.

---

## Time Complexity ⏱️

- **Time Complexity**:  
  - **O(m * n)**, where `m` is the number of rows and `n` is the number of columns. We traverse the entire matrix a constant number of times, so the time complexity is proportional to the total number of elements in the matrix.

- **Space Complexity**:  
  - **O(1)**, excluding the input and output. The algorithm uses a few extra variables for tracking, which do not scale with the size of the input.

---

## Sample Input and Output 📊

### **Input 1**:  
```  
matrix = [
    [1, 2, 3],
    [4, 0, 6],
    [7, 8, 9]
]
```

### **Output 1**:  
```  
[
    [1, 0, 3],
    [0, 0, 0],
    [7, 0, 9]
]
```

---

### **Input 2**:  
```  
matrix = [
    [0, 1, 2, 0],
    [3, 4, 5, 2],
    [1, 3, 1, 5]
]
```

### **Output 2**:  
```  
[
    [0, 0, 0, 0],
    [0, 4, 5, 0],
    [0, 3, 1, 0]
]
```

---

## Key Learnings ✨

1. **Space Optimization**:
   - By using the first row and first column as markers, we avoid the need for additional memory (such as a separate matrix) to keep track of the rows and columns to be zeroed out.

2. **In-Place Modification**:
   - The solution modifies the matrix directly, which is efficient and ensures minimal space usage.

3. **Edge Cases**:
   - This approach handles edge cases, such as matrices with zeros in the first row or column, without additional complexity. It also works for any matrix size, including matrices with a single row or column.

---
