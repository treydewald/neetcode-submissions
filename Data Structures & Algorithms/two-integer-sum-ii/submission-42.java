class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int aPointer = 0;
        int bPointer = numbers.length-1;
        while (aPointer < bPointer){
            int sum = numbers[aPointer] + numbers[bPointer];
            if (sum == target){
                return new int[]{aPointer+1, bPointer+1};
            } else if (sum < target){
                aPointer++;
            } else {
                bPointer--;
            }
        }
        return new int[0];
    }
}
