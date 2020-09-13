package a0055jumpGame;

public class second0055 {
    /**
     * 贪心算法，只找最大
     * @param nums
     * @return
     */
    public static boolean canJump(int[] nums) {
        int n=nums.length;
        int rightMax=0;
        for (int i=0;i<n;i++) {
            if (i<=rightMax){
                rightMax=Math.max(rightMax,i+nums[i]);
                if (rightMax>=n-1)
                    return true;
            }
        }
        return false;
    }
}
