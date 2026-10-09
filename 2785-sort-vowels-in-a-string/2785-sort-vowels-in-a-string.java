class Solution {
    public static boolean isVowel(char ch){
        return "aeiouAEIOU".indexOf(ch)!=-1;
    }
    public String sortVowels(String s) {
        int n=s.length();
        char[] result=s.toCharArray();
        char[] vowels=s.toCharArray();
        int index=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                vowels[index]=s.charAt(i);
                index++;
            }
        }
        Arrays.sort(vowels,0,index);
        int j=0;
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                result[i]=vowels[j];
                j++;
            }
        }
        return new String(result);
    }
}