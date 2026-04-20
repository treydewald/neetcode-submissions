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
        //if we can't recurse through the listnodes anymore, return head
        if (head.next == null){
            return head;
        }
        //find linked listnode
        ListNode second = head.next;
        //remove link to head
        head.next = null;
        //find final element through recursive calls to the list formed through listnodes
        ListNode reverse = reverseList(second);
        //set second.next equal to head
        second.next = head;
        //return list from recursive call
        return reverse;
    }
}
