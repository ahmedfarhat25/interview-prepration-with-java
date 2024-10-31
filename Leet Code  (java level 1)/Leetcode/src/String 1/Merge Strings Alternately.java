class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();
        int len1 = word1.length();
        int len2 = word2.length();
        int minLen = Math.min(len1, len2);
        for (int i = 0; i < minLen; ++i) 
        {
            str.append(word1.charAt(i)); 
            str.append(word2.charAt(i));
        }
        if (len1 > len2)  str.append(word1.substring(minLen));
        else if (len2 > len1)  str.append(word2.substring(minLen));
        return str.toString();
    }
}
