class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        
        int minindex=0;
        int maxindex=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[minindex]){
                minindex=i;
            }
            if(nums[i]>nums[maxindex]){
                maxindex=i;
            }
        }
        int left=Math.min(minindex,maxindex);
        int right=Math.max(minindex,maxindex);
        int option1=right+1;
        int option2=n-left;
        int option3=(left+1 )+ (n-right);
        return Math.min(option1, Math.min(option2,option3));
    }
}