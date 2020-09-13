package a0002add2Num;


import dataStruc.ListNode;

public class addtwonum{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        if (l1==null&&l2==null)
            return null;
        else if(l1==null)
            return l2;
        else if(l2==null)
            return l1;
        else{
            ListNode ptr=l1;
            while (l1.next!=null&&l2.next!=null){
                int sum=l1.val+l2.val+carry;
                carry=sum/10;
                l1.val=sum%10;
                l1=l1.next;
                l2=l2.next;
            }
            int sum=l1.val+l2.val+carry;
            carry=sum/10;
            l1.val=sum%10;
            if (l1.next==null&&l2.next==null&&carry==1){
                l1.next=new ListNode(1);
                return ptr;
            }
            else if (l1.next==null&&l2.next!=null){
                l1.next=l2.next;
            }
            l1=l1.next;
            while (carry!=0) {
                sum=l1.val+carry;
                carry=sum/10;
                l1.val=sum%10;
                if (l1.next==null&&carry==1){
                    l1.next=new ListNode(1);
                    carry=0;
                }
                l1=l1.next;
            }
            return ptr;
        }
    }

    public static void main(String[] args) {
        addtwonum addtwonum=new addtwonum();
        ListNode l1=new ListNode(5);
        ListNode l2=new ListNode(5);
        ListNode res=addtwonum.addTwoNumbers(l1,l2);
        System.out.println(res.val);
    }
}
