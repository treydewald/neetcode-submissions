class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer>[] freq = new List[nums.length+1];
        for (int i = 0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }
        for (int n :nums){
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : count.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length-1; i>0 && index < k; i--){
            //go through freq in reverse order to append to res[index++], if index == k, return res
            for (int n : freq[i]){
                res[index++] = n;
                if (index == k){
                    return res;
                }
            }
        }
        return res;
    }
}
