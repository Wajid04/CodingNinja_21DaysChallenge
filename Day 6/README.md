# Day 6: Reverse a Number  

## Problem Description 📝  

Write a program to reverse the digits of a given number \( n \).  

For example:  
- Input: \( n = 123 \) → Output: **321**  
- Input: \( n = 4001 \) → Output: **1004**  

The program should handle positive integers only.  

---  

## Implementation Details 💻  

### **Function**:  
```java  
public static int reverseNumber(int n)  
```  

- **Parameters**:  
  - `n`: An integer \( n \) whose digits need to be reversed.  

- **Returns**:  
  - The integer obtained by reversing the digits of \( n \).  

---

## Explanation of the Code 🧑‍💻  

1. **Initialize `reversed` to 0**:  
   - This variable stores the reversed number.  

2. **Extract and Append Digits**:  
   - Use `n % 10` to extract the last digit of \( n \).  
   - Multiply `reversed` by 10 and add the extracted digit to append it.  

3. **Reduce `n`**:  
   - Divide \( n \) by 10 to remove the last digit.  

4. **Repeat Until \( n = 0 \)**:  
   - Continue extracting and appending digits until \( n \) becomes 0.  

5. **Return the Reversed Number**:  
   - Once all digits are processed, return `reversed`.  

6. **Main Method**:  
   - Example test case with \( n = 123 \).  
   - Prints `321`, the reversed number.  

---

## Sample Input and Output 📊  

### **Input**:  
```  
n = 123  
```  

### **Output**:  
```  
321  
```  

### **Explanation**:  
- Digits are extracted and appended in reverse order: \( 3 \), \( 2 \), \( 1 \).  
- Final reversed number is \( 321 \).  

---

## Key Learnings ✨  

- **Digit Extraction**: Using `% 10` to isolate the last digit of a number.  
- **Reversing Logic**: Building a new number by appending digits in reverse order.  
- **Efficient Use of Loops**: Ensures minimal iterations proportional to the number of digits.  

---  

