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
        System.out.println("head: "+head.val);
        ListNode second = head.next;
        System.out.println("second: "+second.val);
        head.next = null;
        ListNode reverse = reverseList(second); // this is what we're returning (reverseList called on second, which is equal to head.next, 
        //and then we set the pointer on second equal to the original head)
        System.out.println("reverse: "+reverse.val);
        second.next = head;
        System.out.println("second.next:"+second.next.val);
        return reverse;

    }
}