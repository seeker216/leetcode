package a0033searchRotatedSorted;

import javax.swing.*;
import java.util.Arrays;

public class first0033 {
    public static int search(int[] nums, int target) {
        int n=nums.length,left=0,right=n-1;
        while (left<=right){
            int mid=(left+right)/2;
            if (nums[mid]==target)
                return mid;
            if (nums[mid]>=nums[left]){//左边升序
                if (nums[left]<=target&&nums[mid]>target){//在左边找
                    right=mid-1;
                }else{//在右边找
                    left=mid+1;
                }
            }else {//右边升序
                if (nums[mid]<target&&nums[right]>=target){//在右边找
                    left=mid+1;
                }else{//在右边找
                    right=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{3,1},1));
    }
}
