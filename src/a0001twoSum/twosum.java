package a0001twoSum;

import java.util.HashMap;
import java.util.Map;

public class twosum {
    /**
     * 只遍历一遍：建立一个hashmap，对于每个数字n，若target-n在map中，则返回这对数的下标；否则将其与下标一起放入map
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            if (map.containsKey(target-nums[i]))
                return new int[]{map.get(target-nums[i]),i};
            else
                map.put(nums[i],i);
        }
        return null;
    }

}
