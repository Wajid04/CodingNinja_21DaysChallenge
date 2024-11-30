# Day 10: Get the Most and Least Frequent Elements

## Problem Description 📝  

Write a program to find the **most frequent** and **least frequent** elements in an array of integers.  
If there are multiple elements with the same frequency, choose the **smallest** element among them.

### Example:  
- **Input**:  
    ```  
    v = [3, 1, 2, 1, 2, 2, 3, 3, 3]  
    ```  
- **Output**:  
    ```  
    Most Frequent: 3  
    Least Frequent: 1  
    ```  

---

## Implementation Details 💻  

### **Function**:  
```java  
public static int[] getFrequencies(int[] v)  
```  

- **Parameters**:  
  - `v`: An array of integers.  

- **Returns**:  
  - An array of two integers:  
    - The element with the highest frequency.  
    - The element with the lowest frequency.  

---

## Explanation of the Code 🧑‍💻  

1. **Sort the Array**:  
   - The array is first sorted to group identical elements together. Sorting helps in easily counting the frequency of each element.

2. **Initialize Variables**:  
   - `highestFrequency` and `lowestFrequency` track the highest and lowest frequencies encountered.
   - `highestFrequencyElement` and `lowestFrequencyElement` store the elements corresponding to those frequencies.

3. **Iterate Through the Array**:  
   - The loop iterates through the array and counts the frequency of each element.
   - If the current element is the same as the previous one, its frequency is incremented.
   - If the element changes, compare its frequency with the current highest and lowest frequencies.
   
4. **Update Frequencies**:  
   - When a frequency change is detected, update the highest and lowest frequency elements.  
   - If multiple elements have the same frequency, the smaller element is chosen (by comparing the current element).

5. **Return the Result**:  
   - Return an array containing the most frequent and least frequent elements.  

---

## Sample Input and Output 📊  

### **Input**:  
```  
v = [3, 1, 2, 1, 2, 2, 3, 3, 3]  
```  

### **Output**:  
```  
Most Frequent: 3  
Least Frequent: 1  
```  

### **Explanation**:  
- The element `3` appears 4 times (most frequent).  
- The element `1` appears 2 times (least frequent).  

---

## Key Learnings ✨  

- **Sorting for Frequency Calculation**: Sorting the array makes it easier to group and count frequencies.  
- **Efficient Frequency Comparison**: The code efficiently keeps track of the highest and lowest frequencies while iterating through the sorted array.  
- **Edge Cases Handling**: The code handles arrays with elements having equal frequencies and ensures the smallest element is selected in case of ties.

---
