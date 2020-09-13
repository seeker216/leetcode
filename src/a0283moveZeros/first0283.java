package a0283moveZeros;

public class first0283 {
    public static void main(String[] args) {
        int[] nums=new int[]{0,0,0};
        new Solution().moveZeroes(nums);
    }
}
class Solution {
    /*
    自己的双指针
     */
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        int fast=0,slow=0;
        while (true){
            while (fast<len&&nums[fast]==0){
                fast++;
            }
            while (slow<len&&nums[slow]!=0){
                slow++;
            }
            if (fast>=len||slow>=len)
                return;
            if (fast>slow){
                int tmp=nums[slow];
                nums[slow]=nums[fast];
                nums[fast]=tmp;
            }else if (fast<slow){
                fast++;
            }
        }
    }
}