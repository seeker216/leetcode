package a0042trappingRain;

public class fourth0042 {
    /**
     * 双指针做法，从数组两端开始寻找，如果h[l]<h[r]就看是否能更新leftmax；否则就看能否更新rightmax
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int ans=0;
        int left=0,right=height.length-1;
        int leftMax=0,rightMax=0;
        while (left<right){
            leftMax=Math.max(height[left],leftMax);
            rightMax=Math.max(height[right],rightMax);
            if (height[left]<height[right]){
                ans+=leftMax-height[left];
                left++;
            }else {
                ans+=rightMax-height[right];
                right--;
            }
        }
        return ans;
    }
}
