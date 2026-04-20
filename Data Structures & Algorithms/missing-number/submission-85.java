class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums){
            hs.add(i);
        }
        for (int i =0; i <= 32; i++){
            if (!hs.contains(i)){
                return i;
            }
        }
        return -1;
    }
}
