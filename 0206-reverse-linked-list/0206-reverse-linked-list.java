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
        Stack<ListNode> stack=new Stack<>();
        if(head==null){
            return null;
        }
        ListNode current=head;
        while(current!=null){
            stack.push(current);
            current=current.next;
        }
        ListNode newHead=stack.pop();
        current=newHead;
        while(!stack.isEmpty()){
            current.next=stack.pop();
            current=current.next;
        }
        current.next=null;
        return newHead;
        
    }
}