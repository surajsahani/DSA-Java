public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val){
        this.val = val;
     }
    ListNode(
        int val, ListNode next
        ) 
        { 
            this.val = val; 
            this.next = next; 
        }
}
class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if(k==0 || head ==null || head.next==null)
        return head;

        int len = lengthLL(head);
        int n = k%len;

        while(n>0){
            LisNode curr = head;

            while(curr.next.next!=null){
                curr = curr.next;
            }
            ListNode temp = curr.next;
            curr.next = null;
            temp.next = head;
            head = temp;
            n--;
        }
        return head;
    }
    private int lengthLL(ListNode head){
        int len = 0;
        while(head.next!=null){
            len++;
            head = head.next;
        }
        return len+1
    }
}