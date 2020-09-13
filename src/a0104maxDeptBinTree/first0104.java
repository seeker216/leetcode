package a0104maxDeptBinTree;

import dataStruc.TreeNode;

public class first0104 {
}
class Solution {
    int maxDep=0;
    public int maxDepth(TreeNode root) {
        if (root==null)
            return maxDep;
        maxDep++;
        dfs(root,1);
        return maxDep;
    }

    private void dfs(TreeNode root, int depth) {
        if (root==null)
            return;
        maxDep=Math.max(maxDep,depth);
        dfs(root.left,depth+1);
        dfs(root.right,depth+1);
    }

}