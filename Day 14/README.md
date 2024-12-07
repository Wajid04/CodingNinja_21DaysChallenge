# Day 14: Sorting an Array of 0s, 1s, and 2s

## Problem Description 📝

You are given an array consisting of only three distinct integers: `0`, `1`, and `2`. The task is to sort the array **in-place** such that all `0s` appear before `1s`, and all `1s` appear before `2s`.

This problem is also known as the **Dutch National Flag Problem**.

---

### Example:

- **Input**:  
  ```  
  arr = [0, 2, 1, 2, 0, 1], n = 6
  ```

- **Output**:  
  ```  
  arr = [0, 0, 1, 1, 2, 2]
  ```

---

## Implementation Details 💻  

### **Function**:  
```java
public static void sortArray(ArrayList<Integer> arr, int n)
```

- **Parameters**:  
  - `arr`: An **ArrayList** of integers consisting of only `0`, `1`, and `2`.
  - `n`: The size of the array.

- **Logic**:  
  Use **three pointers** (`low`, `mid`, `high`) to partition the array into three parts:
  1. Elements less than `1` (all `0s`) on the left.
  2. Elements equal to `1` in the middle.
  3. Elements greater than `1` (all `2s`) on the right.

---

## Steps of the Algorithm 🚀  

1. **Initialization**:  
   - `low` and `mid` are initialized to `0` (start of the array).  
   - `high` is initialized to `n - 1` (end of the array).  

2. **Three-Way Partitioning**:  
   - Loop until `mid <= high`:
     1. If `arr[mid] == 0`, **swap** `arr[low]` and `arr[mid]`, and increment both `low` and `mid`.  
     2. If `arr[mid] == 1`, increment `mid` (no swap needed).  
     3. If `arr[mid] == 2`, **swap** `arr[mid]` and `arr[high]`, and decrement `high`.

3. **Time Complexity**:  
   - **O(n)**: The algorithm processes each element of the array only once.

4. **Space Complexity**:  
   - **O(1)**: Sorting is performed in-place with no extra memory usage.

---

## Sample Input and Output 📊  

### **Input 1**:  
```  
arr = [0, 1, 2, 0, 1, 2], n = 6
```

### **Output 1**:  
```  
arr = [0, 0, 1, 1, 2, 2]
```

---

### **Input 2**:  
```  
arr = [2, 2, 1, 1, 0, 0], n = 6
```

### **Output 2**:  
```  
arr = [0, 0, 1, 1, 2, 2]
```

---

## Key Learnings ✨  

1. **Three-Way Partitioning**:  
   This technique divides the array into three regions and processes elements in a single pass, making it highly efficient.

2. **In-Place Sorting**:  
   The array is sorted without using additional memory, which is crucial for memory-constrained applications.

3. **Optimal Approach**:  
   Unlike traditional sorting algorithms, this method leverages the limited range of values (`0, 1, 2`) to achieve linear time complexity.

---
