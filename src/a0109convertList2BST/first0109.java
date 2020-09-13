package a0109convertList2BST;

import dataStruc.ListNode;
import dataStruc.TreeNode;

public class first0109 {
}
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        return buildTree(head,null);
    }

    private TreeNode buildTree(ListNode left, ListNode right) {
        if (left==right)
            return null;
        ListNode mid=getMid(left,right);
        TreeNode root=new TreeNode(mid.val);
        root.left=buildTree(left,mid);
        root.right=buildTree(mid.next,right);
        return root;
    }

    private ListNode getMid(ListNode left, ListNode right) {
        ListNode fast=left;
        ListNode slow=left;
        while (fast!=right&&fast.next!=right){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}