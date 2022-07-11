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
        
        /* For this solution, we can use 3 pointers in order to maintain the order of
         * original Linked List */
        
        
        ListNode curr = head;
        ListNode first, second = null;
        
        /* 'first' will store the value of the list we are returning, while the head of 
         * the list 'second' will take the pointer to the head of the original list */
        while (curr != null) {
            first = second;
            second = curr;
            curr = curr.next;
            second.next = first;
        } 
        
        return second;
    }
}