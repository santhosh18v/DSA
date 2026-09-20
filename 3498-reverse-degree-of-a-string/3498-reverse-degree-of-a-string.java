class Solution {
    public int reverseDegree(String s) {
        int product=1;
        int reverseDegree=0;
        for(int i=0;i<s.length();i++){
            int digit='z'-s.charAt(i)+1;
            product=(i+1)*digit + reverseDegree;
            reverseDegree=product;
        }
        return reverseDegree;
    }
}