package a0032longestValidParentheses;

import java.util.Stack;

public class first0032 {
    /**
     * 暴力
     * @param s
     * @return
     */
    public static int longestValidParentheses(String s) {
        int n=s.length();
        int ans=0;
        for (int i=0;i<n;i++){
            for (int j=i+2;j<=n;j++){
                if (isValid(s.substring(i,j))){
                    if (j-i>ans)
                        ans=j-i;
                }
            }
        }
        return ans;
    }
    static boolean isValid(String s) {
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

    public static void main(String[] args) {
        System.out.println(longestValidParentheses("()(())"));
    }
}
