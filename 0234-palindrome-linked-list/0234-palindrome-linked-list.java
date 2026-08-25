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
      
     ListNode i=head;
     ListNode j=head;

     while(j!=null && j.next!=null){
        i=i.next;
        j=j.next.next;
     }

     ListNode prev=null;
     ListNode curr=i;
     while(curr!=null){
        ListNode next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
     }

     ListNode First=head;
     ListNode Second=prev;
    

    while(Second!=null){
        if(First.val!=Second.val){
        return false;
        }
        else{
            First=First.next;
            Second=Second.next;
        }
    }
    return true;

    }
}