package ams0201removeDuplicateNode;

import dataStruc.ListNode;

import java.util.HashSet;
import java.util.Set;

public class firstms0201 {
    public static void main(String[] args) {
        ListNode p=new ListNode(1);
        p.next=new ListNode(2);
        p.next.next=new ListNode(3);
        p.next.next.next=new ListNode(3);
        p.next.next.next.next=new ListNode(2);
        p.next.next.next.next.next=new ListNode(1);

        System.out.println(new Solution().removeDuplicateNodes(p).val);
    }
}
class Solution {
    public ListNode removeDuplicateNodes(ListNode head) {
        Set<Integer> set=new HashSet<>();
        ListNode pre=head,curr=pre.next;
        set.add(pre.val);
        while (curr!=null){
            while (curr!=null&&set.contains(curr.val)){
                curr=curr.next;
            }
            if (curr!=null) {
                set.add(curr.val);
                pre.next = curr;
                pre = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}