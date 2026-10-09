class Solution {
    public int minInsertions(String s) {
        int need=0;
        int insertion=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                if(need%2==1){
                    insertion++;
                    need--;
                }
                need +=2;
            } 
            else{
                need--;
                if(need<0){
                    insertion++;
                    need=1;
                }
            }           
        }
        return need+insertion;
    }

}