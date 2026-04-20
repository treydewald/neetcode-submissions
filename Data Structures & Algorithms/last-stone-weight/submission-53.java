class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->b-a);
        for (int i : stones){
            maxHeap.offer(i);
        }
        while (!maxHeap.isEmpty()){
            if (maxHeap.size() >= 2){
                maxHeap.offer(maxHeap.poll()-maxHeap.poll());
            } else {
                return maxHeap.poll();
            }
        }
        return 0;
    }
}
