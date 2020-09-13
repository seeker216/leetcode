package a0042trappingRain;

import java.util.Stack;

public class first0042 {
    /**
     * 暴力法，从每个位置往两边扫描，在两边各找一个比该位置值大的最大值，则该位置能存的水就是两个最大值中的较小值减去该位置的值。
     * @param height
     * @return
     */
    public static int trap(int[] height) {
        int ans=0;
        for (int i=0;i<height.length;i++){
            int leftMax=height[i],rightMax=height[i];
            for (int left=i-1;left>=0;left--){
                leftMax=Math.max(leftMax,height[left]);
            }
            for (int right=i+1;right<height.length;right++){
                rightMax=Math.max(rightMax,height[right]);
            }
            ans+=(Math.min(leftMax,rightMax)-height[i]);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] h=new int[]{4,2,3};
        System.out.println(trap(h));
    }
}
