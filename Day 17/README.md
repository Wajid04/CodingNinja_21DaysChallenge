# Day 17: Upper Bound using Binary Search

## Problem Description 📝

Given a sorted array `arr` of integers and a target integer `x`, the task is to find the **upper bound** of `x`. The **upper bound** is the smallest index `i` such that all elements before `i` are less than or equal to `x`, and the element at index `i` is strictly greater than `x`.

In simpler terms, the **upper bound** of `x` is the first element in the array that is strictly greater than `x`.

---

### Example:

#### **Example 1**:

- **Input**:  
  ```  
  arr = [1, 2, 4, 4, 5], x = 4
  ```

- **Output**:  
  ```  
  4
  ```

  **Explanation**: The element `4` appears at index 2 and 3, but the first element that is strictly greater than `4` is `5`, at index `4`.

---

#### **Example 2**:

- **Input**:  
  ```  
  arr = [1, 2, 3, 4], x = 5
  ```

- **Output**:  
  ```  
  4
  ```

  **Explanation**: Since there is no element greater than `5`, the upper bound is the length of the array, `4`.

---

## Function Definition 📦

### **Function**:  
```java
public static int upperBound(int[] arr, int x, int n)
```

- **Parameters**:
  - `arr`: A sorted array of integers.
  - `x`: The target value for which the upper bound is to be found.
  - `n`: The length of the array `arr`.

- **Return Value**:
  - Returns the index of the **upper bound** of `x` in the array. If all elements are less than or equal to `x`, it returns `n`.

---

## Algorithm Explanation 🚀

1. **Initialize**:
   - Set `left` to `0` (start of the array) and `right` to `n - 1` (end of the array).
   - Initialize `result` to `n`, which is the default value if no element greater than `x` is found.

2. **Binary Search**:
   - While the search space is valid (`left <= right`), calculate the middle index `mid`.
   - If `arr[mid] > x`, it means this element might be a possible upper bound. Set `result` to `mid`, and search in the left half by adjusting `right = mid - 1`.
   - If `arr[mid] <= x`, move the `left` pointer to `mid + 1` to search in the right half.

3. **Return**:
   - Once the binary search completes, the `result` will hold the index of the upper bound of `x`.

---

## Time Complexity ⏱️

- **Time Complexity**:  
  - **O(log n)**, where `n` is the length of the array. The binary search algorithm halves the search space at each step, resulting in logarithmic time complexity.

- **Space Complexity**:  
  - **O(1)**. The algorithm uses only a constant amount of extra space.

---

## Sample Input and Output 📊

### **Input 1**:  
```  
arr = [1, 2, 4, 4, 5], x = 4
```

### **Output 1**:  
```  
4
```

---

### **Input 2**:  
```  
arr = [1, 2, 3, 4], x = 5
```

### **Output 2**:  
```  
4
```

---

## Key Learnings ✨

1. **Binary Search for Upper Bound**:
   - This is a typical binary search problem where we aim to find an index that satisfies a condition (`arr[mid] > x`). The algorithm efficiently narrows down the search space to find the answer.

2. **Understanding Upper Bound**:
   - The upper bound is not just the first occurrence of an element greater than `x`, but the smallest index where the element is strictly greater than `x`.

3. **Edge Cases**:
   - Consider cases where no element is greater than `x` (return `n`).
   - Handle arrays with repeated elements where all values are equal to `x`.

---
