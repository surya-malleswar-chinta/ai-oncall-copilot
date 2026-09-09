class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char ch = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                String currentWord = strs[j];
                if (currentWord.length() <= i || currentWord.charAt(i) != ch) {
                    return sb.toString();
                } 
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}
