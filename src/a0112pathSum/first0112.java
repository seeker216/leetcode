package a0112pathSum;

import dataStruc.TreeNode;

public class first0112 {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(-2);
        root.right=new TreeNode(-3);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        root.left.left.left=new TreeNode(-1);
        root.right.left=new TreeNode(-2);
        System.out.println(new Solution().hasPathSum(root,-1));
    }
}
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root==null)
            return false;
        if(root.val==sum&&root.left==null&&root.right==null){
            return true;
        }else {
            return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
        }
    }
}