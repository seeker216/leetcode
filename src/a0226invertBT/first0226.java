package a0226invertBT;

import dataStruc.TreeNode;

public class first0226 {

}
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root==null)
            return null;
        TreeNode right=invertTree(root.right);
        TreeNode left=invertTree(root.left);
        root.right=left;
        root.left=right;
        return root;
    }
}