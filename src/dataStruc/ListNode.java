package dataStruc;

public class ListNode {
    public ListNode next;
    public int val;
    public ListNode(int x) { val = x; }


    public void printList(){

        while (this != null) {
            System.out.print(this.val+"->");
            this.next.printList();
        }
    }
}
