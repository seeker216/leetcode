package a0041firstMissingPositive;

public class second0041 {
    public static void main(String[] args) {
        System.out.println(new Solution2().firstMissingPositive(new int[]{1,1}));
    }
}
class Solution2 {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for (int i=0;i<n;i++){
            nums[i]=nums[i]<=0?n+1:nums[i];
        }
        for (int i=0;i<n;i++){
            if (Math.abs(nums[i])<=n&&nums[Math.abs(nums[i])-1]>0){
                nums[Math.abs(nums[i])-1]=-nums[Math.abs(nums[i])-1];
            }
        }
        for (int i=0;i<n;i++){
            if (nums[i]>0)
                return i+1;
        }
        return n+1;
    }
}