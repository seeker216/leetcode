package a0315countOfSmallerNumsAfterSelf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class first0315 {
}
class Solution {
    /*
    暴力，超时
     */
    public List<Integer> countSmaller(int[] nums) {
        int len=nums.length;
        if (len<1)
            return new ArrayList<>();
        int[] counts=new int[len];
        counts[len-1]=0;
        for (int i=len-2;i>=0;i--){
            int tmp=0;
            for (int j=i+1;j<len;j++){
                tmp=nums[j]<nums[i]?tmp+1:tmp;
            }
            counts[i]=tmp;
        }
        return Arrays.stream(counts).boxed().collect(Collectors.toList());
    }
}