class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char[] sArr = s.toCharArray();
        char[] tArr = t.toCharArray();
        Arrays.sort(sArr);
        Arrays.sort(tArr);
        int index = 0;
        for (char c : sArr){
            if (c != tArr[index++]) return false;
        }
        return true;
    }
}
