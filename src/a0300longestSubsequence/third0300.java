package a0300longestSubsequence;

public class third0300 {
    public static int lengthOfLIS(int[] nums) {
        int n=nums.length;
        if (n<1)
            return 0;
        int len=1;
        int[] dp=new int[n+1];
        dp[1]=nums[0];
        for (int i=1;i<n;i++){
            if (nums[i]>dp[len]){
                len++;
                dp[len]=nums[i];
            }else{
                int left=0,right=len;
                while (left<right){
                    int mid=(left+right+1)/2;
                    if (nums[i]<dp[mid]&&mid-1>=0&&nums[i]>dp[mid-1]){
                        dp[mid]=nums[i];
                        break;
                    }else if (nums[i]>dp[mid]){
                        left=mid;
                    }else if (nums[i]<dp[mid]){
                        right=mid-1;
                    }else {
                        break;
                    }
                }
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] n={-1,-2,-3,-4};
        System.out.println(lengthOfLIS(n));
    }
}
