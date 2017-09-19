import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by Henry on 2017/7/28.
 */
public class MergeKList_23 {

//      Definition for singly-linked list.
      class ListNode {
          int val;
          ListNode next;
          ListNode(int x) { val = x; }
     }
     public static void main(String[] args){
         MergeKList_23 mergeKList = new MergeKList_23();
         mergeKList.start();

     }

    private void start() {
        ListNode n1 = new ListNode(-2);
        ListNode n2 = new ListNode(-1);
        ListNode n3 = new ListNode(-1);
        ListNode n4 = new ListNode(-1);
//        ListNode n5 = new ListNode(-1);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
//        n4.next = n5;


        ListNode[] l = {n1,};
        ListNode n = mergeKLists(l);
        int i = 0;
        while (n!=null){
            System.out.println(n.val);
            n = n.next;
//            i++;
//            if(i > 10)
//                break;
        }
    }
    public ListNode mergeKLists(ListNode[] lists){
        if(lists == null || lists.length == 0){return null;}
        PriorityQueue<ListNode> pq = new PriorityQueue<ListNode>(new Comparator<ListNode>() {
            @Override
            public int compare(ListNode o1, ListNode o2) {
                return o1.val - o2.val;
            }
        });
        for(int i = 0; i < lists.length; i++){
            if(lists[i] == null) continue;
            ListNode node = lists[i];

            while (node!=null){
                pq.add(node);
                node = node.next;
            }
        }
        ListNode head = new ListNode(0);
        ListNode p = head;
        while (!pq.isEmpty()){
            p.next = pq.poll();
            p = p.next;
//            if (p.next != null)
//                pq.offer(p.next);
        }
        p.next = null;
        return head.next;

    }

//    public ListNode mergeKLists(ListNode[] lists) {
////        ListNode[] lists = new ListNode[lists.length];
//        ListNode head = new ListNode(0);
//        ListNode point = head;
////        for(int i = 0; i < lists.length; i ++){
////            lists[i]= lists[i];
////        }
//        while (checkNotNull(lists)){
//            point.next = getSmallP(lists);
//            point = point.next;
////            System.out.println("---" + point.val);
//
//        }
//        return head.next;
//    }
//
//    private ListNode getSmallP(ListNode[] lists) {
//        ListNode minNode = new ListNode(Integer.MAX_VALUE);
//        int index = -1;
//        for(int i = 0; i < lists.length; i++){
//            if (lists[i] != null){
//                if(minNode.val > lists[i].val){
//                    index = i;
//                    minNode = lists[i];
//                }
//
//            }
//        }
//        if(index > -1) {
//            lists[index] = lists[index].next;
//        }
//        else
//            lists[index] = null;
//        return minNode;
//    }
//
//    private boolean checkNotNull(ListNode[] p) {
//        boolean isNotNull = false;
//        for(int i = 0; i < p.length; i++){
//            if(p[i] != null){
//                isNotNull = true;
//                break;
//            }
//        }
//        return isNotNull;
//    }
}
