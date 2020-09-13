package a0448findAllNumsDisappear;

import java.util.ArrayList;
import java.util.List;

public class first0448 {
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        int len=nums.length;
        for (int i=0;i<len;i++){
            int idx=Math.abs(nums[i])-1;
            nums[idx]=nums[idx]<0?nums[idx]:-nums[idx];
        }
        for (int i=0;i<len;i++){
            if (nums[i]>0){
                ans.add(i+1);
            }
        }
        return ans;
    }
}