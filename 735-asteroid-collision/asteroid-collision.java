class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            while(!stack.isEmpty() && stack.peek()>0 && asteroids[i]<0 && stack.peek()<-asteroids[i]){
                stack.pop();
            }
                if(!stack.isEmpty() && stack.peek()>0 && asteroids[i]<0){
                    if(stack.peek()==-asteroids[i]){
                        stack.pop();

                    }
                }else{
                    stack.push(asteroids[i]);
                }
        }

            
            int[] ans=new int[stack.size()];
            for(int j=stack.size()-1;j>=0;j--){
                ans[j]=stack.pop();
            }
        
        return ans;
        
    }
}