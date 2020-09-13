package a0128longestConsecutiveSequence;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class first0128 {
}
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<Integer>();
        for (int i:nums)
            set.add(i);
        int ans=0;
        for (int i:nums){
            if (set.contains(i-1))
                continue;
            else {
                int currNum=i;
                int currCount=1;
                while (set.contains(currNum+1)){
                    currCount++;
                    currNum++;
                }
                ans=Math.max(ans,currCount);
            }
        }
        return ans;
    }
}