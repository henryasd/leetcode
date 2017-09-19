/**
 * Created by Henry on 2017/8/9.
 */
public class RotateList_61 {

    //  Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || k == 0)return head;
        ListNode begin = new ListNode(0);
        begin.next = head;
        ListNode p1 = begin;
        int len = 0;
        while (p1.next != null){
            p1 = p1.next;
            len ++;
        }
        int kMod = k % len;
        ListNode p2 = begin;
        for(int i = 0; i < len - kMod; i++)
            p2 = p2.next;
        p1.next = head;
        begin.next = p2.next;
        p2.next = null;
        return begin.next;

    }
}
