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
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
        {
            return head;
        }
        
        ListNode temp = head;
        ListNode temp2 = head.next;
        ListNode temp3 = temp2;
        
        while(temp2!=null)
        {
            temp.next = temp2.next;
            if(temp2.next!=null)
            {
              temp2.next = temp2.next.next;  
            }
            else
            {
                break;
            }
                
            
            temp =temp.next;
            temp2=temp2.next;
        }
        temp.next = temp3;
        
        return head;
    }
}