package sortAlgorithm;

import java.util.Arrays;

public class SelectSort {
    public static void main(String[] args) {
        int[] n=new int[]{8,6,4,9,1,3,2};
        mySelectSort(n);
        System.out.println(Arrays.toString(n));
    }
    public static void mySelectSort(int[] nums){
        int n=nums.length;
        for (int i=0;i<n-1;i++){
            int minIdx=i;
            for (int j=i+1;j<n;j++){
                if (nums[j]<nums[minIdx]){
                    minIdx=j;
                }
            }
            int tmp=nums[i];
            nums[i]=nums[minIdx];
            nums[minIdx]=tmp;
        }
    }
}
