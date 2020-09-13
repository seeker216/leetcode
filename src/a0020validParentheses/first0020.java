package a0020validParentheses;

import java.util.Stack;

public class first0020 {
    public boolean isValid(String s) {
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length();i++){
            switch (s.charAt(i)){
                case '(':
                case '[':
                case '{':
                    stack.push(s.charAt(i));
                    break;
                case ')':
                    if (!stack.isEmpty()&&stack.peek()=='(')
                        stack.pop();
                    else
                        return false;
                    break;
                case '}':
                    if (!stack.isEmpty()&&stack.peek()=='{')
                        stack.pop();
                    else
                        return false;
                    break;
                case ']':
                    if (!stack.isEmpty()&&stack.peek()=='[')
                        stack.pop();
                    else
                        return false;
                    break;
            }
        }
        if (stack.isEmpty())
            return true;
        return false;
    }
}
