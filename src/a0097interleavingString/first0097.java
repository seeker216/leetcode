package a0097interleavingString;

public class first0097 {
    public static void main(String[] args) {
        String s1="aabcc",s2="dbbca",s3="aadbbcbcac";
        System.out.println(new Solution().isInterleave(s1,s2,s3));
    }
}
class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        int len1=s1.length(),len2=s2.length(),len3=s3.length();
        if (len1+len2!=len3)
            return false;
        boolean[][] dp=new boolean[len1+1][len2+1];
        dp[0][0]=true;
        for (int i=0;i<=len1;i++){
            for (int j=0;j<=len2;j++){
                int p=i+j-1;
                if (i>0){
                    dp[i][j]=dp[i][j]||(dp[i-1][j]&&s1.charAt(i-1)==s3.charAt(p));
                }
                if (j>0){
                    dp[i][j]=dp[i][j]||(dp[i][j-1]&&s2.charAt(j-1)==s3.charAt(p));
                }
            }
        }
        return dp[len1][len2];
    }
}