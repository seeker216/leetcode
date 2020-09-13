package a0543diameterOfBinTree;

public class first0543 {

      public class TreeNode {
          int val;
          TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    int res=0;
    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return res;
    }

    int dfs(TreeNode root){
        if (root==null)
            return 0;
        int leftDepth=dfs(root.left);
        int rightDepth=dfs(root.right);
        res=Math.max(res,leftDepth+rightDepth);
        return Math.max(leftDepth,rightDepth)+1;
    }
}
