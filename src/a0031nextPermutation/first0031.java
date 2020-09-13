package a0031nextPermutation;

import java.util.Arrays;

public class first0031 {
    /**
     * WA
     * @param nums
     */
    public static void nextPermutation(int[] nums) {
        int n=nums.length;
        boolean flag=false;
        for (int i=n-1;i>=1;i--){
            if (nums[i]>nums[i-1]) {
                int tmp=nums[i];
                nums[i]=nums[i-1];
                nums[i-1]=tmp;
                flag=true;
                break;
            }
        }
        if (!flag)
            Arrays.sort(nums);
        return;
    }

    public static void main(String[] args) {
        int[] x=new int[]{1};
        nextPermutation(x);
        System.out.println(Arrays.toString(x));
    }
}
