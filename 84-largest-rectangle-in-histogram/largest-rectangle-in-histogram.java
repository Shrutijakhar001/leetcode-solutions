class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> stack=new Stack<>();
        int maxarea=0;
        for(int i=0;i<=n;i++){
            int h;

            if(i==n){
                h=0;
            }
            else{
                h=heights[i];
            }
                while(!stack.isEmpty() && h<heights[stack.peek()]){
                   int height= heights[stack.pop()];
                   int width;
                
            if(stack.isEmpty()){
                 width=i;
            }else{
                width=i-stack.peek()-1;
            }
            int area=height*width;
            maxarea=Math.max(maxarea,area);
            
            }
            stack.push(i);
        }
        return maxarea;

        
    }
}