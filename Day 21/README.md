# Day 21: Count Inversions in an Array

## Problem Description 📝

An **inversion** in an array `a` is a pair of indices `(i, j)` such that:
- `i < j` and 
- `a[i] > a[j]`.

Write a program to count the total number of inversions in an array.

---

### Example:

#### **Example 1**:

- **Input**:  
  `a = [2, 4, 1, 3, 5]`, `n = 5`

- **Output**:  
  `3`

- **Explanation**:  
  - Inversions are: `(2, 1)`, `(4, 1)`, `(4, 3)`.
  - Total count = 3.

---

#### **Example 2**:

- **Input**:  
  `a = [1, 2, 3, 4, 5]`, `n = 5`

- **Output**:  
  `0`

- **Explanation**:  
  - The array is already sorted, so there are no inversions.

---

## Function Definition 📦

### **Function**:  
```java
public static int numberOfInversions(int[] a, int n)
```

- **Parameters**:
  - `a`: An integer array.
  - `n`: The size of the array.

- **Return Value**:
  - Returns an integer representing the total number of inversions in the array.

---

## Algorithm Explanation 🚀

The solution uses **Merge Sort** to count inversions efficiently. This approach takes advantage of the sorting process to count how many elements in the left half are greater than elements in the right half.

### Steps:

1. **Recursive Divide**:
   - Divide the array into two halves recursively using merge sort.

2. **Count Inversions in Halves**:
   - Count the inversions in the left half and the right half separately.

3. **Count Split Inversions**:
   - During the merge step, count the "split inversions" where an element from the left half is greater than an element in the right half.

4. **Merge the Halves**:
   - While merging, keep the array sorted.

### Key Observation:
- When merging, if `a[i] > a[j]`, then all elements from `i` to `mid` (inclusive) will form an inversion with `a[j]` because the array is sorted in both halves.

---

## Code Walkthrough 🛠️

### Helper Functions:

#### `mergeSortAndCount`:
- Recursively divides the array and counts inversions in the left and right halves.
- Calls the `mergeAndCount` function to count split inversions.

#### `mergeAndCount`:
- Merges two sorted halves while counting inversions.

---

## Time Complexity ⏱️

- **Time Complexity**:
  - The function runs in **O(n log n)** because merge sort divides the array into halves recursively (`log n`) and merges (`O(n)`).

- **Space Complexity**:
  - **O(n)**: Temporary array `temp` is used for merging.

---

## Sample Input and Output 📊

### **Input 1**:  
```  
a = [8, 4, 2, 1], n = 4
```

### **Output 1**:  
```  
6
```

**Explanation**:  
- Inversions are: `(8, 4)`, `(8, 2)`, `(8, 1)`, `(4, 2)`, `(4, 1)`, `(2, 1)`.  
- Total = 6.

---

### **Input 2**:  
```  
a = [1, 2, 3, 4, 5], n = 5
```

### **Output 2**:  
```  
0
```

---

## Key Learnings ✨

1. **Divide and Conquer**:
   - Leveraging merge sort for inversion counting is a powerful example of applying the divide-and-conquer paradigm.

2. **Efficiency Over Brute Force**:
   - A brute force solution would take **O(n²)** time, while this approach reduces the complexity to **O(n log n)**.

3. **Inversions as a Sorting Metric**:
   - Counting inversions can also measure how "far" an array is from being sorted.

---

