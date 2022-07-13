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
    public void reorderList(ListNode head) {
        
        /* This problem can be completed with the tortoise and hare strategy,
         * where we have 1 fast and 1 slow pointer in order to split the LL in the middle
         * and then merge according to the conditions */
        
        ListNode slow = head;
        ListNode fast = head.next;
        
        // this traverses the list to find the middle point
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode middle = slow.next;
        slow.next = null; // null becuase we are splitting the list and breaking the link
        ListNode prev = null;
        
        // now we reverse the second half of the list
        while (middle != null){
            ListNode temp = middle.next;
            middle.next = prev;
            prev = middle;
            middle = temp;
        }
        
        
        // now we do the merging
        
        ListNode beg = head;
        middle = prev; // prev holds the new head of second half
        

        while (middle != null) {
            ListNode tempBeg = beg.next;
            ListNode tempMid = middle.next;
            // first half node comes before second half node
            beg.next = middle;
            middle.next = tempBeg;
            beg = tempBeg;
            middle = tempMid;
        }
        
        
        
        
        
        
        
        
        
        
    }
}