class Solution {
    public boolean isPalindrome(int x) {
        int n=x;
        int temp=0;
        while(n>0){
            int digit=n%10;
            temp=temp*10+digit;
            n=n/10;
        }
        if(temp==x){
            return true;
        }
        return false;
    }
}