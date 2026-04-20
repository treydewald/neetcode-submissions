class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs = new HashSet<>();
        int start = 0;
        int end = 0;
        int max = 0;
        while (end < s.length()){
            if (!hs.contains(s.charAt(end))){
                hs.add(s.charAt(end));
                max = Math.max(max, hs.size());
                end++;
            } else {
                hs.remove(s.charAt(start));
                start++;
            }
        }
        return max;
    }
}
