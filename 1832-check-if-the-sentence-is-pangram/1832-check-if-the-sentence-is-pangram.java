class Solution {
    public boolean checkIfPangram(String sentence) {
        int n=sentence.length();
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<n;i++){
            int digit=sentence.charAt(i)-'a';
            
            if(set.contains(digit)){
                continue;
            }
            set.add(digit);
        }
        if(set.size()==26){
            return true;
        }
        return false;
    }
}