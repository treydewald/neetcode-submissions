class Solution {
    public int maxArea(int[] heights) {
        int aPointer = 0;
        int bPointer=  heights.length-1;
        int max = 0;
        while (aPointer < bPointer){
            if (heights[aPointer] <= heights[bPointer]){
                max = Math.max(max, heights[aPointer] * (bPointer-aPointer));
                aPointer++;
            } else {
                max = Math.max(max, heights[bPointer] * (bPointer-aPointer));
                bPointer--;
            }
        }
        return max;
    }
}
