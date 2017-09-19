/**
 * Created by Henry on 2017/7/29.
 */
public class ReverseNodesInK_25 {

//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
     }

    public static void main(String[] args){
        ReverseNodesInK_25 rn = new ReverseNodesInK_25();
        rn.begin();
//        ListNode n1 = new ListNode(1);
//        rn.reverseKGroup(n1,1);
    }

    private void begin() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;
        reverseKGroup(n1,1);
        ListNode p = n1;
        int i = 0;
        while (p != null){
            System.out.println(p.val);
            i++;
            if(i > 10)
                break;
        }
    }


    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 0)
            return null;
        ListNode p = new ListNode(0);
        p.next = head;
        ListNode begin = p;
//        ListNode end = head;
        ListNode curr = head;
        int i = 0;
        while (curr != null) {
            i ++;
            ListNode next = curr.next;
            if (i == k) {
                begin = reverseList(begin, next);
                i = 0;
            }
            curr = next;
        }
        return p.next;

    }
    private ListNode reverseList(ListNode begin, ListNode end) {
//        System.out.println("before end.next: " + end.next.val);
        if(begin == null || begin.next == null){
            return begin;
        }
        ListNode head = begin.next;
        ListNode curr = begin.next.next;
        while (curr != null) {
            ListNode nextNode = curr.next;
            curr.next = begin.next;
            begin.next = curr;
            curr = nextNode;
        }
        head.next = end;
        return head;
//        System.out.println();
//        System.out.println("after end.next: " + end.next.val);



    }

}
