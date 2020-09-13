package a0445twoSum2;

import dataStruc.ListNode;

import java.util.Stack;

public class first0445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> n1=new Stack<>(),n2=new Stack<>();
        while (l1!=null){
            n1.push(l1.val);
            l1=l1.next;
        }
        while (l2!=null){
            n2.push(l2.val);
            l2=l2.next;
        }
        int sum=0,carry=0;
        ListNode post=null,curr=null;
        while (!n1.empty()||!n2.empty()){
            int num1=n1.empty()?0:n1.pop();
            int num2=n2.empty()?0:n2.pop();
            sum=num1+num2+carry;
            carry=sum/10;
            curr=new ListNode(sum%10);
            curr.next=post;
            post=curr;
        }
        if (carry==1){
            curr=new ListNode(1);
            curr.next=post;
        }
        return curr;
    }
}
