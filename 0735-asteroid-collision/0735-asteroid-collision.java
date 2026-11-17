class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<asteroids.length;i++){
            if(stack.isEmpty()){
                stack.push(asteroids[i]);
                continue;
            }
            boolean destroy=false;
            while(!stack.isEmpty() && stack.peek()>0 && asteroids[i]<0){
                if(Math.abs(stack.peek())<Math.abs(asteroids[i])){
                    stack.pop();
                }
                else if(Math.abs(stack.peek())==Math.abs(asteroids[i])){
                    stack.pop();
                    destroy=true;
                    break;
                }
                else{
                    destroy=true;
                    break;
                }
            }
            if(!destroy){
                stack.push(asteroids[i]);
            }
            
        }
        int [] result=new int[stack.size()];
        for(int i=stack.size()-1;i>=0;i--){
            result[i]=stack.pop();
        }
        return result;
               
    }
}