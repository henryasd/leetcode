
/**
 * Created by Henry on 2017/3/9.
 */
class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}
public class Add2Num {
    public static void main(String[] args){
        ListNode list1 = new ListNode(2);
        ListNode p1 = list1;
        ListNode list2 = new ListNode(5);
        ListNode p2 = list2;
        p1.next = new ListNode(4);
        p1 = p1.next;
        p1.next = new ListNode(3);

        p2.next = new ListNode(6);
        p2 = p2.next;
        p2.next = new ListNode(4);
        ListNode result = new Add2Num().addTwoNumbers(list1,list2);
        while (result.next != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode resultList = new ListNode(0) ;
        ListNode p = resultList;

        int carry = 0;
      while(l1.next != null && l2.next != null){
          p.val = l1.next.val + l2.next.val +carry;
          p = p.next;
          l1 = l1.next;
          l2 = l2.next;

      }
      return resultList;
    }

}

