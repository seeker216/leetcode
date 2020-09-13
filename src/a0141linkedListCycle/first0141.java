package a0141linkedListCycle;

import dataStruc.ListNode;

public class first0141 {
}
class Solution {
    public boolean hasCycle(ListNode head) {
        if (head==null)
            return false;
        ListNode slow=head,fast=head.next;
        while (fast!=null&&fast.next!=null){
            if (slow.val==fast.val){
                return true;
            }
            slow=slow.next;
            fast=fast.next.next;
        }
        return false;
    }
}