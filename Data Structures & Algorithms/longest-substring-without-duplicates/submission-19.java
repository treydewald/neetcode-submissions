class Solution {
    public int lengthOfLongestSubstring(String s) {
        int aPointer = 0;
        int bPointer = 0;
        int max = 0;
        HashSet<Character> hs = new HashSet<>();
        while (bPointer < s.length()){
            if (!hs.contains(s.charAt(bPointer))){
                hs.add(s.charAt(bPointer));
                max = Math.max(max, hs.size());
                bPointer++;
            } else {
                hs.remove(s.charAt(aPointer));
                aPointer++;
            }
        }
        return max;
    }
}
