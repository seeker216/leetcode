package a0002add2Num;

import dataStruc.ListNode;

public class third0002 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode p=new ListNode(-1);
        ListNode ans=p;
        while (l1!=null||l2!=null){
            int n1=l1==null?0:l1.val;
            int n2=l2==null?0:l2.val;
            int sum=n1+n2+carry;
            carry=sum/10;
            ListNode tmp=new ListNode(sum%10);
            p.next=tmp;
            p=p.next;
            l1=l1==null?l1:l1.next;
            l2=l2==null?l2:l2.next;
        }
        if (carry==1){
            p.next=new ListNode(1);
        }
        return ans.next;
    }
}
