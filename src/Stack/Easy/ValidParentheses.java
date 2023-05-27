package Stack.Easy;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()) {
            if (c == '(') stack.push(')');
            else if (c == '[') stack.push(']');
            else if (c == '{') stack.push('}');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        System.out.println(stack);
        return stack.isEmpty();
    }

    public static void main(String[] args) {
       boolean isValid = isValid("([)]");
        System.out.println(isValid);
    }
}
