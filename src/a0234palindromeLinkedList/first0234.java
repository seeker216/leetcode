package a0234palindromeLinkedList;

import dataStruc.ListNode;

import java.util.ArrayList;
import java.util.List;

public class first0234 {
    public static void main(String[] args) {
        ListNode ln=new ListNode(-129);
        ln.next=new ListNode(-129);
        new Solution().isPalindrome(ln);
    }
}
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> list=new ArrayList<>();
        while (head!=null){
            list.add(head.val);
            head=head.next;
        }
        for (int i=0;i<list.size();i++){
            if (!list.get(i).equals(list.get(list.size()-i-1))){
                System.out.println(list.get(i));
                System.out.println(list.get(list.size()-i-1));
                return false;
            }
        }
        return true;
    }
}