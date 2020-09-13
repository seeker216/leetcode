package a0015threeSum;

import sun.security.action.PutAllAction;

import java.util.*;

public class first0015 {
    /**
     * 采用两数和的做法，时间复杂度O(N^2)
     * @param nums
     * @return
     */
    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set=new HashSet<>();
        for (int i=0;i<nums.length;i++){
            List<Integer> tmp=new LinkedList<>();
            Map<Integer,Integer> map=new HashMap<>();
            for (int j=i+1;j<nums.length;j++){
                if (map.containsKey(-nums[i]-nums[j])){
                    tmp.add(nums[i]);
                    tmp.add(nums[j]);
                    tmp.add(-nums[i]-nums[j]);
                    List<Integer> temp=(LinkedList<Integer>)(((LinkedList<Integer>) tmp).clone());
                    Collections.sort(temp);
                    set.add(temp);
                    tmp.clear();
                }else{
                    map.put(nums[j],j);
                }
            }
        }
        List<List<Integer>> res=new LinkedList<>(set);
        return res;
    }

    public static void main(String[] args) {
        int[] nums={-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));
    }
}
