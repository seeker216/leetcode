package a0198houseRobber;

public class second0198 {
}
class Solution {
    /*
    滚动数组法，O(1)空间复杂度
     */
    public int rob(int[] nums) {
        int n=nums.length;
        if (n==0)
            return 0;
        if (n==1)
            return nums[0];
        int first=nums[0],second=Math.max(nums[0],nums[1]);
        for(int i=2;i<n;i++){
            int tmp=second;
            second=Math.max(first+nums[i],second);
            first=tmp;
        }
        return second;
    }
}