package a0021merge2lists;

import dataStruc.ListNode;

public class first0021 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        while (l1!=null&&l2!=null){
            if (l1.val<=l2.val){
                curr.next=l1;
                curr=curr.next;
                l1=l1.next;
            }else {
                curr.next=l2;
                curr=curr.next;
                l2=l2.next;
            }
        }
        curr.next=l1==null?l2:l1;
        return dummy.next;
    }
}
