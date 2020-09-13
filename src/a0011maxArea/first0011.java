package a0011maxArea;

public class first0011 {
    public int maxArea(int[] height) {
        int max=0;
        int left=0,right=height.length-1;
        while (left<right){
            int area=(right-left)*Math.min(height[left],height[right]);
            if (area>max)
                max=area;
            if (height[left]>height[right])
                right--;
            else
                left++;
        }
        return max;
    }
}
