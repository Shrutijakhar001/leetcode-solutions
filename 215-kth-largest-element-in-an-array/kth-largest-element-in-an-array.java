class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        int n=nums.length;
        for(int i=0;i<n;i++){
            pq.add(nums[i]);
        }
        int ans=-1;
        for(int i=0;i<k;i++){
        ans=pq.poll();
        }
        return ans;

        
    }
}