class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length-1;
        for (int i =length; i>=0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i]= 0;
        }
        int[] new_number = new int[length+2];
        new_number[0] = 1;
        return new_number;
    }
}
