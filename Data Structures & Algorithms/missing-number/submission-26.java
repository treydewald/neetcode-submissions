class Solution {
    public int missingNumber(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums){
            hs.add(i);
        }
        int n = nums.length;
        for (int i= 0; i <= n; i++){
            if (!hs.contains(i)){
                return i;
            }
        }
        return -1;
        
    }
}
