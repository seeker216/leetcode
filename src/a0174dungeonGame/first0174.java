package a0174dungeonGame;

import java.util.Arrays;

public class first0174 {
    public static void main(String[] args) {
        int[][] d=new int[][]{{-2,-3,3},{-5,-10,1},{10,30,-5}};
        System.out.println(new Solution().calculateMinimumHP(d));
    }
}
class Solution {
    public int calculateMinimumHP(int[][] dungeon) {
        int row=dungeon.length;
        int col=dungeon[0].length;
        int[][] dp=new int[row+1][col+1];
        for(int i=0;i<=row;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        dp[row-1][col]=dp[row][col-1]=1;
        for (int i=row-1;i>=0;i--){
            for (int j=col-1;j>=0;j--){
                int minn=Math.min(dp[i+1][j],dp[i][j+1]);
                dp[i][j]=Math.max(minn-dungeon[i][j],1);
            }
        }
        return dp[0][0];
    }


}