class Solution {
    public int reverseDegree(String s) {
        int reverseDegree=0;
        for(int i=0;i<s.length();i++){
            int digit='z'-s.charAt(i)+1;
            reverseDegree=(i+1)*digit + reverseDegree;
        }
        return reverseDegree;
    }
}