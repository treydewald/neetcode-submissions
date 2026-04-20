class Solution {
    public boolean isPalindrome(String s) {
        int aPointer = 0;
        int bPointer = s.length()-1;
        while (aPointer <= bPointer){
            if (!Character.isLetterOrDigit(s.charAt(aPointer))){
                aPointer++;
            } else if (!Character.isLetterOrDigit(s.charAt(bPointer))){
                bPointer--;
            } else {
                if (Character.toLowerCase(s.charAt(aPointer)) != Character.toLowerCase(s.charAt(bPointer))){
                    return false;
                }
                aPointer++;
                bPointer--;
            }
        }
        return true;
    }
}
