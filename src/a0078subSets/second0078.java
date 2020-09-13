package a0078subSets;

import java.util.ArrayList;
import java.util.List;

public class second0078 {
    public static void main(String[] args) {
        a0078 t=new a0078();
        int[] a=new int[]{1,2,3};
        t.subsets(a);
    }
}
/*
回溯法
 */
class a0078{
    int n,k;
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        n=nums.length;
        for (k=0;k<n+1;k++){
            backtrack(0,nums,new ArrayList<Integer>());
        }
        return ans;
    }

    private void backtrack(int first, int[] nums, ArrayList<Integer> curr) {
        if (curr.size()==k){
            ans.add(new ArrayList<>(curr));
        }
        for (int i=first;i<n;i++){
            curr.add(nums[i]);
            backtrack(i+1,nums,curr);
            curr.remove(curr.size()-1);
        }
    }
}