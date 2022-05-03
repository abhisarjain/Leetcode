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
    public ListNode middleNode(ListNode head) {
        
        ListNode temp = head;
        ListNode temp2 = head;
        int count =0;
        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        }
        for(int i = 0;i<(count+1)/2;i++)
        {
            temp2 = temp2.next;
        }
        
        return temp2;
    }
}