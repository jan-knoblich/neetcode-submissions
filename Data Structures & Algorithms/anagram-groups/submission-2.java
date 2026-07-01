class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String s1 = String.valueOf(chars);
            List<String> list = map.get(s1);
            if (list!= null) {
                list.add(s);
                map.put(s1, list);
            } else {
                map.put(s1, new ArrayList<>(Arrays.asList(s)));
            }
        }
        List<List<String>> result = new ArrayList<>(map.values());
        return result;
    }
}
