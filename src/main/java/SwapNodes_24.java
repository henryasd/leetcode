/**
 * Created by Henry on 2017/7/29.
 */
public class SwapNodes_24 {
    public ListNode swapPairs(ListNode head) {
        if(head == null) return head;
        ListNode zero = new ListNode(0);
        ListNode pre = zero;
        pre.next = head;
        ListNode p1 = head;
        ListNode p2 = head;
        if(p1 != null)
            p2 = p1.next;
        while (p1 != null && p2 !=null){
            p1.next = p2.next;
            p2.next = p1;
            pre.next = p2;
            pre = p1;
            p1 = pre.next;
            if(p1 != null) {
                p2 = p1.next;
            }
            else p2 = null;
        }
        if(p1 != null) {
            pre.next = p1;
        }
        return zero.next;


    }
}