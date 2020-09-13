package a0032longestValidParentheses;

import java.util.Stack;

public class second0032 {
    /**
     * 栈做法
     * @param s
     * @return
     */
    public static int longestValidParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        stack.push(-1);
        int ans=0,n=s.length();
        for (int i=0;i<n;i++){
            if (s.charAt(i)=='(')
                stack.push(i);
            else{
                stack.pop();
                if (stack.empty())
                    stack.push(i);
                else
                    ans=Math.max(ans,i-stack.peek());
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(longestValidParentheses(")()())"));
    }
}
