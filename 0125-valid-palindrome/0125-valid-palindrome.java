class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-zA-Z0-9]", "");
        s=s.replaceAll(" ","");
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }return true;
        
        
        
    }
}