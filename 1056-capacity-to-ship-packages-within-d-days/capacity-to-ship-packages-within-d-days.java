class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i=0;i<weights.length;i++){
            low=Math.max(low,weights[i]);
            high+=weights[i];
        }
            while(low<=high){
                int cap=low+(high-low)/2;
                int curr=0;
                int day=1;
                
                for(int i=0;i<weights.length;i++){
                if(curr+weights[i]<=cap){
                    
                    
                    curr+=weights[i];
                }
                else {
                
                    day++;
                    curr=weights[i];
                }
                }
                if(day<=days){
                    high=cap-1;
                }else{
                    low=cap+1;
                }
            }
            
        return low;
        
    }
}