/**
 * Created by Henry on 2017/7/27.
 */
public class RNNFEL_19 {

//      Definition for singly-linked list.
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
     }
     public static void main(String[] args){
         RNNFEL_19 rnnfel_19 = new RNNFEL_19();
         rnnfel_19.begin(rnnfel_19);


     }

    private void begin(RNNFEL_19 rnnfel_19) {
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        n1.next = n2;
        rnnfel_19.removeNthFromEnd(n1, 1);
        ListNode p1 = n1;
        while (p1 !=null){
            System.out.println(p1.val);
            p1 = p1.next;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode p1 = new ListNode(0);
        ListNode p2 = new ListNode(0);
        p1.next = head;
        p2.next = head;

        for(int i = 0; i < n ; i++){
            p2 = p2.next;

        }
        while (p2.next!= null) {
                p1 = p1.next;
                p2 = p2.next;
            }
            //[1] 1
            if(p1 .next == p2 && p2 == head){
                head = null;
            }
            else if(p1.next == head && p2 !=head){
                head = head.next;
                p1.next = null;
            }
            else {
                ListNode p3 = p1.next;
                p1.next = p3.next;
                p3.next = null;
            }
        return head;


//        if(p1 == head && p1.next ==null){
//            head = null;
//        }
//        else if(p1.next !=null && p1 !=head) {
//            ListNode p3 = p1.next;
//            p1.next = p3.next;
//            p3.next = null;
//        }
//        else if(p1.next !=null && p1 == head){
//            if(p1.next != p2) {
//                head = p1.next;
//                p1.next = null;
//            }
//            else{
//
//            }
//        }
//



    }
}
