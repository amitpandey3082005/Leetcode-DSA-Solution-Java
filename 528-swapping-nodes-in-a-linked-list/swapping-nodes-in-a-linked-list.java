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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        // moving the fast pointer with k position 
        for(int i=0;i<k;i++){
            fast = fast.next;
        }
        // Now move both pointer by one 
        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }
        fast = head;
        // again moving to the first k-1th node from starting of the linkedlist 
        for(int i=0;i<k-1;i++){
            fast = fast.next;
        }
        // logic to swap values 
        int temp = slow.val;
        slow.val = fast.val;
        fast.val = temp;

        return head;
    }
}