class Solution {
    public boolean checkDivisibility(int n) {
        int digitSum=0;
        int digitPro=1;
       int totalSum=0;
       int original=n;
        while(n>0){
            int digit=n%10;
             digitSum+=digit;
             digitPro*=digit;
            n=n/10;
        }
         totalSum=digitSum+digitPro;
        if(original%totalSum==0){
            return true;
        }
        return false;

        
    }
}