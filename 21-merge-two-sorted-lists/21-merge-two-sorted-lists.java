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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        
        /* the best way to go about this solution is to check the head of each
         * list and iincrement the list which is added onto our new LL */
        
        ListNode curr = new ListNode();
        ListNode head = curr;
    
        while (list1 != null && list2 !=null ) {
            
            /* comparing the head of each list */
            if(list1.val < list2.val){
                head.next = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                list2 = list2.next;
            }
            
            head = head.next;

        }
        
        /*once 1 list has gone to completion, then we just assign the remaining elements
         * of the next list to the end. */
        if (list1 == null) {
            head.next = list2;
        } else if (list2 == null) {
            head.next = list1;
        }
        /* we return curr.next since our head is empty */
        return curr.next;
        
    }
        
}