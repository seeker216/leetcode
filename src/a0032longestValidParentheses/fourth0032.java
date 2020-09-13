package a0032longestValidParentheses;

public class fourth0032 {
}
class Solution {
    public int longestValidParentheses(String s) {
        int ans=0;
        int left=0,right=0;
        int len=s.length();
        for (int i=0;i<len;i++){
            if (s.charAt(i)=='('){
                left++;
            }else if (s.charAt(i)==')'){
                right++;
            }
            if (left==right){
                ans=Math.max(ans,left+right);
            }
            if (right>left){
                left=right=0;
            }
        }
        left=right=0;
        for (int i=len-1;i>=0;i--){
            if (s.charAt(i)=='('){
                left++;
            }else if (s.charAt(i)==')'){
                right++;
            }
            if (left==right){
                ans=Math.max(ans,left+right);
            }
            if (right<left){
                left=right=0;
            }
        }
        return ans;
    }
}