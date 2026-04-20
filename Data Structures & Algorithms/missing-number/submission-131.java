class Solution {
    public int missingNumber(int[] nums) {
        //14
        int n = nums.length;
        for (int i =0; i < nums.length; i++){
            n ^= nums[i] ^ i;
        }
        return n;
    }
}
