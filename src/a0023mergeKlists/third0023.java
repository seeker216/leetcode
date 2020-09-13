package a0023mergeKlists;

import dataStruc.ListNode;

public class third0023 {
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        if (n==0)
            return null;
        while (n>1) {
            for (int i = 0; i < n/2; i++) {
                lists[i] = merge2Lists(lists[i], lists[n - i - 1]);
            }
            n=(n+1)/2;
        }
        return lists[0];
    }

    ListNode merge2Lists(ListNode l1,ListNode l2){
        ListNode head=new ListNode(0);
        ListNode ans=head;
        while (l1!=null&&l2!=null){
            if (l1.val<l2.val){
                head.next=l1;
                l1=l1.next;
            }else {
                head.next=l2;
                l2=l2.next;
            }
            head=head.next;
        }
        if (l1==null){
            head.next=l2;
        }
        if (l2==null){
            head.next=l1;
        }
        return ans.next;
    }
}
