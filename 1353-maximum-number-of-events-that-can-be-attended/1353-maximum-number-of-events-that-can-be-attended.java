class Solution {
    public int maxEvents(int[][] events) {
        Arrays.sort(events, Comparator.comparingInt(e->e[0]));
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();  // end date Heap
        
        
        int event = 0;
        int attended = 0;
        for (int day = 1; event< events.length || !minHeap.isEmpty(); day++) {
            
			// remove finished event. debug it.
            while (!minHeap.isEmpty() && minHeap.peek() < day) {
                minHeap.poll();
            }
            
            if (event< events.length && minHeap.isEmpty()) {
                day = Math.max(day, events[event][0]); // optimization for next event day
            }
            // add today's event . Suppose, (1,2) (1,2) adds them twice into minHeap.
            while(event < events.length &&events[event][0] == day) { 
                minHeap.add(events[event][1]);
                event++;
            }
			// dont miss the one ending first . Suppose (5,6) and (5,9), count that (5, 6) first
            if (!minHeap.isEmpty()) {
                attended ++;
                minHeap.poll();
            }
            
        }
        return attended;
    }
}