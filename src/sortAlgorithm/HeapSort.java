package sortAlgorithm;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] n=new int[]{8,6,4,9,1,3,2};
        myHeapSort(n);
        System.out.println(Arrays.toString(n));
    }
    public static void myHeapSort(int[] nums){
        int n=nums.length;
        buildHeap(nums,n);
        while (n>1){
            int tmp=nums[0];
            nums[0]=nums[n-1];
            nums[n-1]=tmp;
            n-=1;
            adjust(nums,0,n);
        }
    }

    private static void buildHeap(int[] nums, int n) {
        for (int i=n/2;i>=0;i--){
            adjust(nums,i,n);
        }
    }

    private static void adjust(int[] nums, int i, int j) {
        int left=2*i+1;
        int right=left+1;
        int largest=i;
        if(left<j&&nums[left]>nums[largest]){
            largest=left;
        }
        if (right<j&&nums[right]>nums[largest]){
            largest=right;
        }
        if (largest!=i){
            int tmp=nums[i];
            nums[i]=nums[largest];
            nums[largest]=tmp;
            adjust(nums,largest,j);
        }
    }

}
