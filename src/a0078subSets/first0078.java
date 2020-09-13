package a0078subSets;

import java.util.ArrayList;
import java.util.List;

public class first0078 {
    /*
    用二进制串添加
     */
    public List<List<Integer>> subsets(int[] nums) {
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        for (int i = (int) Math.pow(2,n);i<Math.pow(2,n+1);i++){
            String bs=Integer.toBinaryString(i).substring(1);
            List<Integer> tmp=new ArrayList<>();
            for (int j=0;j<bs.length();j++){
                if (bs.charAt(j)=='1'){
                    tmp.add(nums[j]);
                }
            }
            ans.add(tmp);
        }
        return ans;
    }
}
