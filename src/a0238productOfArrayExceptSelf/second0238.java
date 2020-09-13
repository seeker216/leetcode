package a0238productOfArrayExceptSelf;

public class second0238 {

}

class Solution2 {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans=new int[n];
        ans[0]=1;
        for (int i=1;i<n;i++){
            ans[i]=ans[i-1]*nums[i-1];
        }
        int rightProduct=nums[n-1];
        for (int i=n-2;i>=0;i--){
            ans[i]*=rightProduct;
            rightProduct*=nums[i];
        }
        return ans;
    }
}
