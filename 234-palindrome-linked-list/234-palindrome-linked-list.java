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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        Stack<Integer> stack = new Stack<Integer>();
        ListNode temp  = head;
        
        while(temp!=null)
        {
            
            // if(!stack.isEmpty() && temp.val==stack.peek())
            // {
            //     stack.pop();
            // }
            // else
            // {
            //      stack.push(temp.val);
            // }
           stack.push(temp.val);
            temp = temp.next;
        }
        while(head !=null && !stack.isEmpty()){ 
            
            if(stack.pop() != head.val) return false;
            
            else{
                head = head.next;
            }
        }
        return true;
    }
}