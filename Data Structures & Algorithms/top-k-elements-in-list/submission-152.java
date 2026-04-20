class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        List<Integer>[] freq =  new List[nums.length+1];
        for (int i =0; i < freq.length; i++){
            freq[i] = new ArrayList<>();
        }
        for (int i : nums){
            hm.put(i, hm.getOrDefault(i,0)+1);
        }
        for (Map.Entry<Integer, Integer> entry : hm.entrySet()){
            freq[entry.getValue()].add(entry.getKey());
        }
        int[] res = new int[k];
        int index = 0;
        for (int i = freq.length-1; i> 0 && index < k; i--){
            for (int j : freq[i]){
                res[index++] = j;
                if (index == k){
                    return res;
                }
            }
        }
        return res;
    }
}
