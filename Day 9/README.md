# Day 9: Get Second Largest and Second Smallest Elements  

## Problem Description 📝  

Write a program to find the **second largest** and **second smallest** elements in an array of integers.  
The second largest element is the number that is the largest after the largest element in the array.  
Similarly, the second smallest element is the number that is the smallest after the smallest element in the array.  

### Example:  
- **Input**:  
    ```  
    a = [7, 1, 9, 5, 3]  
    ```  
- **Output**:  
    ```  
    Second Largest: 7  
    Second Smallest: 3  
    ```  

---

## Implementation Details 💻  

### **Function**:  
```java  
public static int[] getSecondOrderElements(int n, int[] a)  
```  

- **Parameters**:  
  - `n`: The number of elements in the array.  
  - `a`: An array of integers.  

- **Returns**:  
  - An array of two integers:  
    - The second largest element.  
    - The second smallest element.  

---

## Explanation of the Code 🧑‍💻  

1. **Initial Variables**:  
   - `largest` is initialized to `Integer.MIN_VALUE` and `secondLargest` to `Integer.MIN_VALUE`.  
   - `smallest` is initialized to `Integer.MAX_VALUE` and `secondSmallest` to `Integer.MAX_VALUE`.  

2. **Loop Through the Array**:  
   - **Find the largest and second largest**:  
     - If a number is larger than `largest`, update `secondLargest` to `largest` and then update `largest` to the new number.  
     - If the number is larger than `secondLargest` but not larger than `largest`, update `secondLargest`.  

   - **Find the smallest and second smallest**:  
     - If a number is smaller than `smallest`, update `secondSmallest` to `smallest` and then update `smallest` to the new number.  
     - If the number is smaller than `secondSmallest` but not smaller than `smallest`, update `secondSmallest`.  

3. **Return the Result**:  
   - Return an array containing the second largest and second smallest elements.  

---

## Sample Input and Output 📊  

### **Input**:  
```  
n = 5  
a = [7, 1, 9, 5, 3]  
```  

### **Output**:  
```  
Second Largest: 7  
Second Smallest: 3  
```  

### **Explanation**:  
- The largest element is 9, so the second largest is 7.  
- The smallest element is 1, so the second smallest is 3.  

---

## Key Learnings ✨  

- **Efficient Searching**: Finds the second largest and second smallest in one traversal of the array.  
- **Use of Edge Cases**: Proper handling of cases with all elements equal or arrays with fewer than two unique values.  
- **Data Boundaries**: Using `Integer.MAX_VALUE` and `Integer.MIN_VALUE` for initialization ensures correct handling of edge cases.  

---
