package a0350intersection2Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class first0350 {
}
class Solution {
    /*
    排序做法
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> ans=new ArrayList<>();
        int i=0,j=0;
        while (i<nums1.length&&j<nums2.length){
            if (nums1[i]==nums2[j]){
                ans.add(nums1[i]);
                i++;
                j++;
            }else if(nums1[i]>nums2[j]){
                j++;
            }else {
                i++;
            }
        }
        return ans.stream().mapToInt(Integer::valueOf).toArray();
    }
}