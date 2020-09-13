package a0034findFirstAndLast;

import java.util.Arrays;

public class first0034 {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans=new int[]{-1,-1};
        int left=0,right=nums.length-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (nums[mid]==target){
                ans[0]=mid;
                if (mid>0&&nums[mid-1]!=target){
                    ans[0]=mid;
                    break;
                }else {
                    right=mid-1;
                }
            }else if (nums[mid]<target){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        left=0;
        right=nums.length-1;
        while (left<=right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                    ans[1]=mid;
                if (mid+1<nums.length&&nums[mid+1]!=target){
                    ans[1]=mid;
                    break;
                }else {
                    left=mid+1;
                }
            }else if (nums[mid]<target){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] n=new int[]{5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(n,7)));
    }
}
