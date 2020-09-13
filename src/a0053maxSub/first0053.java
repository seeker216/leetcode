package a0053maxSub;

public class first0053 {
    public int maxSubArray(int[] nums) {
        int max=Integer.MIN_VALUE;
        int curr=0;
        for (int i:nums){
            curr=curr<0?0:curr;
            curr+=i;
            max=Math.max(curr,max);

        }
        return max;
    }

    public static void main(String[] args) {

    }
}
