import java.util.Stack;

public class Solution {
    public static boolean isValidParenthesis(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // If it's an opening bracket, push it onto the stack
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // If it's a closing bracket
            else {
                // If stack is empty or the top of the stack doesn't match, it's not balanced
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        // If the stack is empty, all brackets were matched
        return stack.isEmpty();
    }
}