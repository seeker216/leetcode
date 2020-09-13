package a0072editDistance;

public class first0072 {
    public static int minDistance(String word1, String word2) {
        int len1=word1.length(),len2=word2.length();
        //如果有一个串为0
        if (len1==0||len2==0)
            return len1+len2;
        int[][] dp=new int[len1+1][len2+1];
        for (int i=0;i<len1+1;i++){
            dp[i][0]=i;
        }
        for (int j=0;j<len2+1;j++){
            dp[0][j]=j;
        }
        for (int i=1;i<len1+1;i++){
            for (int j=1;j<len2+1;j++){
                if (word1.charAt(i-1)==word2.charAt(j-1)){
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]-1));
                }else{
                    dp[i][j]=1+Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]));
                }
            }
        }
        return dp[len1][len2];
    }

    public static void main(String[] args) {
        System.out.println(minDistance("wcnm","nmsl"));
    }
}
