package a0045jumpGame2;

public class second0045 {
    public int jump(int[] nums) {
        int n=nums.length;
        int steps=0;
        int maxPos=0;
        int end=0;
        for (int i=0;i<n-1;i++){
            maxPos=Math.max(maxPos,i+nums[i]);
            if (i==end){
                end=maxPos;
                steps++;
            }
        }
        return steps;
    }
}
