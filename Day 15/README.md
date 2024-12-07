# Day 15: Implementing Lower Bound using Binary Search

## Problem Description 📝

You are given a sorted array and a target value `x`. The task is to implement a function to find the **lower bound** of `x` in the array. The lower bound of `x` is the **smallest index** at which `x` can be inserted into the array while maintaining the sorted order. If `x` is already present, it will return the index of the first occurrence of `x`.

---

### What is Lower Bound?

- **Lower bound** of `x` in a sorted array is the first position where an element that is greater than or equal to `x` exists. If `x` is already in the array, the lower bound is the index of the first occurrence of `x`.

---

## Example:

### **Example 1**:

- **Input**:  
  ```  
  arr = [1, 3, 5, 7, 9], x = 5
  ```

- **Output**:  
  ```  
  2
  ```

  **Explanation**: The lower bound of `5` in the array is at index `2` (since `5` is found at index `2`).

---

### **Example 2**:

- **Input**:  
  ```  
  arr = [1, 3, 5, 7, 9], x = 6
  ```

- **Output**:  
  ```  
  3
  ```

  **Explanation**: The lower bound of `6` in the array is at index `3` (since `6` is not present, but `7` is the first element greater than `6`).

---

## Function Definition 📦

### **Function**:  
```java
public static int lowerBound(int[] arr, int n, int x)
```

- **Parameters**:
  - `arr`: A sorted integer array.
  - `n`: The length of the array.
  - `x`: The target value to find the lower bound for.

- **Return Value**:
  - Returns the index of the lower bound of `x`.

---

## Algorithm Explanation 🚀

1. **Initialization**:
   - Set `low = 0` and `high = n` to start binary search on the entire array.

2. **Binary Search**:
   - While `low < high`, find the middle element (`mid`) of the current range.
   - If `arr[mid] < x`, move the `low` pointer to `mid + 1`, since all elements before `mid` are smaller than `x`.
   - If `arr[mid] >= x`, move the `high` pointer to `mid`, to find the first index where `arr[mid]` is greater than or equal to `x`.

3. **Return**:
   - At the end of the loop, `low` will point to the index where `x` can be inserted.

---

## Time Complexity ⏱️

- **Time Complexity**:  
  - **O(log n)** due to the binary search algorithm.

- **Space Complexity**:  
  - **O(1)** as we are using only a few variables for the binary search.

---

## Sample Input and Output 📊

### **Input 1**:  
```  
arr = [1, 3, 5, 7, 9], x = 5
```

### **Output 1**:  
```  
2
```

### **Input 2**:  
```  
arr = [1, 3, 5, 7, 9], x = 6
```

### **Output 2**:  
```  
3
```

---

## Key Learnings ✨

1. **Binary Search Optimization**:  
   The lower bound search utilizes binary search, which is an efficient way to find insertion points in a sorted array.

2. **Handling Edge Cases**:  
   - The algorithm is designed to handle cases where `x` is greater than all elements, smaller than all elements, or already present in the array.
   
3. **Efficient Searching**:  
   By using binary search, we reduce the time complexity to **O(log n)**, making it efficient for large datasets.

---
