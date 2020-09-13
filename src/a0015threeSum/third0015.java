package a0015threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.EventListener;
import java.util.List;

public class third0015 {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> res=new ArrayList<>();
        int len=nums.length;
        if (nums==null||nums.length<3)
            return res;
        Arrays.sort(nums);
        for (int i=0;i<len;i++){
            if (nums[i]>0)
                break;
            if (i>0&&nums[i]==nums[i-1])
                continue;
            int L=i+1,R=len-1;
            while (L<R){
                int s=nums[i]+nums[L]+nums[R];
                if (s==0) {
                    res.add(Arrays.asList(nums[i], nums[L], nums[R]));
                    while (L < R && nums[L] == nums[L + 1])
                        L++;
                    while (L < R && nums[R] == nums[R - 1])
                        R--;
                    L++;
                    R--;
                }
                else if (s>0)
                    R--;
                else if (s<0)
                    L++;
            }
        }
        return res;
    }
}
