class Solution {
    public int longestConsecutive(int[] nums) {
        //4
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums){
            hs.add(i);
        }
        int longest = 0;
        for (int i : hs){
            if (!hs.contains(i-1)){
                int length = 1;
                while (hs.contains(i+length)) length++;
                longest = Math.max(length, longest);
            }
        }
        return longest;
    }
}
