package a0104maxDeptBinTree;

import dataStruc.TreeNode;

public class second0104 {
}
class Solution2 {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        else {
            int leftDepth = maxDepth(root.left);
            int rightDepth = maxDepth(root.right);
            return Math.max(leftDepth, rightDepth)+1;
        }
    }
}