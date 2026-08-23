class Solution {
    public int minSpeedOnTime(int[] dist, double hour) {
        int left=1;
        int right=10000000;
        int ans=-1;
        
        while(left<=right){
            int mid=left+(right-left)/2;
    double hours=0;
            for(int i=0;i<dist.length;i++){
                if(i==dist.length-1){
                    hours+=(double)dist[i]/mid;
                }else{
                hours+=(dist[i]+mid-1)/mid;
                }

            }
            if(hours<=hour){
                ans=mid;
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return ans;
        
    }
}