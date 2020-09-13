package a0538convertBSTtoGreaterTree;

import dataStruc.TreeNode;

public class first0538 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        TreeNode rt = new Solution().convertBST(root);

    }
}
class Solution {
    int num=0;
    public TreeNode convertBST(TreeNode root) {
        TreeNode tmp=root;
        inOrderRight(tmp);
        return root;
    }

    private void inOrderRight(TreeNode root) {
        if (root==null)
            return;
        inOrderRight(root.right);
        num+=root.val;
        root.val=num;
        inOrderRight(root.left);
    }
}