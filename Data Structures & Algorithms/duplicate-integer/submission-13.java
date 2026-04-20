class Solution {
    public boolean hasDuplicate(int[] nums) {
        //5
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums){
            if (hs.contains(i)){
                return true;
            } else {
                hs.add(i);
            }
        }
        return false;
    }
}
