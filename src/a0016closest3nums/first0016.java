package a0016closest3nums;

import java.util.Arrays;

public class first0016 {
    public static void main(String[] args) {
        System.out.println(new Solution().threeSumClosest(new int[]{-1,2,1,4},1));
    }
}
class Solution {
    /*
    排序+双指针
     */
    public int threeSumClosest(int[] nums, int target) {
        int len=nums.length;
        int min=Integer.MAX_VALUE;
        int ans=0;
        Arrays.sort(nums);
        for (int i=0;i<len;i++){
            int left=i+1,right=len-1;
            while (left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if (Math.abs(sum-target)<min) {
                    min = Math.abs(sum-target);
                    ans = sum;
                }else if (sum<target){
                    left++;
                }else {
                    right--;
                }
            }
        }
        return ans;
    }
}