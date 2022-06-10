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
    public ListNode removeElements(ListNode head, int val) {
        ListNode temp = head;
          if(head==null)
            {
                return head;
            }
        while(temp!=null)
        {
          if(head.val==val)
          {
              head = head.next;
          }
        
            
            else if(temp.next!=null && temp.next.val == val  )
            {
               
                temp.next = temp.next.next;
                 while(true)
                {
                    if(temp.next!=null && temp.next.val==val)
                    {
                        temp.next = temp.next.next;
                    }
                     else
                     {
                         break;
                     }
                }
            }
        // if(temp.next!=null &&temp.next.val!=val)
        // {
            temp = temp.next;
        // }
            
        }
        return head;
    }
}