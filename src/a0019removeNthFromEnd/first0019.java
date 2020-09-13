package a0019removeNthFromEnd;

import dataStruc.ListNode;

public class first0019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode ans=head,ptr=head,pre=head;
        for (int i=0;i<n-1;i++)
            ptr=ptr.next;
        while (ptr.next!=null){
            ptr=ptr.next;
            pre=head;
            head=head.next;
        }
        if (pre!=head)
            pre.next=head.next;
        else
            return pre.next;
        return ans;
    }
}
