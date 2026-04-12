class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] cs = s.toCharArray();

        for (int i = 0; i < cs.length/2; i++) {
            if (cs[i] != cs[cs.length-i-1])
                return false;
        }
        return true;
    }
}
