# Day 7: Reverse an Array  

## Problem Description 📝  

Write a program to reverse the elements of a given array. The input array should be reversed such that the first element becomes the last, the second becomes the second last, and so on.  

For example:  
- Input: \( nums = [1, 2, 3, 4, 5] \) → Output: \( [5, 4, 3, 2, 1] \)  

---  

## Implementation Details 💻  

### **Function**:  
```java  
public static int[] reverseArray(int n, int[] nums)  
```  

- **Parameters**:  
  - `n`: An integer representing the size of the array.  
  - `nums`: An integer array containing \( n \) elements.  

- **Returns**:  
  - A new array of size \( n \), which is the reverse of the input array.  

---

## Explanation of the Code 🧑‍💻  

1. **Create a New Array**:  
   - Declare an array `reversed` of size \( n \) to store the reversed elements.  

2. **Iterate Over the Input Array**:  
   - Loop from \( i = 0 \) to \( n - 1 \).  
   - For each element at index \( i \), assign the element from index \( n - 1 - i \) of the original array to the corresponding position in `reversed`.  

3. **Return the Reversed Array**:  
   - After populating `reversed`, return it.  

---

## Sample Input and Output 📊  

### **Input**:  
```  
n = 5  
nums = [1, 2, 3, 4, 5]  
```  

### **Output**:  
```  
[5, 4, 3, 2, 1]  
```  

### **Explanation**:  
- The first element \( 1 \) becomes the last, the second element \( 2 \) becomes the second last, and so on.  
- Final reversed array: \( [5, 4, 3, 2, 1] \).  

---

## Key Learnings ✨  

- **Reversing Logic**: Index manipulation using \( n - 1 - i \).  
- **Efficient Memory Use**: A separate array is used to ensure the input array remains unchanged.  
- **Array Traversal**: Basic loop iteration to access and modify array elements.  

---  

