package sortAlgorithm;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] n=new int[]{8,6,4,9,1,3,2};
        myInsertSort(n);
        System.out.println(Arrays.toString(n));
    }
    public static void myInsertSort(int[] nums){
        int n=nums.length;
        for (int i=1;i<n;i++){
            int preIdx=i-1;
            int current=nums[i];
            while (preIdx>=0&&nums[preIdx]>current){
                nums[preIdx+1]=nums[preIdx];
                preIdx--;
            }
            nums[preIdx+1]=current;
        }
    }
}
