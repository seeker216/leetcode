package a0023mergeKlists;

import dataStruc.ListNode;

import java.util.*;

public class first0023 {
    /**
     * 暴力法，时间NlogN，空间N
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy=new ListNode(-1);
        List<Integer> nums=new ArrayList<>();
        for (ListNode node:lists){
            while (node!=null){
                nums.add(node.val);
                node=node.next;
            }
        }
        Collections.sort(nums);
        ListNode tmp=dummy;
        for (Integer i:nums){
            tmp.next=new ListNode(i);
            tmp=tmp.next;
        }
        return dummy.next;
    }
}
