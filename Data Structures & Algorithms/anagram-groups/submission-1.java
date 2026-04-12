class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();

        for (String s: strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);

            String key = new String(chars); // ✅ use String as key

            List<String> ls = map.get(key);

            if (ls != null) {
                ls.add(s);
            } else {
                map.put(key, new ArrayList<>(List.of(s)));
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (List<String> value : map.values()) {
            result.add(value);
        }
        return result;
    }
}
