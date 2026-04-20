class Solution {
    public int[] countBits(int n) {
        //11
        int[] res = new int[n+1];
        for (int i =0; i <= n; i++){
            res[i] = hammingWeight(i);
        }
        return res;
    }
    private int hammingWeight(int n){
        int res = 0;
        for (int i =0; i < 32;i ++){
            if ((1 << i & n) != 0){
                res++;
            }
        }
        return res;
    }
}
