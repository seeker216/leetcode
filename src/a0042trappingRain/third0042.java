package a0042trappingRain;

import java.util.Stack;

public class third0042 {
    /**
     * 栈解法
     * @param height
     * @return
     */
    public static int trap(int[] height) {
        int ans=0,current=0;
        Stack<Integer> stack=new Stack<>();
        while (current<height.length){
            while (!stack.isEmpty()&&height[current]>height[stack.peek()]){
                int top=stack.pop();
                if (stack.empty())
                    break;
                int distance=current-stack.peek()-1;
                int boundedHeight=Math.min(height[current],height[stack.peek()])-height[top];
                ans+=distance*boundedHeight;
            }
            stack.push(current++);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] h=new int[]{0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(h));
    }
}
