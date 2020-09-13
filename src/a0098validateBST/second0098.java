package a0098validateBST;

import dataStruc.TreeNode;

public class second0098 {
    public boolean isValidBST(TreeNode root) {
        return recursive(root,null,null);
    }

    private boolean recursive(TreeNode root, Integer low, Integer high) {
        if (root==null)
            return true;
        if (low!=null&&root.val<=low)
            return false;
        if (high!=null&&root.val>=high)
            return false;
        if (!recursive(root.left,low,root.val)||!recursive(root.right,root.val,high))
            return false;
        return true;
    }
}
