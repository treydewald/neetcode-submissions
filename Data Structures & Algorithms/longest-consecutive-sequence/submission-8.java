class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int i : nums){
            numSet.add(i);
        }
        int longest = 0;
        for (int i : nums){
            if (numSet.contains(i-1)) continue;
            else {
                int length = 1;
                while (numSet.contains(i+1)){
                    length++;
                    i++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
