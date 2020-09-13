package a0098validateBST;

import dataStruc.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class first0098 {
    /*
    递归中序遍历
     */
    List<Integer> list=new ArrayList<>();
    public boolean isValidBST(TreeNode root) {

        inOrder(root);
        for (int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1))
                return false;
        }
        return true;
    }

    private void inOrder(TreeNode root) {
        if (root==null)
            return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }
}
