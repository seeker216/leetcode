package a0046permutations;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class second0046 {
    public static void main(String[] args) {
        List<Integer> list=new Solution().permute(new int[]{1,5,3});
        for (int i:list){
            System.out.println(i);
        }

    }
}
/*
计算全排列
 */
class Solution{
    List<Integer> ans=new LinkedList<>();
    public List<Integer> permute(int[] nums) {
        int n=nums.length;
        boolean[] used=new boolean[n];
        Stack<Integer> path=new Stack<>();
        dfs(nums,0,path,used,ans);
        return ans;
    }

    private void dfs(int[] nums, int depth, Stack<Integer> path, boolean[] used, List<Integer> ans) {
        if (depth==nums.length){
            int tmp=0;
            Stack<Integer> currPath= (Stack<Integer>) path.clone();
            while (!currPath.empty()){
                tmp*=10;
                tmp+=currPath.pop();
            }
            ans.add(tmp);
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