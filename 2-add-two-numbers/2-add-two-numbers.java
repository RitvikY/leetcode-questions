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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        /* this solution requires us to add both lists together node by node and have
         * a carry digit to account for sums > 9 */
        
        
        ListNode head = new ListNode(0); // new list
        ListNode curr = head;
        int carry = 0;
        
        
        while(l1 != null || l2 != null || carry != 0){ // will stop only when both lists are traversed 
            int x, y;
            if(l1 != null) {
                x = l1.val;
            } else {
                x = 0;
            }
            
             if(l2 != null) {
                y = l2.val;
            } else {
                y = 0;
            }
            
            
            int sum = x + y + carry;
            carry = sum / 10; // we do this to update carry if sum >= 10
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        
        return head.next;
    }
}