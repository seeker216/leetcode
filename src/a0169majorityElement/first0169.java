package a0169majorityElement;

public class first0169 {

    int countNum(int[] nums,int low,int high,int majority){
        int count=0;
        for (int i=low;i<=high;i++){
            if (nums[i]==majority)
                count++;
        }
        return count;
    }
    int recMajority(int[] nums,int low,int high){
        if (low==high)//如果区间内只有一个数，返回这个数
            return nums[low];
        int mid=low+(high-low)/2;
        int left=recMajority(nums,low,mid);
        int right=recMajority(nums,mid+1,high);//把区间划成两部分，进行分治，得到两边的众数
        if (left==right)//如果众数相同，则整个区间上的众数就是这个数
            return left;
        else {//如果不同，则分别计算这两个众数的次数，返回较大的
            int leftCount=countNum(nums,low,mid,left);
            int rightCount=countNum(nums,mid+1,high,right);
            return leftCount>rightCount?left:right;
        }
    }

    /**
     * 分治算法
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        return recMajority(nums,0,nums.length-1);
    }
}
