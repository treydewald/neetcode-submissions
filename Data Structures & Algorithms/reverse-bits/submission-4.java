class Solution {
    public int reverseBits(int n) {
        int rev = 0;
        for (int i= 0; i < 32; i++){
            int bit = (n >> i) & 1;
            System.out.println(bit);
            rev += (bit << (31-i));
            System.out.println(rev);
        }
        return rev;
    }
}
