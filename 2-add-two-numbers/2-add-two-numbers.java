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
class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        ListNode head = new ListNode(-1);
		//creating a node in order to store the sum of digit in a List format 
        ListNode temp = head;  
        
        int carry = 0; 
        
        // checking to make sure all numbers are added
        while(l1 != null || l2 != null || carry > 0 ) {
       
            int sum = 0; 
            if(l1 != null) { 
           
                sum += l1.val; 
                l1= l1.next; //moving the l1 pointer to the next node
            }
            
            if(l2 != null) {
                sum+= l2.val; 
                l2= l2.next;  //moving the l2 pointer to the next node
            }
            sum += carry;
            carry = sum / 10; //extracting the first digit 
            ListNode node= new ListNode(sum % 10); //extracting the last digit and creating the node 
            temp.next = node;
            
            temp= temp.next;
        }
        return head.next; 
    }
}