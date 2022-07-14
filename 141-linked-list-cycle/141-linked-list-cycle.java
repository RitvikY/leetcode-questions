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
        
        
        /* the approach for this solution is to create a 'flag' in order to see if a 
         * node has been visited. Since we can change the values of the nodes, I set
         * the flag to be Integer.MAX and return true if we find that as a nodes value.
         * This is only done becuase we cannot create a flag variable in the ListNode a
         * and must use the given parameters */
        
        ListNode curr = head;
        
        if (curr == null) return false;
        
        while (curr.next != null) {
            if (curr.val == Integer.MAX_VALUE) return true; // checking if a node has been visited
            
            curr.val = Integer.MAX_VALUE; // setting the flag
            curr = curr.next;
        }
        
        return false;
        
    }
}