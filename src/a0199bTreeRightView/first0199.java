package a0199bTreeRightView;

import dataStruc.TreeNode;

import java.util.*;

public class first0199 {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new LinkedList<>();
        dfs(ans,root,0);
        return ans;
    }
    void dfs(List<Integer> ans,TreeNode node,int depth){
        if (node!=null){
            if (ans.size()==depth){
                ans.add(node.val);
            }
            dfs(ans,node.right,depth+1);
            dfs(ans,node.left,depth+1);
        }
    }
}
