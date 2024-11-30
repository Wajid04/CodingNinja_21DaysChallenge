# Day 11: Find Pair with a Given Sum

## Problem Description 📝

Write a program that checks if there exists **a pair of numbers** in the array that add up to a **given target sum**.

### Example:

- **Input**:  
    ```  
    book = [3, 5, 2, 8, 11]  
    target = 10
    ```

- **Output**:  
    ```  
    YES
    ```  
- **Explanation**:  
  The pair `(2, 8)` adds up to `10`, so the output is "YES".  

---

## Implementation Details 💻  

### **Function**:  
```java  
public static String read(int n, int[] book, int target)
```  

- **Parameters**:  
  - `n`: An integer representing the size of the array `book`.  
  - `book`: An array of integers.  
  - `target`: An integer representing the sum we are looking for.  

- **Returns**:  
  - A string: "YES" if there exists a pair of integers in `book` that add up to the `target`; otherwise, "NO".  

---

## Explanation of the Code 🧑‍💻  

1. **Nested Loop Approach**:  
   - The outer loop iterates through each element of the array `book`.  
   - The inner loop starts from the next element (`i + 1`) and checks if the sum of the current element (`book[i]`) and any subsequent element (`book[j]`) equals the `target`.

2. **Checking for Target Sum**:  
   - If a pair of elements adds up to the `target`, the program immediately returns "YES".  
   - If no such pair is found by the time both loops have finished, it returns "NO".

3. **Time Complexity**:  
   - The time complexity is **O(n²)** due to the nested loops, where `n` is the length of the array. Each element is compared with every other element to check if their sum matches the target.

---

## Sample Input and Output 📊  

### **Input 1**:  
```  
book = [3, 5, 2, 8, 11]  
target = 10
```  

### **Output 1**:  
```  
YES
```  

### **Explanation**:  
- The pair `(2, 8)` adds up to `10`, so the output is "YES".  

### **Input 2**:  
```  
book = [3, 5, 2, 8, 11]  
target = 15
```  

### **Output 2**:  
```  
NO
```  

### **Explanation**:  
- There is no pair that adds up to `15`, so the output is "NO".  

---

## Key Learnings ✨  

- **Nested Loops for Pair Search**: The nested loop structure is an intuitive approach for finding pairs within the array.  
- **Efficiency Considerations**: The solution works well for small arrays but might be inefficient for large arrays due to its **O(n²)** time complexity. Optimizations (like using a hash set) could make it more efficient.  

---
