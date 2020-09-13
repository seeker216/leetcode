package sortAlgorithm;

import java.util.Arrays;

public class ShellSort {
    public static void main(String[] args) {
        int[] n=new int[]{8,6,4,9,1,3,2};
        myShellSort(n);
        System.out.println(Arrays.toString(n));
    }
    public static void myShellSort(int[] nums){
        int len=nums.length;
        for (int gap=len/2;gap>0;gap/=2){
            for (int i=gap;i<len;i++){
                int j=i;
                while (j-gap>=0&&nums[j]<nums[j-gap]){
                    int tmp=nums[j];
                    nums[j]=nums[j-gap];
                    nums[j-gap]=tmp;
                    j-=gap;
                }
            }
        }
    }
}
