class Solution {
    public int missingNumber(int[] nums) {
        //8
        int n = nums.length;
        for (int i =0; i < nums.length; i++){
            n ^= i ^ nums[i];
        }
        return n;
    }
}
