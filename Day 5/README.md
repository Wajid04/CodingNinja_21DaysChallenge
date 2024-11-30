# Day 5: Check if Array is Sorted  

## Problem Description 📝  

Write a program to check if a given array is sorted in **non-decreasing order**.  

- If the array is sorted, return **1**.  
- If the array is not sorted, return **0**.  

For example:  
- \( a = \{1, 2, 3, 4, 5\} \) → Sorted → Output: **1**  
- \( a = \{5, 3, 2, 1\} \) → Not Sorted → Output: **0**  

---

## Implementation Details 💻  

### **Function**:  
```java  
public static int isSorted(int n, int[] a)  
```  

- **Parameters**:  
  - `n`: The size of the array \( a \).  
  - `a`: An array of integers to check for sorted order.  

- **Returns**:  
  - `1` if the array is sorted in non-decreasing order.  
  - `0` if the array is not sorted.  

---

## Explanation of the Code 🧑‍💻  

1. **Iterate Through the Array**:  
   - Loop from the second element to the last element.  
   - Compare each element \( a[i] \) with its predecessor \( a[i-1] \).  

2. **Check Sorted Order**:  
   - If any element \( a[i] < a[i-1] \), the array is not sorted, so return `0`.  

3. **Return Sorted Status**:  
   - If no such pair is found, the array is sorted, so return `1`.  

4. **Main Method**:  
   - Example test case with \( n = 5 \) and \( a = \{1, 2, 3, 4, 5\} \).  
   - Prints `1` since the array is sorted.  

---

## Sample Input and Output 📊  

### **Input**:  
```  
n = 5  
a = {1, 2, 3, 4, 5}  
```  

### **Output**:  
```  
1  
```  

### **Explanation**:  
- Each element in \( a \) is greater than or equal to the previous element.  
- The array is sorted in non-decreasing order.  

---

## Key Learnings ✨  

- **Iterative Array Traversal**: Efficiently traversing an array to check conditions.  
- **Non-Decreasing Order**: Ensuring each element is greater than or equal to its predecessor.  
- **Efficient Logic**: Early exit upon detecting unsorted elements.  

---  
