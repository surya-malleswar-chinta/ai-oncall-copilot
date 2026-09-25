class Solution {
    public void reverseString(char[] s) {
        int low = 0, high = s.length - 1;
        while(low < high) {
            char ch = s[low];
            s[low++] = s[high];
            s[high--] = ch;
        }
    }
}
