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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        /* the solution for this approach is to traverse the linked list to find the 
         *length, and then remove the len-nth node */
        
        
        int counter = 0;
        ListNode curr = head, start = head;
        
        // finding the length of the list
        while(curr.next !=null) {
            counter++;
            curr = curr.next;
        }
        
        if(counter == 0){ // takes care of the empty list
            return null;
        }else if(counter +1 == n){ // takes care of if 1st element needs to be removed
            return head.next;
        }
     
        
        int trav = counter - n;
        
        head = start;
        
        // moving to the position before the skip
        for (int i = 0; i < trav; i++){
            start = start.next;
        }
        
        if(start.next == null) { // if reach the end of the list
            return head;
        } else{
            start.next = start.next.next;
            return head;
        }
        
    }
}