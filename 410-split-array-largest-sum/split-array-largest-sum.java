class Solution {
    public int splitArray(int[] nums, int k) {
        

        int n=nums.length;
        if(k>n) return -1;
        int low=0,high=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,nums[i]);
            high+=nums[i];
        }
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canSplit(nums,k,mid)){
                ans=mid;
                high=mid-1;

            }else{
                low=mid+1;
            }
        }
        return ans;

    }
    private static boolean canSplit(int[]nums,int k,int mid){
        int subarray=1;
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum+nums[i]<=mid){
                sum+=nums[i];
            }else{
                subarray++;
                sum=nums[i];
            }
        }
        return subarray<=k;
    }
}