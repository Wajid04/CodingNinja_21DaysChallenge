# Day 3: Count the Number of Digits  

## Problem Description 📝  

Write a program to **count the number of digits** in a given positive integer \( n \).  

For example:  
- If \( n = 1234 \), the number of digits is **4**.  
- If \( n = 1 \), the number of digits is **1**.  

---

## Implementation Details 💻  

### **Function**:  
```java  
public static int countDigits(int n)  
```  

- **Parameters**:  
  - `n`: A positive integer whose digits are to be counted.  

- **Returns**:  
  - The number of digits in the integer \( n \).  

---

## Explanation of the Code 🧑‍💻  

1. **Initialize Counter**:  
   - Start with a counter variable `count = 0`.  

2. **Loop Through Digits**:  
   - Use a `while` loop to repeatedly divide \( n \) by 10, effectively removing the last digit in each iteration.  
   - Increment `count` in each iteration to track how many digits have been removed.  

3. **Return Result**:  
   - Once \( n \) becomes 0 (all digits are processed), return the value of `count`, which represents the total number of digits.  

---

## Sample Input and Output 📊  

### **Input**:  
```  
12345  
```  

### **Output**:  
```  
5  
```  

### **Explanation**:  
- The digits in \( 12345 \) are: 1, 2, 3, 4, 5.  
- Total count = **5**.  

---

## Key Learnings ✨  

- **Integer Division**: Dividing an integer by 10 removes its last digit.  
- **Looping Logic**: Use a `while` loop to process each digit until the number becomes 0.  
- **Counting Digits**: A straightforward method to calculate the number of digits in an integer.  

---  

