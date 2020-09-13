package a0002add2Num;

import dataStruc.ListNode;

public class addtwonum2 {
    /**
     * 当两个链表全为空才退出循环，其中一个空时赋为0，结束时若进位不为0再加一个节点
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead=new ListNode(0);
        ListNode p=l1,q=l2,curr=dummyHead;
        int carry=0;
        while (p!=null||q!=null){
            int x=p==null?0:p.val;
            int y=q==null?0:q.val;
            int sum=x+y+carry;
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
            if (p!=null)
                p=p.next;
            if (q!=null)
                q=q.next;
        }
        if (carry>0)
            curr.next=new ListNode(1);
        return dummyHead.next;
    }
}
