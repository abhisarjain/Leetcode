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
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode temp2 = null;
        ListNode temp = head;
        ListNode temp3;
        // while(temp.next!=null)
        // {
        //     temp = temp.next;
        // }
        
        while(temp!=null)
        {
            temp3 = temp.next;
            temp.next = temp2;
            temp2 = temp;
            temp = temp3;
            // temp3 = temp3.next; 
            
        }
        head = temp2;
        return head;
    }
}