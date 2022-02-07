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
        
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode result = new ListNode(0);
        ListNode curr = result;
        int carry = 0;
        
        while(p1 != null || p2 != null){
            int value1 = (p1 != null) ? p1.val : 0;
            int value2 = (p2 != null) ? p2.val : 0;
            int sum = carry+ value1+ value2;
            carry = sum /10;
            int digit = sum %10;
    
            curr.next = new ListNode(digit);
            
            
            if(p1 != null){
                p1 = p1. next;
            }
            if(p2 != null){
                p2 = p2. next;
            }
            curr = curr.next;
           System.out.println("added");
        }
        if(carry > 0){
            System.out.println("carry " + carry);
                curr.next = new ListNode(carry);
            }
        
        return result.next;
    }
}