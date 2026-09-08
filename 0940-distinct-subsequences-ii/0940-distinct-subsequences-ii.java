class Solution {
    public int distinctSubseqII(String s) {
        int mod=1000000007;
        long[] count=new long[26];
        long sum=0;
        for(char ch: s.toCharArray()){
            int index=ch-'a';
            long total=(sum+1)%mod;
            sum=(sum+total-count[index]+mod)%mod;
            count[index]=total;

        }
        return (int)sum;
        
    }
}