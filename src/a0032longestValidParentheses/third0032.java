package a0032longestValidParentheses;

public class third0032 {
    public static int longestValidParentheses(String s) {
        int n=s.length(),ans=0;
        int[] dp=new int[n];
        dp[0]=0;
        for (int i=1;i<n;i++){
            if (s.charAt(i)==')'&&s.charAt(i-1)=='(')
                dp[i]=i>=2?dp[i-2]+2:2;
            else if (s.charAt(i)==')'&&s.charAt(i-1)==')')
                dp[i]=dp[i-1]+(i-dp[i-1])>=2?dp[i-dp[i-1]-2]+2:2;
            else
                dp[i]=0;
            ans= Math.max(ans,dp[i]);
        }
        return ans;
    }
}
