package a0206reverseLinkedList;

import dataStruc.ListNode;

public class second0206 {
}
class Solution2 {
    /*
    迭代
     */
    public ListNode reverseList(ListNode head) {
        ListNode pre=null,curr=head;
        while (curr!=null){
            ListNode nextTmp=curr.next;
            curr.next=pre;
            pre=curr;
            curr=nextTmp;
        }
        return pre;
    }
}