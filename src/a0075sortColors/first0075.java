package a0075sortColors;

public class first0075 {
    public void sortColors(int[] nums) {
        int r=0,w=0,b=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==0) r++;
            if(nums[i]==1) w++;
            if(nums[i]==2) b++;
        }
        int m=0;
        for(int i=0;i<r;i++) nums[m++]=0;
        for(int i=0;i<w;i++) nums[m++]=1;
        for(int i=0;i<b;i++) nums[m++]=2;
    }
}
