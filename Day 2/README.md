# Day 2: Fibonacci Number Finder  

## Problem Description 📝  

Write a program to find the **nth Fibonacci number** using an iterative approach. The Fibonacci sequence is defined as:  

- \( F(1) = 1 \)  
- \( F(2) = 1 \)  
- \( F(n) = F(n-1) + F(n-2) \) for \( n > 2 \)  

The sequence starts as:  
1, 1, 2, 3, 5, 8, 13, 21, ...  

The program takes an integer \( n \) as input and returns the \( n \)th Fibonacci number.  

---

## Implementation Details 💻  

### **Function**:  
```java  
public static int fibonacci(int n)  
```  

- **Parameters**:  
  - `n`: An integer representing the position in the Fibonacci sequence (1-based index).  

- **Returns**:  
  - The \( n \)th Fibonacci number as an integer.  

---

## Explanation of the Code 🧑‍💻  

1. **Base Cases**:  
   - If \( n = 1 \) or \( n = 2 \), the function returns 1 directly, as these are the first two numbers in the sequence.  

2. **Iterative Calculation**:  
   - Starts with the first two Fibonacci numbers (\( a = 1, b = 1 \)).  
   - Iteratively computes the next Fibonacci number by summing the previous two numbers (\( \text{next} = a + b \)).  
   - Updates \( a \) and \( b \) to move to the next numbers in the sequence.  

3. **Main Method**:  
   - Reads the integer \( n \) from the user.  
   - Calls the `fibonacci` function to compute the \( n \)th Fibonacci number.  
   - Outputs the result.  

---

## Sample Input and Output 📊  

### **Input**:  
```  
5  
```  

### **Output**:  
```  
5  
```  

### **Explanation**:  
The Fibonacci sequence up to \( n = 5 \) is:  
1, 1, 2, 3, **5**  

---

## Key Learnings ✨  

- **Iterative Approach**: Avoids recursion to prevent stack overflow for large \( n \).  
- **Time Complexity**: The iterative approach runs in \( O(n) \).  
- **Fibonacci Logic**: Understanding how to derive each term based on the previous two terms.  

---  
