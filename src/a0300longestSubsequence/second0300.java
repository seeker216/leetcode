package a0300longestSubsequence;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class second0300 {

    public static int lengthOfLIS(int[] nums) {
        if (nums.length<=1)
            return nums.length;
        int[] d=new int[nums.length];
        d[1]=nums[0];
        int len=1;
        for (int i=1;i<nums.length;i++){
            if (nums[i]>d[len]){
                d[++len]=nums[i];
            }else {
                d[findFirstLess(nums,nums[i],0,i-1)+1]=nums[i];
            }
        }
        return len;
    }

    static int findFirstLess(int[] nums,int target,int low,int high){
        if (low==high)
            return low;
        int mid=low+(high-low)/2;
        if (nums[mid]<target&&mid+1<nums.length&&nums[mid+1]>target)
            return mid;
        else if (nums[mid]<target){
            return findFirstLess(nums,target,mid+1,high);
        }else {
            return findFirstLess(nums,target,low,mid-1);
        }
    }

    public static void main(String[] args) {
        int[] stack = new int[0];
        if (stack.length==0)
            System.out.println("yes");
        stack=new int[50];
        if (stack.length==0)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
