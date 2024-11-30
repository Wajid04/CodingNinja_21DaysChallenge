# Day 13: Binary Search

## Problem Description 📝

Given a **sorted array of integers** and a **target integer**, write a program to perform a **binary search** and return the index of the target element. If the target is not found, return `-1`.

### Example:

- **Input**:  
    ```  
    nums = [1, 2, 3, 4, 5], target = 3
    ```

- **Output**:  
    ```  
    2
    ```

---

## Implementation Details 💻  

### **Function**:  
```java  
public static int search(int[] nums, int target)
```  

- **Parameters**:  
  - `nums`: A **sorted array of integers**.
  - `target`: The **integer** you want to search for in the array.

- **Returns**:  
  - The **index of the target** if found.
  - `-1` if the target is not found in the array.

---

## Explanation of the Code 🧑‍💻  

1. **Initialization**:  
   - Set `left` to `0` (the start of the array) and `right` to `nums.length - 1` (the end of the array).

2. **Binary Search Loop**:  
   - In each iteration of the loop, calculate the `mid` index. This is the middle element of the current subarray.
   - If `nums[mid] == target`, return the index `mid` (since we've found the target).
   - If `nums[mid] < target`, the target must be in the right half of the array, so we update `left` to `mid + 1`.
   - If `nums[mid] > target`, the target must be in the left half of the array, so we update `right` to `mid - 1`.

3. **Return `-1` if not found**:  
   - If the loop ends and the target is not found, return `-1`.

4. **Time Complexity**:  
   - The time complexity of the binary search is **O(log n)**, where `n` is the number of elements in the array. This is because the size of the search space is halved with each iteration.

---

## Sample Input and Output 📊  

### **Input 1**:  
```  
nums = [1, 2, 3, 4, 5], target = 3
```  

### **Output 1**:  
```  
2
```  

### **Explanation**:  
- The number `3` is at index `2` in the array, so the output is `2`.

### **Input 2**:  
```  
nums = [1, 3, 5, 7, 9], target = 7
```  

### **Output 2**:  
```  
3
```  

### **Explanation**:  
- The number `7` is at index `3` in the array, so the output is `3`.

### **Input 3**:  
```  
nums = [1, 2, 3, 4, 5], target = 6
```  

### **Output 3**:  
```  
-1
```  

### **Explanation**:  
- The number `6` is not in the array, so the output is `-1`.

---

## Key Learnings ✨  

- **Binary Search**: This is a classic **divide and conquer** algorithm, effective for searching in **sorted arrays**.
- **Logarithmic Time Complexity**: Binary search reduces the search space exponentially, making it much faster than linear search, especially for large arrays.
- **Iterative Approach**: The algorithm works iteratively (without recursion), which is efficient in terms of space.

---
