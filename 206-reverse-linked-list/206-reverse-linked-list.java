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
        ListNode curr = head;
        ListNode first, second = null;
        
        while (curr != null) {
            first = second;
            second = curr;
            curr = curr.next;
            second.next = first;
        } 
        
        return second;
    }
}