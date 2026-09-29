class Solution {
    public boolean isHappy(int n) {
        /* 
        // Tc = O(log n) and Sc = O(n)
        HashSet<Integer> seen=new HashSet<>();
        while(n!=1 && !seen.contains(n)){
            seen.add(n);
            n=getNext(n);
        }
        if(n==1){
            return true;
        }
        else{
            return false;
        }

    }
    public int getNext(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum +=digit*digit;
            n=n/10;
        }
        return sum;
        */

        // Space Optimized Solution
        int slow=n;
        int fast=n;

        do{
            slow=getNext(slow);
            fast=getNext(getNext(fast));
        }while(slow!=fast);
            return slow==1;
    }    
    public int getNext(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum +=digit*digit;
            n=n/10;
        }
        return sum;
    }
}