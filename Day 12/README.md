# Day 12: Add One to a Number

## Problem Description 📝

Given a number represented as an **array of digits**, write a program to **add 1** to the number. The number is stored in the array where each element is a digit, and the most significant digit is at the front of the array.

### Example:

- **Input**:  
    ```  
    arr = [1, 2, 3]  
    ```

- **Output**:  
    ```  
    [1, 2, 4]
    ```

---

## Implementation Details 💻  

### **Function**:  
```java  
public static ArrayList<Integer> addOneToNumber(ArrayList<Integer> arr)
```  

- **Parameters**:  
  - `arr`: An `ArrayList<Integer>` containing the digits of the number.  

- **Returns**:  
  - An `ArrayList<Integer>` representing the number after adding 1.  

---

## Explanation of the Code 🧑‍💻  

1. **Initial Carry**:  
   - Start by initializing a `carry` variable as `1` since we are adding one to the number.

2. **Traverse the Array in Reverse**:  
   - Traverse the array from the least significant digit (rightmost) to the most significant digit (leftmost).
   - Add the `carry` to each digit. The new digit is obtained using `sum % 10` (to handle carryover). Update the digit in the array.
   - Update the `carry` to `sum / 10` to determine whether there is any carry to propagate to the next significant digit.

3. **Handle Extra Carry**:  
   - If, after processing all the digits, a carry remains (i.e., the number has grown in size), add `carry` to the front of the array.

4. **Remove Leading Zeros**:  
   - If there are leading zeros in the array (which can happen when the result is smaller than expected), remove them by checking the first element and removing it if it is zero.

5. **Time Complexity**:  
   - The time complexity of the solution is **O(n)**, where `n` is the size of the array. We perform one pass through the array and possibly an additional check to remove leading zeros.

---

## Sample Input and Output 📊  

### **Input 1**:  
```  
arr = [1, 2, 3]
```  

### **Output 1**:  
```  
[1, 2, 4]
```  

### **Explanation**:  
- The number represented by the array is `123`. After adding 1, it becomes `124`, and the output is `[1, 2, 4]`.

### **Input 2**:  
```  
arr = [9, 9, 9]
```  

### **Output 2**:  
```  
[1, 0, 0, 0]
```  

### **Explanation**:  
- The number represented by the array is `999`. After adding 1, it becomes `1000`, and the output is `[1, 0, 0, 0]`.

### **Input 3**:  
```  
arr = [0]
```  

### **Output 3**:  
```  
[1]
```  

### **Explanation**:  
- The number represented by the array is `0`. After adding 1, the output is `[1]`.

---

## Key Learnings ✨  

- **Handling Carries**: This problem demonstrates how to handle carry operations when adding numbers, particularly when the sum exceeds 9.
- **Leading Zeros**: A useful trick is to remove leading zeros, which may appear when the number grows (e.g., adding 1 to `999` results in `1000`).
- **Efficient Array Manipulation**: The program uses an `ArrayList` to dynamically adjust the number size.

---
