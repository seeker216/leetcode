package a0114flattenBT2List;

import dataStruc.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class first0114 {
}
class Solution {
    public void flatten(TreeNode root) {
        TreeNode ans=root;
        while (root!=null){
            if (root.left==null){
                root=root.right;
            }else {
                TreeNode pre=root.left;
                while (pre.right!=null){
                    pre=pre.right;
                }
                pre.right=root.right;
                root.right=root.left;
                root.left=null;
                root=root.right;
            }
        }
    }
}