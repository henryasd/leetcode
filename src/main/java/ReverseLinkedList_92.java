/**
 * Created by Henry on 2017/8/15.
 */
public class ReverseLinkedList_92 {
    ///**
      //Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public static void main(String[] args) {
        new ReverseLinkedList_92().begin();

    }

    private void begin() {
        ListNode n3 = new ListNode(3);
        ListNode n5 = new ListNode(5);
        n3.next = n5;
        ListNode n = reverseBetween(n3, 1, 1);
        while (n != null){
            System.out.println(n.val);
            n = n.next;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return head;
        ListNode head0 = new ListNode(0);
        head0.next = head;
        ListNode pre = head0;
        ListNode last = null;
        ListNode cur = head;
        ListNode p1 = head;
        ListNode re = head;
        ListNode nextNode = head;
        int index = 1;
        while(cur.next != null){
            nextNode = cur.next;
            if(index < m){
                pre = cur;
            }
            else if(index == m){
                p1 = cur;
                re = p1;
            }
            else if(index > m && index <= n){
                cur.next = re;
                re = cur;
            }
            else {
                last = cur;
                break;
            }
            cur = nextNode;
            index ++;
        }
        pre.next = re;
        p1.next = last;
        return head0.next;
    }
}
