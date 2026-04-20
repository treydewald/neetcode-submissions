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
        //2
        if (head == null) return null;
        else if (head.next == null) return head;
        ListNode second = head.next;
        head.next = null;
        ListNode rev = reverseList(second);
        second.next = head;
        return rev;
    }
}
