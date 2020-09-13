package a0287findDuplicateNumber;

public class first0287 {

    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] a=new int[]{8,5,3,9,7,3,2,4,3,0};
        System.out.println(solution.findDuplicate(a));
    }
}

class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int l=1,r=n-1,ans=-1;
        while (l<=r){
            int mid=(l+r)>>1;
            int cnt=0;
            for (int i=0;i<n;i++){
                if (nums[i]<=mid)
                    cnt++;
            }
            if (cnt<=mid){
                l=mid+1;
            }else {
                r=mid-1;
                ans=mid;
            }
        }
        return ans;
    }
}
