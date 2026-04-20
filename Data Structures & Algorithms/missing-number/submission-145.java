class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for (int i =0; i < nums.length; i++){
            System.out.println("i: "+i);
            System.out.println("nums[i]: "+nums[i]);
            System.out.println("i ^ nums[i]: "+(i ^ nums[i]));
            n ^= i ^ nums[i];
            System.out.println("n: "+n);
        }
        return n;
    }
}
