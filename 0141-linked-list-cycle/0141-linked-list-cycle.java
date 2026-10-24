/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        /*
        ListNode current=head;
        Set<ListNode> set=new HashSet<>();
        while(current !=null){
            if(set.contains(current)){
                return true;
            }
            set.add(current);
            current=current.next;
        }
        return false;
        */
        
        // Optimal Solution
        ListNode slow=head;
        ListNode fast=head;
        while(fast !=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }  
}