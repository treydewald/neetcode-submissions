class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs = new HashSet<>();
        while (!hs.contains(n)){
            int sum = 0;
            if (n == 1){
                return true;
            } else {
                hs.add(n);
            }
            while (n > 0){
                int cur = n%10;
                cur *= cur;
                sum += cur;
                n /=10;
            }
            n = sum;
        }
        return false;
    }
}
