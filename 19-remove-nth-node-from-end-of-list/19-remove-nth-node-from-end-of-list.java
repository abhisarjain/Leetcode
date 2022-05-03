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
        
//         ListNode temp = head;
//         ListNode temp2 = head;
//         ListNode temp3 = head;
//         int count=0;
// //          while(temp3.next!=null)
// //         {
// //             temp3 = temp3.next;
            
// //         }
//         while(temp.next!=null)
//         {
//             temp = temp.next;
//             count++;
//         }
        // if(count==0)
        // {
        //     head=head.next;
        //     return head;
        // }
//         System.out.print(count);
//         for(int i=0;i<(count-n);i++)
//         {
//             temp2 = temp2.next;
//         }
        
//         temp2.next = temp;
//         return head;
        
//         optimized soln :
        ListNode temp = new ListNode(); 
        temp.next = head;
        ListNode fast = temp;
        ListNode slow = temp;
        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }
        
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        
        slow.next = slow.next.next;
        return temp.next;
        
    }
}