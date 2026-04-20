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
        //base case
        if (head == null){
            return null;
        }
        //if we can't run anymore recursion, return head with next = null
        if (head.next == null){
            return head;
        }
        //take next element
        ListNode second = head.next;
        //remove link from head to next
        head.next = null;
        //run recursion until there are no more links. reverse will be equal to final second element
        ListNode reverse = reverseList(second);
        // set link between second and head
        second.next = head;
        return reverse;
    }
}
