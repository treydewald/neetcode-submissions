class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String s : strs){
            int[] count = new int[26];
            for (char c : s.toCharArray()){
                System.out.println("c: "+c+", a: "+'a'+", c-'a': "+(c-'a'));
                count[c-'a']++;
            }
            System.out.println("s: "+s+", count: "+Arrays.toString(count));
            String key = Arrays.toString(count);
            res.putIfAbsent(key, new ArrayList<>());
            res.get(key).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
