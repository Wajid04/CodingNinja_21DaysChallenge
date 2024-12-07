# Day 18: Spiral Matrix Traversal

## Problem Description 📝

Given a **2D matrix**, the task is to return the **elements of the matrix in spiral order**. The traversal should begin from the top-left corner of the matrix and proceed in the following spiral order:

- Left to right
- Top to bottom
- Right to left
- Bottom to top

Repeat this process until all elements of the matrix have been visited.

---

### Example:

#### **Example 1**:

- **Input**:  
  ```
  MATRIX = [
      [1, 2, 3],
      [4, 5, 6],
      [7, 8, 9]
  ]
  ```

- **Output**:  
  ```
  [1, 2, 3, 6, 9, 8, 7, 4, 5]
  ```

  **Explanation**:  
  The spiral order starts from `1` and goes to the right, down, left, and up in a circular pattern.

---

#### **Example 2**:

- **Input**:  
  ```
  MATRIX = [
      [1, 2, 3, 4],
      [5, 6, 7, 8],
      [9, 10, 11, 12]
  ]
  ```

- **Output**:  
  ```
  [1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
  ```

  **Explanation**:  
  The traversal proceeds in a spiral starting from `1` and continues to the outermost layer and gradually moves inward.

---

## Function Definition 📦

### **Function**:  
```java
public static int[] spiralMatrix(int[][] MATRIX)
```

- **Parameters**:
  - `MATRIX`: A 2D array representing the matrix whose elements need to be traversed in spiral order.

- **Return Value**:
  - Returns an array of integers containing the elements in spiral order.

---

## Algorithm Explanation 🚀

1. **Boundary Initialization**:
   - Define `top`, `left`, `bottom`, and `right` to represent the current boundaries of the matrix. These will guide the traversal.
   
2. **Traversal**:
   - **Left to Right**: Traverse along the top row from the leftmost to the rightmost element.
   - **Top to Bottom**: Traverse along the rightmost column from the topmost to the bottommost element.
   - **Right to Left**: If there are rows remaining, traverse along the bottom row from the rightmost to the leftmost element.
   - **Bottom to Top**: If there are columns remaining, traverse along the leftmost column from the bottommost to the topmost element.

3. **Adjust Boundaries**:
   - After each traversal, adjust the corresponding boundary (`top++`, `bottom--`, `left++`, `right--`) to narrow down the search area for the next layer.

4. **Return**:
   - The result of the traversal is stored in an `ArrayList<Integer>`. Once the entire matrix is traversed, convert the list into an array and return it.

---

## Time Complexity ⏱️

- **Time Complexity**:  
  - **O(m * n)**, where `m` is the number of rows and `n` is the number of columns. The matrix elements are traversed exactly once, making the time complexity proportional to the number of elements.

- **Space Complexity**:  
  - **O(m * n)** for storing the result in an array, which holds all the elements of the matrix.

---

## Sample Input and Output 📊

### **Input 1**:  
```  
MATRIX = [
    [1, 2, 3],
    [4, 5, 6],
    [7, 8, 9]
]
```

### **Output 1**:  
```  
[1, 2, 3, 6, 9, 8, 7, 4, 5]
```

---

### **Input 2**:  
```  
MATRIX = [
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12]
]
```

### **Output 2**:  
```  
[1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7]
```

---

## Key Learnings ✨

1. **Spiral Matrix Traversal**:
   - The problem involves systematically traversing a matrix in a specific order (spiral). Using boundaries (`top`, `bottom`, `left`, `right`) helps in narrowing down the area to process.

2. **Adjusting Boundaries**:
   - After completing one full loop around the matrix, the boundaries are adjusted to proceed inward toward the next set of elements, which ensures every element is visited.

3. **Edge Cases**:
   - Consider edge cases like single-row or single-column matrices. The algorithm is designed to handle such cases by adjusting the boundaries accordingly.

---
