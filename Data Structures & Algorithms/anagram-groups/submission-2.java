class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String s : strs) {
            int[] count = new int[26];
            char[] cArray = s.toCharArray();
            for (char c : cArray) {
                count[c - 'a']++;
            }

            String key = Arrays.toString(count);
            anagrams.putIfAbsent(key, new ArrayList<>());
            anagrams.get(key).add(s);
        }

        return new ArrayList<>(anagrams.values());

    }
}
