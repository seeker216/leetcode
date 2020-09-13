package a0617merge2BT;

import dataStruc.TreeNode;

public class first0617 {
}
class Solution {
    /*
    我的递归
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1==null&&t2==null){
            return null;
        }else {
            int n1=t1==null?0:t1.val;
            int n2=t2==null?0:t2.val;
            TreeNode root=new TreeNode(n1+n2);
            root.left=mergeTrees(t1==null?null:t1.left,t2==null?null:t2.left);
            root.right=mergeTrees(t1==null?null:t1.right,t2==null?null:t2.right);
            return root;
        }
    }

    /*
    题解的递归
     */
    public TreeNode mergeTrees2(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.val += t2.val;
        t1.left = mergeTrees2(t1.left, t2.left);
        t1.right = mergeTrees2(t1.right, t2.right);
        return t1;
    }
}