# Day 16: Validating Parentheses using Stack

## Problem Description 📝

You are given a string `s` consisting of characters `(`, `)`, `{`, `}`, `[` and `]`. The task is to determine if the input string is valid, i.e., if the parentheses are balanced. A string is considered valid if:

- Every opening bracket has a corresponding closing bracket.
- The brackets must be closed in the correct order. (e.g., `{[()]}` is valid, but `{[(])}` is not).

---

### Example:

#### **Example 1**:

- **Input**:  
  ```  
  s = "()"  
  ```

- **Output**:  
  ```  
  true  
  ```

  **Explanation**: The parentheses are correctly balanced.

---

#### **Example 2**:

- **Input**:  
  ```  
  s = "()[]{}"  
  ```

- **Output**:  
  ```  
  true  
  ```

  **Explanation**: The parentheses, brackets, and curly braces are all correctly balanced.

---

#### **Example 3**:

- **Input**:  
  ```  
  s = "(]"  
  ```

- **Output**:  
  ```  
  false  
  ```

  **Explanation**: The parentheses are not balanced because `[` and `]` are mismatched.

---

## Function Definition 📦

### **Function**:  
```java
public static boolean isValidParenthesis(String s)
```

- **Parameters**:
  - `s`: A string containing parentheses (`()`, `{}`, `[]`).

- **Return Value**:
  - Returns `true` if the string is valid, otherwise returns `false`.

---

## Algorithm Explanation 🚀

1. **Initialize a Stack**:
   - Use a stack to keep track of the opening brackets. The stack will help us match each opening bracket with its corresponding closing bracket.

2. **Iterate through the String**:
   - For each character `c` in the string:
     - If `c` is an opening bracket (`'('`, `'{'`, `'['`), push it onto the stack.
     - If `c` is a closing bracket (`')'`, `'}'`, `']'`):
       - Check if the stack is empty (i.e., no opening bracket is available to match). If it’s empty, return `false`.
       - Otherwise, pop the top element from the stack and check if it matches the current closing bracket. If it doesn’t match, return `false`.

3. **Check for Remaining Open Brackets**:
   - After processing all characters in the string, if the stack is empty, it means all the brackets are correctly matched and closed, so return `true`.
   - If the stack is not empty, return `false` as there are unmatched opening brackets.

---

## Time Complexity ⏱️

- **Time Complexity**:  
  - **O(n)**, where `n` is the length of the string `s`. We iterate through the string once and perform constant-time operations (push, pop, peek) for each character.

- **Space Complexity**:  
  - **O(n)** in the worst case, where the stack stores all opening brackets if they are unbalanced.

---

## Sample Input and Output 📊

### **Input 1**:  
```  
s = "()"
```

### **Output 1**:  
```  
true
```

### **Input 2**:  
```  
s = "()[]{}"
```

### **Output 2**:  
```  
true
```

### **Input 3**:  
```  
s = "(]"
```

### **Output 3**:  
```  
false
```

---

## Key Learnings ✨

1. **Stack Usage**:
   - The stack is a perfect data structure for problems involving matching pairs or checking balanced structures. It works efficiently for problems where elements need to be processed in a Last In First Out (LIFO) manner.
   
2. **Algorithm Design**:
   - The problem is solved efficiently in linear time using a stack, making it ideal for checking bracket validity in strings.
   
3. **Edge Cases**:
   - Consider cases like an empty string or mismatched brackets (e.g., `[{]}`), which can be easily handled using the stack-based approach.

---

