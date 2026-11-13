class Solution {
    public int majorityElement(int[] nums) {
        int freq=0;
        int candiate=0;
        for(int i=0;i<nums.length;i++){
            if(freq==0){
                candiate=nums[i];
            }
            if(nums[i]==candiate){
                freq++;

            }
            else{
                freq--;

            }
        }
            return candiate;
    }
}
        
    
    
 
