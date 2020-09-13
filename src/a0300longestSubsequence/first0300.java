package a0300longestSubsequence;

import java.util.Arrays;
import java.util.Collections;

public class first0300 {
    /**
     * 动态规划法
     * dp[i]保存以nums[i]结尾的最长上升子序列的长度
     * dp[i]=max(j=0...i-1)dp[j]+1
     * @param nums
     * @return
     */
    public static int lengthOfLIS(int[] nums) {
        if (nums.length<1)
            return 0;
        Integer[] dp=new Integer[nums.length];
        dp[0]=1;
        for (int i=0;i<nums.length;i++){
            int max=0;
            for (int j=0;j<i;j++){
                if (dp[j]>max&&nums[j]<nums[i])
                    max=dp[j];
            }
            dp[i]=max+1;
        }
        return Collections.max(Arrays.asList(dp));
    }
}
