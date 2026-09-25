class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            String s = strs[i];
            String key = getSortedLowerCaseString(s);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(s);
        }
        return new ArrayList<>(map.values());
    }

    String getSortedLowerCaseString(String A) {
        if (A == null) return A;
        char[] Aarr = A.toCharArray();
        Arrays.sort(Aarr);
        return new String(Aarr);
    }
}

