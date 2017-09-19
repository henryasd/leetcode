/**
 * Created by Henry on 2017/3/9.
 * 2. Add Two Numbers
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

 You may assume the two numbers do not contain any leading zero, except the number 0 itself.

 Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 Output: 7 -> 0 -> 8
 解法：
 同时遍历这两个链表，每次遍历将结果相加放在结果链表中。相加时注意处理进位。
 使用Java语言时注意，局部变量需要初始化后才能使用，否则会出现空指针异常。node 是null 时不能使用成员
 */

public class AddTwoSum {
    public static void main(String []args){
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
        ListNode result = new AddTwoSum().addTwoNumbers(list1,list2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
        ListNode restultList = new ListNode(0);
        int carry =0 , reminder = 0 , sum =0;
        ListNode p1 = l1, p2 = l2, p3 = restultList;
        while(p1 != null || p2 != null || carry != 0){
            sum = (p1 != null ? p1.val : 0) + (p2 != null ? p2.val : 0) + carry;
            carry = sum/10;
            reminder = sum%10;
            ListNode newNode = new ListNode(reminder);
            p3.next = newNode;
            p3 = p3.next;
            p1 = (p1 != null ? p1.next : p1);
            p2 = (p2 != null ? p2.next : p2);
        }
        return restultList.next;
    }
}
