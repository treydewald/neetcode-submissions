class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n+1];
        for (int i =0; i <=n; i++){
            res[i] = hammingWeight(i);
        }
        return res;
    }
    private int hammingWeight(int n){
        int res = 0;
        for (int i =0; i<32; i++){
            if ((n >> i  &1) != 0){
                res++;
            }
        }
        return res;
    }
}
