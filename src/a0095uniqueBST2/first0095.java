package a0095uniqueBST2;

import dataStruc.TreeNode;

import java.util.LinkedList;
import java.util.List;

public class first0095 {
}
class Solution {
    public List<TreeNode> generateTrees(int n) {
        if(n==0)
            return new LinkedList<>();
        else
            return generateTrees(1,n);
    }

    private List<TreeNode> generateTrees(int start, int end) {
        List<TreeNode> allTrees = new LinkedList<>();
        if (start>end){
            allTrees.add(null);
            return allTrees;
        }
        for (int i=start;i<=end;i++){
            List<TreeNode> leftTrees=generateTrees(start,i-1);
            List<TreeNode> rightTrees=generateTrees(i+1,end);
            for (TreeNode left:leftTrees){
                for (TreeNode right:rightTrees){
                    TreeNode curr=new TreeNode(i);
                    curr.left=left;
                    curr.right=right;
                    allTrees.add(curr);
                }
            }
        }
        return allTrees;
    }
}