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
        if(head==null)
        return null;
        HashMap<Integer,Integer> map=new HashMap<>();
        ListNode curr=head;
        while(curr!=null){
            map.put(curr.val,map.getOrDefault(curr.val,0)+1);
            curr=curr.next;
        }
        ArrayList<Integer> list=new ArrayList<>();
        curr=head;
        while(curr!=null){
            if(map.get(curr.val)==1)
                list.add(curr.val);
            curr=curr.next;
            
        }
            if(list.isEmpty())
            return null;
            
        curr=head;
        ListNode prev=null;
        for(int i=0;i<list.size();i++){
            curr.val=list.get(i);
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
        return head;
        
    }
}