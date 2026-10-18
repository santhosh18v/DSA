class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack=new Stack<>();
        int maxArea=0;
        for(int i=0;i<heights.length;i++){

            while(!stack.isEmpty() && heights[i]<heights[stack.peek()]){
                int pop=stack.pop();
                int height=heights[pop];
                int width;
                
                if(!stack.isEmpty()){
                    width=i-stack.peek()-1;
                }
                else{
                    width=i;
                }
                int area= height*width;
                maxArea=Math.max(area,maxArea);

            }
            stack.push(i);

        }
        while(!stack.isEmpty()){
            int pop=stack.pop();
            int height=heights[pop];
            int width;
            if(!stack.isEmpty()){
                width=heights.length-stack.peek()-1;
            }
            else{
                width=heights.length;
            }
            int area=height*width;
            maxArea=Math.max(area,maxArea);

        }
        return maxArea;
        
    }
}