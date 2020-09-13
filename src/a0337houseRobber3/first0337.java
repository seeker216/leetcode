package a0337houseRobber3;

import dataStruc.TreeNode;

public class first0337 {
}
class Solution {
    public int rob(TreeNode root) {
        if (root==null)
            return 0;
        else
            return Math.max(rob(root.left)+rob(root.right),root.val+rob(root.left.left)+rob(root.left.right)+rob(root.right.left)+rob(root.right.right));
    }
}