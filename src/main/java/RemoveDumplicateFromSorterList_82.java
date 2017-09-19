/**
 * Created by Henry on 2017/8/13.
 */
public class RemoveDumplicateFromSorterList_82 {

    //  Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
      }

    public static void main(String[] args) {
        new RemoveDumplicateFromSorterList_82().begin();
    }

    private void begin() {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(1);
        ListNode n3 = new ListNode(2);
        ListNode n4 = new ListNode(2);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        ListNode n = deleteDuplicates(n1);
        while (n != null){
            System.out.println(n.val);
            n = n.next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode FakeHead=new ListNode(0);
        FakeHead.next=head;
        ListNode pre=FakeHead;
        ListNode cur=head;
        while(cur!=null){
            while(cur.next!=null&&cur.val==cur.next.val){
                System.out.println(cur.val);
                cur=cur.next;
                System.out.println(cur.val);

            }
            if(pre.next==cur){
                System.out.println(pre.val);
                pre=pre.next;
                System.out.println(pre.val);
            }
            else{
                System.out.println(pre.val);
                System.out.println(cur.val);
                pre.next=cur.next;
                System.out.println(pre.val);
            }
            cur=cur.next;
        }
        return FakeHead.next;


    }
}
