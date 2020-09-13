package a0283moveZeros;

public class second0283 {
}
class Solution2 {
    public void moveZeroes(int[] nums) {
        int len=nums.length;
        int last0=0;
        for (int i=0;i<len;i++){
            if (nums[i]!=0){
                nums[last0++]=nums[i];
            }
        }
        for (int i=last0;i<len;i++){
            nums[i]=0;
        }
    }
}