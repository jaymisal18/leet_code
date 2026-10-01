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
    public ListNode deleteDuplicates(ListNode head) {
        HashSet <Integer> set=new HashSet <>();
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        ListNode temp=head;

       while(temp!=null){
          if(!set.contains(temp.val)){
           curr.next=temp;
           curr=curr.next;
          }
          set.add(temp.val);
          temp=temp.next;

       }
       curr.next=null;
       return dummy.next;

        
    }
}