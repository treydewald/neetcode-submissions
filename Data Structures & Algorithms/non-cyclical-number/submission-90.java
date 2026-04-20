class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while (!hs.contains(n)){
            if (n == 1) return true;
            hs.add(n);
            int sum = 0;
            while (n > 0){
                int cur = n % 10;
                cur *= cur;
                n /= 10;
                sum += cur;
            }
            n = sum;
        }
        return false;
    }
}
