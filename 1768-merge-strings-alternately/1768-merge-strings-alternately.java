class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder merge= new StringBuilder();
        int i=0;
        int j=0;
        while(i<word1.length() && j<word2.length()){
            merge.append(word1.charAt(i));
            merge.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<word1.length()){
            merge.append(word1.charAt(i));
            i++;
        }
        while(j<word2.length()){
            merge.append(word2.charAt(j));
                j++;
        }
        return merge.toString();
    }
}