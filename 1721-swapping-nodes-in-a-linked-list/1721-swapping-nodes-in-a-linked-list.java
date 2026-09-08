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
        ListNode start=head;
        ListNode end=head;
        ListNode temp=head;
        int size =0;

        for(int i=0;i<k-1;i++){
            start=start.next;
        }

        while(temp!=null){
            size++;
            temp=temp.next;
        }
        for(int i=0;i<size-k;i++){
            end=end.next;
        }

        int temp2=start.val;
        start.val=end.val;
        end.val=temp2;

        return head;
    }
}