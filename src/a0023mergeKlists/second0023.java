package a0023mergeKlists;

import dataStruc.ListNode;
import a0021merge2lists.first0021;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class second0023 {
    /**
     * 分治算法，时间NlogK
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        int len=lists.length;
        if (len==0)
            return null;
        while (len>1){
            for (int i=0;i<len/2;i++){
                lists[i]=mergeTwoLists(lists[i],lists[len-i-1]);
            }
            len=(len+1)/2;
        }
        return lists[0];
    }

    ListNode mergeTwoLists(ListNode l1, ListNode l2) {
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
