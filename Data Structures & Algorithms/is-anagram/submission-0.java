class Solution {
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
