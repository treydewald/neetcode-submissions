class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i =0; i  <numbers.length; i++){
            int diff = target-numbers[i];
            if (hm.containsKey(diff)){
                return new int[]{hm.get(diff), i+1};
            }
            hm.put(numbers[i], i+1);
        }
        return new int[]{};
    }
}
