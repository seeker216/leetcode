package sortAlgorithm;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] n=new int[]{8,6,4,9,1,3,2};
        n=myMergeSort(n);
        System.out.println(Arrays.toString(n));
    }
    public static int[] myMergeSort(int[] nums){
        int n=nums.length;
        int[] arr= Arrays.copyOf(nums,n);
        if (n<2)
            return arr;
        int mid=n/2;
        int[] left=Arrays.copyOfRange(arr,0,mid);
        int[] right=Arrays.copyOfRange(arr,mid,n);
        return merge(myMergeSort(left),myMergeSort(right));
    }
    public static int[] merge(int[] left,int[] right){
        int[] result=new int[left.length+right.length];
        int i=0,pl=0,pr=0;
        while(pl<left.length&&pr<right.length){
            if (left[pl]<=right[pr]){
                result[i++]=left[pl++];
            }else{
                result[i++]=right[pr++];
            }
        }
        while (pl<left.length){
            result[i++]=left[pl++];
        }
        while (pr<right.length){
            result[i++]=right[pr++];
        }
        return result;
    }
}
