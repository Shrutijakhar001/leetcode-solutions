class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans=Integer.MAX_VALUE;
        
        int n=nums.size();
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=nums.get(j);
            
        
        int length=j-i+1;
        if(length>=l && length<=r && sum>0){
            ans=Math.min(sum,ans);
        }
        if(length>r){
            break;
        }
            }
        }
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}