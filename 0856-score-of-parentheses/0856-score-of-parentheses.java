class Solution {
    public int scoreOfParentheses(String s) {
        Stack<Integer> stack=new Stack<>();
        int current=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(current);
                current=0;
            }
            else if(s.charAt(i)==')'){
                int inside=current;
                int previous=stack.pop();
                if(current==0){
                    current=previous+1;
                }
                else{
                    current=previous + 2* inside;
                }
            }
        }
        return current;
    }
}