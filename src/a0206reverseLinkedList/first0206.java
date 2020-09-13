package a0206reverseLinkedList;

import dataStruc.ListNode;

import java.util.Stack;

public class first0206 {
    public static void main(String[] args) {
        Solution s=new Solution();
        ListNode ln=new ListNode(1);
        ln.next=new ListNode(2);
        ln.next.next=new ListNode(3);
        ListNode ss=s.reverseList(ln);
        ss.printList();
    }
}
class Solution {
    /*
    栈解法
     */
    public ListNode reverseList(ListNode head) {
        if (head==null)
            return head;
        Stack<ListNode> s=new Stack<>();
        while (head!=null){
            s.push(head);
            head=head.next;
        }
        ListNode tmp=s.pop(),ans=tmp;
        while (!s.empty()){
            tmp.next=s.pop();
            tmp=tmp.next;
        }
        tmp.next=null;
        return ans;
    }
}