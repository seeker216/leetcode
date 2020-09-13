package a0010reMatch;

public class second0010 {
    /**
     * 动态规划法
     * @param s
     * @param p
     * @return
     */
    public static boolean isMatch(String s, String p) {
        boolean[][] dp=new boolean[s.length()+1][p.length()+1];
        dp[s.length()][p.length()]=true;
        for (int i=s.length();i>=0;i--){
            for (int j=p.length()-1;j>=0;j--){
                boolean firstMath=(i<s.length()&&(s.charAt(i)==p.charAt(j)||p.charAt(j)=='.'));
                if (j<p.length()-1&&p.charAt(j+1)=='*')
                    dp[i][j]=dp[i][j+2]||(firstMath&&dp[i+1][j]);
                else
                    dp[i][j]=firstMath&&dp[i+1][j+1];
            }
        }
        return dp[0][0];
    }

    public static void main(String[] args) {
        String s1="aa";
        String s2="a";
        System.out.println(isMatch(s1,s2));
    }
}
