package a0020validParentheses;

import java.util.Stack;

public class second0020 {
    public boolean isValid(String s) {
        if ((s.length()&1)==1)
            return false;
        Stack<Character> stack=new Stack<>();
        for (char ch:s.toCharArray()){
            switch (ch){
                case '(':
                case '{':
                case '[':
                    stack.push(ch);
                    break;
                case ')':
                    if (stack.isEmpty()||stack.pop()!='(')
                        return false;
                    break;
                case ']':
                    if (stack.isEmpty()||stack.pop()!='[')
                        return false;
                    break;
                case '}':
                    if (stack.isEmpty()||stack.pop()!='{')
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
