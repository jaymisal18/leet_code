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
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode curr=dummy;
        ListNode temp=head;
        

    int length=0;
   

    while(temp!=null){
       
        length++;
         temp=temp.next;
    }
    if(n==length){
        head=head.next;
    }
    int index=length-n;

    
    for(int i=0;i<index;i++){
        curr=curr.next;
    }
    
    curr.next=curr.next.next;
    
    return dummy.next;
    
}
}