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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode curr=slow;
        ListNode prev=null;
        int maxsum=0;
        while(curr!=null){
            ListNode next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }while(prev!=null){
            int sum=head.val+prev.val;
            prev=prev.next;
            head=head.next;
             maxsum=Math.max(maxsum,sum);
        }
        return maxsum;
       
        
    }
}