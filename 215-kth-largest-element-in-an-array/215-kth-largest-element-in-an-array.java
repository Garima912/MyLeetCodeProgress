class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q= new PriorityQueue<>(Collections.reverseOrder());
        
        for(int n: nums){
            q.add(n);
        }
        int i=0, x=0;
        while(i<k){
            x = q.poll();
            i++;
        }
        
        return x;
    }
}