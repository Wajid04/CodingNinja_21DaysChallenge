# Day 1: Calculate Area Using Switch-Case  

## Problem Description 📝  

Write a program to calculate the area of different geometric shapes based on user input. The program should use a **switch-case** structure to determine the formula for the area based on the user's choice:  

1. **Circle**: The area is calculated using the formula:  
   
   Area of Circle = pi times r^2
     
   where( r) is the radius of the circle.  

2. **Rectangle**: The area is calculated using the formula:  

Area of Rectangle =l*b
  
   where( l) is the length and( b) is the breadth of the rectangle.  

---

## Implementation Details 💻  

### **Function**:  
```java  
public static double areaSwitchCase(int ch, double[] a)  
```  

- **Parameters**:  
  - `ch`: An integer representing the choice of shape (1 for Circle, 2 for Rectangle).  
  - `a`: A double array containing the required dimensions:  
    - For a circle: `a[0]` is the radius.  
    - For a rectangle: `a[0]` is the length, and `a[1]` is the breadth.  

- **Returns**:  
  - The area of the selected shape as a double.  

---

## Explanation of the Code 🧑‍💻  

1. **Switch-Case Structure**:  
   - `case 1`: Computes the area of a circle using \( \pi \times r^2 \).  
   - `case 2`: Computes the area of a rectangle using \( l \times b \).  
   - `default`: Prints an error message for invalid input.  

2. **Main Method**:  
   - Two example test cases are provided:  
     - **Circle** with radius 3.  
     - **Rectangle** with length 3 and breadth 2.  
   - Outputs the calculated area with 5 decimal precision using `printf`.  

---

## Sample Output 📊  

```  
28.27433  // Area of circle with radius 3  
6.00000   // Area of rectangle with length 3 and breadth 2  
```  

---

## Key Learnings ✨  

- **Switch-Case Statements**: Efficiently handles multiple cases based on user input.  
- **Math.PI and Math.pow**: Utilized for precise mathematical calculations in Java.  
- **Code Modularity**: The `areaSwitchCase` method makes the code reusable and testable.  

---

