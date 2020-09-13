package a0350intersection2Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class second0350 {
}
class Solution2 {
    /*
    hashmap做法
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length>nums2.length){
            intersect(nums2,nums1);
        }
        Map<Integer,Integer> map=new HashMap<>();
        for (int i:nums1){
            int count=map.getOrDefault(i,0)+1;
            map.put(i,count);
        }
        List<Integer> ans=new ArrayList<>();
        for (int i:nums2){
            if (map.containsKey(i)){
                ans.add(i);
                map.put(i,map.get(i)-1);
                if (map.get(i)==0){
                    map.remove(i);
                }
            }
        }
        return ans.stream().mapToInt(Integer::valueOf).toArray();
    }
}