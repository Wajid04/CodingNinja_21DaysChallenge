# Day 8: Calculate GCD (Greatest Common Divisor)  

## Problem Description 📝  

Write a program to calculate the **Greatest Common Divisor (GCD)** of two integers \( n \) and \( m \).  
The GCD of two numbers is the largest integer that divides both numbers without leaving a remainder.  

For example:  
- Input: \( n = 56, m = 98 \) → Output: \( 14 \)  

---  

## Implementation Details 💻  

### **Function**:  
```java  
public static int calcGCD(int n, int m)  
```  

- **Parameters**:  
  - `n`: An integer representing the first number.  
  - `m`: An integer representing the second number.  

- **Returns**:  
  - An integer representing the GCD of \( n \) and \( m \).  

---

## Explanation of the Code 🧑‍💻  

1. **Euclidean Algorithm**:  
   - Repeatedly replace \( n \) with \( m \) and \( m \) with \( n \% m \) (the remainder when \( n \) is divided by \( m \)).  
   - This process continues until \( m \) becomes 0. At this point, \( n \) contains the GCD.  

2. **Steps**:  
   - Store \( m \) in a temporary variable `temp`.  
   - Update \( m \) with the remainder \( n \% m \).  
   - Update \( n \) with the value stored in `temp`.  
   - Repeat until \( m = 0 \).  

---

## Sample Input and Output 📊  

### **Input**:  
```  
n = 56  
m = 98  
```  

### **Output**:  
```  
14  
```  

### **Explanation**:  
- \( 98 \mod 56 = 42 \). Replace \( n = 56 \) and \( m = 42 \).  
- \( 56 \mod 42 = 14 \). Replace \( n = 42 \) and \( m = 14 \).  
- \( 42 \mod 14 = 0 \). Replace \( n = 14 \) and \( m = 0 \).  
- GCD is \( 14 \).  

---

## Key Learnings ✨  

- **Euclidean Algorithm**: A simple and efficient method to calculate the GCD.  
- **Modulus Operator**: Essential for finding the remainder in integer division.  
- **Iterative Logic**: Helps avoid recursion and stack overflow for large inputs.  

---  

