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
        if(head ==null) return null;
        if(head.next == null) return head;
        ListNode slowNode = head,fastNode = head.next;

        while ( fastNode != null && fastNode.next != null){

            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        if (fastNode == null)return slowNode;
        if (fastNode.next == null)return slowNode.next;
        return null;
    }
}