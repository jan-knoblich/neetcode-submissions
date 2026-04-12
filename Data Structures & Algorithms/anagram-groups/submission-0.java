class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();

        for (int i = 0; i < strs.length; i++) {
            Boolean added = false;
            for (List<String> ls : result) {
                if (isAnagram(ls.get(0), strs[i])) {
                    ls.add(strs[i]);
                    added = true;
                    break;
                }
            }
            if (!added)
                result.add(new ArrayList<>(List.of(strs[i])));

        }

        return result;

    }

    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length())
            return false;

        HashMap<Character, Integer> contains = new HashMap<Character, Integer>();
        
        for (char c : s.toCharArray()) {
            Integer n = contains.get(c);
            if (n != null) {
                contains.put(c, n+1);
            } else {
                contains.put(c,1);
            }
        }
        for (char c : t.toCharArray()) {
            Integer n = contains.get(c);
            if (n == null || n == 0) {
                return false;
            } else {
                contains.put(c, n-1);
            }
        }
        return true;
    }
}
