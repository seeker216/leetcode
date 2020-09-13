package a0041firstMissingPositive;

public class first0041 {
    public static void main(String[] args) {
        System.out.println(new Solution().firstMissingPositive(new int[]{1,2,0}));
    }
}
class Solution {
    /*
    时间空间复杂度都是O(N)
     */
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        boolean[] flag=new boolean[n+1];
        for (int i:nums){
            if (i>0&&i<=n)
                flag[i]=true;
        }
        for (int i=1;i<n+1;i++){
            if (!flag[i])
                return i;
        }
        return n+1;
    }
}
