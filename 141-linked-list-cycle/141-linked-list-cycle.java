/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        
        ListNode curr = head;
        
        if (curr == null) return false;
        while (curr.next != null) {
            if (curr.val == Integer.MAX_VALUE) return true;
            
            curr.val = Integer.MAX_VALUE;
            curr = curr.next;
        }
        
        return false;
        
    }
}