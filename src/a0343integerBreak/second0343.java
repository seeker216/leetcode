package a0343integerBreak;

public class second0343 {
    public static void main(String[] args) {
        System.out.println(new Solution2().integerBreak(7));
    }
}
class Solution2 {
    /*
    dp
     */
    public int integerBreak(int n) {
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=0;
        for(int i=2;i<=n;i++){
            for (int j=1;j<i;j++){
                dp[i]=Math.max(i*(i-j),i*dp[i-j]);
            }
        }
        return dp[n];
    }
}