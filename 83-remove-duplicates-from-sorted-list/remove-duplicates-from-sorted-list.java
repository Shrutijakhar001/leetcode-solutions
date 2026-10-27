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
        if(head==null){
            return null;
        }
        
        ArrayList<Integer> list=new ArrayList<>();
        ListNode curr=head;
        while(curr!=null){
            if(list.isEmpty() || list.get(list.size()-1)!=curr.val)
                list.add(curr.val);
                curr=curr.next;
            
        }    
            curr=head;
            for(int i=0;i<list.size();i++){
                curr.val=list.get(i);
            
                
            if(i==list.size()-1)
                curr.next=null;

            else
                curr=curr.next;
            
            }


        
        return head;
    }
}