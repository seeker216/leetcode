package a0113pathSum2;

import dataStruc.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class first0113 {
}
class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<Integer> path=new ArrayList<>();
        findPaths(root,sum,path);
        return ans;
    }

    private void findPaths(TreeNode root, int sum, List<Integer> path) {
        if (root==null) {
            return;
        }
        path.add(root.val);
        if (root.val==sum&&root.left==null&&root.right==null){
            ans.add(new ArrayList<>(path));
        }else {
            findPaths(root.left, sum - root.val, path);
            findPaths(root.right, sum - root.val, path);
        }
        path.remove(path.size()-1);
    }
}