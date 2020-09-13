package a0124binTreeMaxPathSum;

import dataStruc.TreeNode;

public class first0124 {
}
class Solution {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxGain(root);
        return maxSum;
    }

    public int maxGain(TreeNode node) {
        if (node==null){
            return 0;
        }
        int leftMaxGain=Math.max(maxGain(node.left),0);
        int rightMaxGain=Math.max(maxGain(node.right),0);
        int currGain=leftMaxGain+rightMaxGain+node.val;
        maxSum=Math.max(maxSum,currGain);

        /*
        返回最大贡献值
         */
        return node.val+Math.max(leftMaxGain,rightMaxGain);
    }
}