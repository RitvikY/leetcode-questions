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
        
        int counter = 0;
        
        ListNode curr = head, start = head;
        
        while(curr.next !=null) {
            counter++;
            curr = curr.next;
        }
        
        if(counter == 0){
            return null;
        }
        if(counter +1 == n){
            return head.next;
        }
     
        int trav = counter - n;
        if (trav < 0){trav = 0;}
        
        head = start;
        for(int i = 0; i < trav; i++){
            start = start.next;
        }
        
        if(start.next == null) {
            return head;
        }
        start.next = start.next.next;
        return head;
        
        
    
        
    }
}