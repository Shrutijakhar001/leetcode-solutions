class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[] heights=new int[n];
        int maxarea=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(matrix[i][j]=='1'){
                    heights[j]+=1;

                }else{
                    heights[j]=0;
                }

            }
            maxarea=Math.max(maxarea,largestArea(heights));
        }
        return maxarea;
        
    }
    public int largestArea(int[]heights){
        int n=heights.length;
        int maxarea=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<=n;i++){
            int h;
            if(i==n){
                h=0;
            }else{
                h=heights[i];
            }
            while(!stack.isEmpty()&& h<heights[stack.peek()]){
                int height=heights[stack.pop()];
                int width;
                if(stack.isEmpty()){
                    width=i;

                }else{
                    width=i-stack.peek()-1;
                }int area=height*width;
                 
            maxarea=Math.max(area,maxarea);
            }
            stack.push(i);
        }
        return maxarea;
    }
}