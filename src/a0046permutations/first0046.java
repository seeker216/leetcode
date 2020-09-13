package a0046permutations;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class first0046 {
    List<List<Integer>> ans=new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        int n=nums.length;
        if (n==0)
            return ans;
        Stack<Integer> path=new Stack<>();
        boolean[] used=new boolean[n];
        dfs(nums,0,path,used,ans);
        return ans;
    }
    void dfs(int[] nums, int depth, Stack<Integer> path,boolean[] used, List<List<Integer>> ans){
        if (depth==nums.length){
            ans.add(new LinkedList<>(path));
            return;
        }
        for (int i=0;i<nums.length;i++){
            if (used[i]){
                continue;
            }
            path.push(nums[i]);
            used[i]=true;
            dfs(nums,depth+1,path,used,ans);
            path.pop();
            used[i]=false;
        }
    }
}
