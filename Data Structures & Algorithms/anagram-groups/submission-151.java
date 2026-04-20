class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();
        for (String str : strs){
            int[] index = new int[26];
            for (char c : str.toCharArray()){
                index[c-'a']++;
            }
            String key = Arrays.toString(index);
            hm.putIfAbsent(key, new ArrayList<>());
            hm.get(key).add(str);
        }
        return new ArrayList<>(hm.values());
    }
}
