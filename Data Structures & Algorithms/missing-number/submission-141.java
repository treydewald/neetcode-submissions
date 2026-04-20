class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i =0; i < nums.length; i++){
            System.out.println(i);
            System.out.println(nums[i]);
            n ^= i ^ nums[i];

        }
        return n;
    }
}
