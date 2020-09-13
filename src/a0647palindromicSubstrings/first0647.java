package a0647palindromicSubstrings;

public class first0647 {
    public static void main(String[] args) {
        System.out.println(new Solution().countSubstrings("aaa"));
    }
}
class Solution {
    int ans=0;

    public int countSubstrings(String s) {
        int len=s.length();
        for (int i=0;i<len;i++){
            extendFromCenter(s,i,i);
            extendFromCenter(s,i,i+1);

        }
        return ans;
    }

    private void extendFromCenter(String s, int left, int right) {
        while (left>=0&&right<s.length()) {
            if (s.charAt(left)==s.charAt(right)){
                ans++;
                left--;
                right++;
            }else {
                return;
            }
        }
    }
}