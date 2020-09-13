package a0045jumpGame2;

import java.util.Arrays;

public class first0045 {
    public int jump(int[] nums) {
        int n=nums.length;
        int[] step=new int[n];
        Arrays.fill(step,Integer.MAX_VALUE);
        step[0]=0;
        for (int i=0;i<n;i++){
            for (int j=1;j<=nums[i]&&i+j<n;j++){
                step[i+j]=Math.min(step[i]+1,step[i+j]);
            }
        }
        return step[n-1];
    }
}
