class Solution {
    public int climbStairs(int n) {
        
        if(n<=2){
            return n;
        }
        int pre0=1;
        int pre1=2;
        for(int i=3;i<=n;i++){
            int temp=pre0+pre1;
            pre0=pre1;
            pre1=temp;
        }
        return pre1;
    }
}