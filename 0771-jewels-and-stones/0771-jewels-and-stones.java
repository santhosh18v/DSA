class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> set=new HashSet<>();
        int m=jewels.length();
        int n=stones.length();
        for(int i=0;i<m;i++){
            set.add(jewels.charAt(i));
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(set.contains(stones.charAt(i))){
                count++;
            }
        }
        return count;
    }
}