# Day 4: Prime Number Checker  

## Problem Description 📝  

Write a program to check whether a given number \( n \) is **prime** or not.  

A number is **prime** if it is greater than 1 and divisible only by 1 and itself.  

For example:  
- \( n = 2 \) → Prime  
- \( n = 4 \) → Not Prime  

The program should output **"YES"** if the number is prime and **"NO"** otherwise.  

---

## Implementation Details 💻  

### **Function**:  
```java  
public static boolean isPrime(int n)  
```  

- **Parameters**:  
  - `n`: An integer to check for primality.  

- **Returns**:  
  - `true` if \( n \) is a prime number.  
  - `false` if \( n \) is not a prime number.  

---

## Explanation of the Code 🧑‍💻  

1. **Handle Special Cases**:  
   - Numbers \( n \leq 1 \) are not prime, so return `false` immediately.  

2. **Efficient Divisor Check**:  
   - Loop through potential divisors from 2 to \( \sqrt{n} \).  
   - If \( n \) is divisible by any of these numbers, it's not prime, and return `false`.  
   - The loop condition \( i \times i \leq n \) ensures efficiency, as factors repeat beyond \( \sqrt{n} \).  

3. **Return Prime Status**:  
   - If no divisors are found in the loop, return `true`, indicating \( n \) is prime.  

4. **Main Method**:  
   - Tests the `isPrime` function with an example input.  
   - Outputs "YES" if \( n \) is prime and "NO" otherwise.  

---

## Sample Input and Output 📊  

### **Input**:  
```  
5  
```  

### **Output**:  
```  
YES  
```  

### **Explanation**:  
- \( n = 5 \) → Divisible only by 1 and 5.  
- Output: **YES**.  

---

## Key Learnings ✨  

- **Prime Number Logic**: A prime number has exactly two factors: 1 and itself.  
- **Optimization Using \( \sqrt{n} \)**: Reduces the number of divisor checks for efficiency.  
- **Boolean Logic**: Returns `true` or `false` based on conditions, enabling easy integration into larger programs.  

---  
