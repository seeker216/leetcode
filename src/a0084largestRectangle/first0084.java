package a0084largestRectangle;

import java.util.Stack;

public class first0084 {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] a=new int[]{2,1,5,6,2,3};
        System.out.println(solution.largestRectangleArea(a));
    }
}

class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        if(n==0)
            return 0;
        if (n==1)
            return heights[0];
        Stack<Integer> stack=new Stack<>();
        int ans=0;

        int[] newHights=new int[n+2];
        newHights[0]=0;
        System.arraycopy(heights,0,newHights,1,n);
        newHights[n+1]=0;
        n+=2;
        heights=newHights;
        stack.push(0);

        for (int i=1;i<n;i++){
            while (heights[i]<heights[stack.peek()]){
                int currHeight=heights[stack.pop()];
                int currWidth=i-stack.peek()-1;
                ans=Math.max(ans,currHeight*currWidth);
            }
            stack.push(i);
        }
        return ans;
    }
}