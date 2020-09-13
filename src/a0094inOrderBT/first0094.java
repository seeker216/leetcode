package a0094inOrderBT;

import dataStruc.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class first0094 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        Solution s=new Solution();
        s.inorderTraversal(root);
    }
}
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null)
            return ans;
        Stack<TreeNode> stack=new Stack<>();
        TreeNode curr=root;
        while(curr!=null||!stack.empty()){
            while (curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            ans.add(curr.val);
            curr=curr.right;
        }
        return ans;
    }
}