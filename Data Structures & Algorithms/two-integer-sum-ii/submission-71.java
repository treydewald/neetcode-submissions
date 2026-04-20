class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int aPointer = 0;
        int bPointer = numbers.length-1;
        for (int i =0; i < numbers.length; i++){
            if (numbers[aPointer] + numbers[bPointer] == target){
                return new int[]{aPointer+1, bPointer+1};
            } else if (numbers[aPointer] + numbers[bPointer] < target){
                aPointer++;
            } else {
                bPointer--;
            }
        }
        return new int[]{};
    }
}
