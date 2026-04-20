class Solution {
    public int[] countBits(int n) {
        int[] output=  new int[n+1];
        for (int i =0; i <=n ;i++){
            output[i] = hammingWeight(i);
        }
        return output;
    }
    private int hammingWeight(int n){
        int res = 0;
        for (int i=0; i < 32; i++){
            if ((n >> i & 1) != 0){
                res++;
            }
        }
        return res;
    }
}
