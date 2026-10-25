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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1){
            return head;
        }
        ListNode t=head;
        ListNode before=null;
        while(true){
            ListNode check=t;
            for(int i=0;i<k;i++){
                if(check==null){
                    return head;
                }
                check=check.next;
            }
        
        ListNode curr=t;
        ListNode prev=null;
        int times=k;
        while(times>0){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            times--;
        }
        if(before==null){
            head=prev;
        }else{
            before.next=prev;
        }
        t.next=curr;
        before=t;
        t=curr;
        }
        
    }
}