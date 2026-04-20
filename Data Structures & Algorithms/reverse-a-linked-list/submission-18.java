/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        //3
        if (head == null){
            return null;
        } else if (head.next == null){
            return head;
        }
        ListNode second = head.next;
        System.out.println("second: "+second.val);
        head.next = null;
        ListNode reverse = reverseList(second);
        System.out.println("reverse: "+reverse.val);
        second.next = head;
        return reverse;

    }
}