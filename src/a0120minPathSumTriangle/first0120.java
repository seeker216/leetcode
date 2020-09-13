package a0120minPathSumTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class first0120 {
    public static void main(String[] args) {
        List<List<Integer>> tr=new ArrayList<>();
        tr.add(new ArrayList<>(Arrays.asList(2)));
        tr.add(new ArrayList<>(Arrays.asList(3,4)));
        tr.add(new ArrayList<>(Arrays.asList(6,5,7)));
        tr.add(new ArrayList<>(Arrays.asList(4,1,8,3)));
        System.out.println(new Solution2().minimumTotal(tr));
    }
}
class Solution {
    /*
    dp+n^2空间复杂度
     */
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        if (m<1)
            return 0;
        int n=triangle.get(m-1).size();
        if (n<1){
            return 0;
        }
        int[][] dp=new int[m][n];
        for (int i=0;i<m;i++){
            Arrays.fill(dp[i],Integer.MAX_VALUE);
        }
        dp[0][0]=triangle.get(0).get(0);
        for (int i=1;i<m;i++){
            dp[i][0]=dp[i-1][0]+triangle.get(i).get(0);
        }
        for (int i=1;i<m;i++){
            for (int j=1;j<triangle.get(i).size();j++){
                dp[i][j]=Math.min(dp[i-1][j],dp[i-1][j-1])+triangle.get(i).get(j);
            }
        }
        int ans=dp[m-1][0];
        for (int i=1;i<n;i++){
            ans=Math.min(ans,dp[m-1][i]);
        }
        return ans;
    }
}