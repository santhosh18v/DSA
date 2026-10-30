class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0;

        for (int j = i; j < t.length() && i < s.length(); j++) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
        }

        return i == s.length();
    }
}