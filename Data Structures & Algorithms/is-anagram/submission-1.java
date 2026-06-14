class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false; 

        char[] tempArrayS = s.toCharArray();
        Arrays.sort(tempArrayS);

        char[] tempArrayT = t.toCharArray();
        Arrays.sort(tempArrayT);

        for (int i = 0; i < s.length(); i++) {
            if (tempArrayS[i] != tempArrayT[i]) {
                return false; 
            }
        }

        return true; 
    }
}
