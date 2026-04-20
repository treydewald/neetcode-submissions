class Solution {
    public int hammingWeight(int n) {
        int res = 0;
        for (int i =0; i < 32; i++){
                System.out.println("Left: "+(1 << i));
                System.out.println("Right: "+(Integer.MAX_VALUE >> i));
            if ((1 << i & n ) != 0){
                System.out.println(n);
                res++;
            }
        }
        return res;
    }
}
