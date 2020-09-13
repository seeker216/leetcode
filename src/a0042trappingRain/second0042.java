package a0042trappingRain;

public class second0042 {
    /**
     * 暴力解法的动态规划改良版，先扫描两趟，把每个位置左边的最大值和右边的最大值确定，再走一趟计算每个位置的存水量。
     * @param height
     * @return
     */
    public int trap(int[] height) {
        if (height.length<1)
            return 0;
        int ans=0;
        int[] leftMax=new int[height.length];
        int[] rightMax=new int[height.length];
        leftMax[0]=height[0];
        rightMax[height.length-1]=height[height.length-1];
        for (int i=1;i<height.length;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        for (int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }
        for (int i=0;i<height.length;i++){
            ans+=(Math.min(leftMax[i],rightMax[i])-height[i]);
        }
        return ans;
    }
}
