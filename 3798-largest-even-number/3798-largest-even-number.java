class Solution {
    public String largestEven(String s) {
        int lastEven=-1;
        for(int i=0;i<s.length();i++){
            int digit=s.charAt(i)-'0';
            if(digit%2==0){
                lastEven=i;

            }
        }
        return s.substring(0,lastEven+1);

        
    }
}